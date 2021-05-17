package com.Student;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

public class Studentpojo {

	private String username;

	private String password;

	private List<Integer> sessionid;
    List<Students> Student;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Integer> getSessionid() {
		return sessionid;
	}
	public void setSessionid(List<Integer> sessionid) {
		this.sessionid = sessionid;
	}
	public List<Students> getStudents()
		{
			return Student;
		}
	public  void setStudents(List<Students> Student)
		{
			 this.Student=Student;

		}
	
	}
	





