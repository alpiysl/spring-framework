package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class CarController {

    @RequestMapping("/info") //http://localhost:8080/car/info?make=BMW&year=2021
    public String carInfo(@RequestParam String make, @RequestParam Integer year, Model model) {
        System.out.println("make = " + make);
        System.out.println("year = " + year);
        model.addAttribute("make", make);
        model.addAttribute("year", year);
        return "car/car-info";
    }

    @RequestMapping("/info2") //if we dont pass param -> //http://localhost:8080/car/info2
    public String carInfo2(@RequestParam(value = "make", required = false, defaultValue = "no car") String make, Model model) {
        System.out.println("make = " + make);
        model.addAttribute("make", make);
        return "car/car-info";
    }

    @RequestMapping("/info/{make}/{year}")
    public String getCar(@PathVariable String make, @PathVariable Integer year, Model model) {
        model.addAttribute("make", make);
        model.addAttribute("year", year);
        return "car/car-info";
    }

    @RequestMapping("/info/{make}")
    public String getCar2(@PathVariable String make, Model model) {
        model.addAttribute("make", make);
        return "car/car-info";
    }

}
