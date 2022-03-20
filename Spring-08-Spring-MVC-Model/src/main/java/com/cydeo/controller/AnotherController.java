package com.cydeo.controller;

import com.cydeo.Enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/another")
public class AnotherController {

    @RequestMapping("/list") // now we will have http://localhost:8080/another/list
    public String showTable(Model model) {
        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Alpi", "YSL", 33, Gender.MALE));
        mentorList.add(new Mentor("Alpi", "YSL", 33, Gender.MALE));
        mentorList.add(new Mentor("Alpi", "YSL", 33, Gender.MALE));
        mentorList.add(new Mentor("Alpi", "YSL", 33, Gender.MALE));
        model.addAttribute("mentors", mentorList);
        return "mentor/mentor-list";
    }
}
