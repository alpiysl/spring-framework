package com.cydeo.controller;

import com.cydeo.Enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @RequestMapping("/list") // http://localhost:8080/mentor/list
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
