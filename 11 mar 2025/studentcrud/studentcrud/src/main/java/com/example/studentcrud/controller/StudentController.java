package com.example.studentcrud.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.studentcrud.service.StudentService;

import ch.qos.logback.core.model.Model;


@Controller
@RequestMapping("/sudeep")
public class StudentController{
    @Autowired
    private StudentService studentservice;

    @GetMapping("/list")
    public String list(Model model) {
        return "student/index";
    }
}