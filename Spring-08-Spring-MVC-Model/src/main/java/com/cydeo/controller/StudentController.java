package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){
        model.addAttribute("name","Cydeo");
        model.addAttribute("course","mvc");
        String object = "Alpi";
        model.addAttribute("subj",object);
        int stId = new Random().nextInt(1000);
        model.addAttribute("id",stId);
        List<Integer> nums = Arrays.asList(4,5,7,8,9);
        model.addAttribute("num",nums);

        Student student = new Student(1,"Alpi","Ysl");
        model.addAttribute("st",student);
        return "student/welcome";
    }
}
