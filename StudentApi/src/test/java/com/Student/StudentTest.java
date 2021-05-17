package com.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class StudentTest {
	Studentpojo spojo;
	StudentTest(){
		spojo=new Studentpojo();
}
	
	
	@Test
	public void jsonparse() throws JsonGenerationException, JsonMappingException, IOException
	{
		spojo.setUsername("aa@m.com");
		spojo.setPassword("12xyz");
		List<Integer> sessionid=new ArrayList<Integer>();
		sessionid.add(12);
		sessionid.add(23);
		sessionid.add(34);
		sessionid.add(56);
		spojo.setSessionid(sessionid);
		Students aana=new Students();
		aana.setId(112);
		aana.setName("aana");
		List<Integer> marks=new ArrayList<Integer>();
		marks.add(20);
		marks.add(25);
		marks.add(22);
		aana.setMarks(marks);
		List<String> contact=new ArrayList<String>();
		contact.add("1234");
		contact.add("3456");
		aana.setContact(contact);
		Addresscl nc=new Addresscl();
		nc.setState("nc");
		nc.setCity("abc");
		Addresscl ca=new Addresscl();
		ca.setState("ca");
		ca.setCity("xyz");
		List<Addresscl> address=new ArrayList<Addresscl>();
		address.add(nc);
		address.add(ca);
		aana.setAddress(address);
		Students banu=new Students();
		banu.setId(115);
		banu.setName("banu");
		List<Integer> marks1=new ArrayList<Integer>();
		marks1.add(20);
		marks1.add(25);
		marks1.add(22);
		banu.setMarks(marks1);
		List<String> contact1=new ArrayList<String>();
		contact1.add("4534");
		contact1.add("3456");
		banu.setContact(contact1);
		Addresscl nc1=new Addresscl();
		nc1.setState("nc");
		nc1.setCity("abc");
		Addresscl ca1=new Addresscl();
		ca1.setState("ca");
		ca1.setCity("xyz");
		List<Addresscl> address1=new ArrayList<Addresscl>();
		address1.add(nc1);
		address1.add(ca1);
		banu.setAddress(address1);
		List<Students> Student=new ArrayList<Students>();
		Student.add(aana);
		Student.add(banu);
		spojo.setStudents(Student);
		ObjectMapper o=new ObjectMapper();
		o.writeValue(new File("target/newjson.json"),spojo);
		String json=o.writeValueAsString(spojo);
		System.out.println(json);
		JsonPath path=new JsonPath(json);
		String uname=path.getString("username");
		System.out.println(uname);
		List<Integer> ssid=path.getList("sessionid");
		for(int ss:ssid)
			System.out.println("sessionid:"+ss);
		int sid=path.getInt("sessionid[3]");
		System.out.println("lastsessionid="+sid);
		List<Integer> mark=path.getList("students[1].marks");
		for(int Mark:mark)
			System.out.println("Mark="+Mark);
		String sstate=path.getString("students[0].address[1].state");
		System.out.println("secondstate:"+sstate);
		String scontact=path.getString("students[1].contact[1]");
		System.out.println("secondcontact:"+scontact);
		List<String> scity=path.getList("students[1].address.city");
		for(String seccity:scity)
		System.out.println("secondcity:"+seccity);
		for(int i=0;i<=1;i++)
		{
			List<String> acontact=path.getList("students["+i+"].contact");
		for(String allcontact:acontact)
			System.out.println("allcontacts:"+allcontact);
		}
		List  addresses=path.getList("students[0].address");
		for(Object faddress:addresses)
			System.out.println("firstaddress:"+faddress);
		
	}
	
	
	
}
