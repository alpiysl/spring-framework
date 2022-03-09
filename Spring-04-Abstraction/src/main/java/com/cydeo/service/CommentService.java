package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRespository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    private final CommentRespository commentRespository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRespository commentRespository, @Qualifier("push") CommentNotificationProxy commentNotificationProxy) {
        this.commentRespository = commentRespository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void  publishComment(Comment comment){
        commentRespository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
