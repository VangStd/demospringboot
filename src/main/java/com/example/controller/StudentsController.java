/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.controller;

import com.example.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author kyqua
 */
@Controller
public class StudentsController {

    @GetMapping("/form-input")
    public String callForm(Model model) {
        String str[] = {"Male", "Female"};
        Student std = new Student();
        model.addAttribute("student", std);
        model.addAttribute("list", str);
        return "form-Input";
    }

    @PostMapping("/submit-form")
    public String submitForm(@ModelAttribute("student") Student student) {
        return "result";
    }
}
