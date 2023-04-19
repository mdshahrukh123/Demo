package com.exampleGeekster.simpleApplication.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @GetMapping(value ="/student")
    public String getStudent(){

        return "This is the information about student";
    }
    @PostMapping(value ="/student")
    public String saveStudent()
    {
        return "This is the information about student saved";
    }
    @PutMapping(value ="/student")
    public String updateStudent(){
        return "This is the information about student updated";
    }
    @DeleteMapping(value ="/student")
    public String deleteStudent(){
        return "This is the information about student deleted";
    }
}
