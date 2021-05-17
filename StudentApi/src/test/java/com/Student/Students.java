package com.Student;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonView;
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class Students {
    private int id;

	private String name;
    private List<Integer> marks;
    private List<String> contact;
     List<Addresscl> address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	public List<String> getContact() {
		return contact;
	}
	public void setContact(List<String> contact) {
		this.contact = contact;
	}
	public List<Addresscl> getAddress() {
		return address;
	}
	public void setAddress(List<Addresscl> address) {
		this.address = address;
	}

}
