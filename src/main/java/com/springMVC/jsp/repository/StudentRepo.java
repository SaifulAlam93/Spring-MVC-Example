package com.springMVC.jsp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springMVC.jsp.model.Student;



@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{
	Optional<Student> findByName(String name);
}
