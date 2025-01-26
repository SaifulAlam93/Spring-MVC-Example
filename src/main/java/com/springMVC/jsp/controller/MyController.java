package com.springMVC.jsp.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springMVC.jsp.model.Student;
import com.springMVC.jsp.service.StudentService;

@Controller
public class MyController {

	@Autowired
	public StudentService studentService;

	@GetMapping("/")
	public String getData(Model model) {

		System.out.println("Start time " + new Date());

		Long startTime = new Date().getTime();
		Long endTime = 0l;

		List<Student> stuList = new ArrayList<>();
		stuList = studentService.getData();
		model.addAttribute("list", stuList);

		endTime = new Date().getTime();
		System.out.println("Start time " + startTime);
		System.out.println("End time " + endTime);
		System.out.println("Taked Time " + (endTime - startTime));

		return "view/index";
	}

	@GetMapping("/form")
	public String viewForm(Model model) {
		model.addAttribute("command", new Student());
		return "jsp/add_form";
	}

	@PostMapping("/save-student")
	public String saveStaff(@ModelAttribute Student student) {
		studentService.save(student);
		return "redirect:/";
	}

	@GetMapping("/student-delete/{id}")
	public String deleteStaff(@PathVariable("id") Long id) {
		studentService.deleteData(id);
		return "redirect:/";
	}

	@GetMapping("/student-update/{id}")
	public String getStaff(@PathVariable("id") Long id, Model model) {
		Student student = studentService.getDataByID(id);
		model.addAttribute("command", student);
		return "jsp/add_form";
	}

//@GetMapping("/student-update/{id}")
//public ModelAndView getStaff(@PathVariable("id") Long id) {
//    ModelAndView mav = new ModelAndView("jsp/add_form");
//    Student student = studentService.getDataByID(id);
//    mav.addObject("command", student);
//    return mav;
//}

}
