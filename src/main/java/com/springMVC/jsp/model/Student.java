package com.springMVC.jsp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Student {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String rollNo;
	    private String emailId;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getRollNo() {
			return rollNo;
		}
		public void setRollNo(String rollNo) {
			this.rollNo = rollNo;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", rollNo=" + rollNo + ", emailId=" + emailId + "]";
		}
	    
	    

}
