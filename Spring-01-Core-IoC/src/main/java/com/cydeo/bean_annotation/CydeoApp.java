package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        //create spring container
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class,ConfigAny.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);

        String str = container.getBean(String.class);
//        String asd = container.getBean(String.class);
//        System.out.println("asd = " + asd);
        int  a =container.getBean(Integer.class);
        System.out.println(str);
        ft.createAccount();
        System.out.println(a);


    }
}
