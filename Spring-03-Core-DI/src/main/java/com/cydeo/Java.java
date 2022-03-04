package com.cydeo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Java {

//    @Autowired
//    OfficeHours officeHours; -> field injection

    //constructor injection
    OfficeHours officeHours;
//    @Autowired -> we don need to add after 4.3 version of spring
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    public void getTeachingHours(){
        System.out.println("Total teaching hours : " + (20+officeHours.getHours()));
    }
}
