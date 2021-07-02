package com.sparta.week01.controller;

import com.sparta.week01.prac.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/person")
    public Person getCourses() {
        Person p = new Person();
        p.setName("김진태");
        p.setAdrress("서울");
        p.setEmail("swcide@gmail.com");
        p.setPhone("010-9101-4044");
        p.setAge(21);

        return p;
    }
}
