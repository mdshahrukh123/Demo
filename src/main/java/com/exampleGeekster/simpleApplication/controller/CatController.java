package com.exampleGeekster.simpleApplication.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.exampleGeekster.simpleApplication.modules.Student;
import netscape.javascript.JSObject;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.SocketOption;

@RestController
public class CatController {
    @GetMapping(value = "/cat")
    public String getCatInfo(){
        student();
        return "This is the information about cat";
    }
    @PostMapping(value ="/cat")
    public String saveCatInfo(@RequestBody Student studentobj){
        JSONObject jsonobj = new JSONObject(studentobj);
         System.out.println(studentobj.getStudentID());
        System.out.println(studentobj.getFirstName());
        System.out.println(studentobj.getLastName());
        System.out.println(studentobj.getAge());
        System.out.println(studentobj.getGender());
        System.out.println(studentobj.getDateOfBirth());
//        String name = jsonobj.getString("name");
//        String username = jsonobj.getString("username");
//        int age = jsonobj.getInt("age");
//
//        System.out.println(name+" "+username+" "+age);

//        System.out.println(jsonobj.getInt("age"));
        return "Saved : "+studentobj ;

    }

    public void student(){

        Student studentObject =new Student();
        studentObject.setStudentID(100);
//        studentObject.setStudentID(200);
        studentObject.setFirstName("Mr.Srk");
        studentObject.setLastName("Khan");
        studentObject.setGender("male");
        studentObject.setAge(23);
        studentObject.setDateOfBirth("2000-12-15");
        studentObject.setGrade("9.9");

        System.out.println(studentObject.getStudentID());
        System.out.println(studentObject.getFirstName());
        System.out.println(studentObject.getLastName());
        System.out.println(studentObject.getGender());
        System.out.println(studentObject.getAge());
        System.out.println(studentObject.getDateOfBirth());
        System.out.println(studentObject.getGrade());
    }
}
