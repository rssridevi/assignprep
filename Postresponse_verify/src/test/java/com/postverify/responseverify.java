package com.postverify;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.path.json.JsonPath;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class responseverify {
@Test
public void verify()
	{
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		given()
		.when().get("/posts");		
		Response res=when().get("/posts");
		res.prettyPrint();
		String resp=res.body().asString();
		Assert.assertEquals(resp.contains("7"),true);
		JsonPath path=new JsonPath(resp);
	
			/*List<Integer> temp=path.getList("userId");
			Iterator<Integer> it=temp.iterator();
			while(it.hasNext())
			{	
			 if(it.next()==7)*/
		for(int i=60;i<70;i++)
			 {
				 String title=path.getString("title["+i+"]");
				 System.out.println(title);

					/*
					 * List<String> title=path.getList("title"); for(String s:title) {
					 * System.out.println("\n" +s +"\n"); }
					 */		
			 }
		}
	}
	


