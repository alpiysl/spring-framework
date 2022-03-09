package com.cydeo.repository;

import com.cydeo.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRespository{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("store");
    }
}
