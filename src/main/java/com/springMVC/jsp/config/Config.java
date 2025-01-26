package com.springMVC.jsp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Config implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/*.css").addResourceLocations("/WEB-INF/assets/css/");
        registry.addResourceHandler("/*.js").addResourceLocations("/WEB-INF/assets/");

    }
    
//@GetMapping("/")
//public ModelAndView getAllStudents() {
//    ModelAndView mav = new ModelAndView("index");
//    List<Student> studentList = studentService.getAll();
//    mav.addObject("students", studentList);
//    return mav;
//}
//
//@GetMapping("/add-student")
//public ModelAndView addStudent() {
//    ModelAndView mav = new ModelAndView("add_student");
//    mav.addObject("command", new Student());
//    return mav;
//}
//
//@PostMapping("/save-student")
//public String saveStaff(@ModelAttribute Student student) {
//    studentService.save(student);
//    return "redirect:/";
//}
//
//@GetMapping("/student-update/{id}")
//public ModelAndView getStaff(@PathVariable("id") Integer id) {
//    ModelAndView mav = new ModelAndView("add_student");
//    Student student = studentService.getById(id);
//    mav.addObject("command", student);
//    return mav;
//}
//
//@GetMapping("/student-delete/{id}")
//public String deleteStaff(@PathVariable("id") Integer id) {
//    Student deleteStaff = studentService.getById(id);
//    studentService.delete(deleteStaff);
//    return "redirect:/";
//}
}
