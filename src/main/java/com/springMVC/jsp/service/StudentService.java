package com.springMVC.jsp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.springMVC.jsp.model.Student;
import com.springMVC.jsp.repository.StudentRepo;

//@Service

@org.springframework.stereotype.Service
public class StudentService {

	@Autowired
	public StudentRepo repo;

	public List<Student> getData() {
		
		return repo.findAll();
	}

	public Student getDataByID(Long id) {
		return repo.findById(id).get();
	}
	
	public Student getDataByName(String name) {
		return repo.findByName(name).get();
	}

	public Student save(Student stu) {
		return repo.save(stu);
	}
	
	public Boolean deleteData(Long id) {
		Optional<Student> stu = repo.findById(id);
		
		if (stu.isPresent()) {
			 repo.deleteById(id);
			 return true;
		}else {
			 return false;
		}
	}

}
