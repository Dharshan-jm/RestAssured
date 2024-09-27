package com.restassured.crud.without.BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Learn_toPostDataTest {
	
	@Test
	public void toPostData() {
		JSONObject object=new JSONObject();
		object.put("createdBy", "KING");
		object.put("status", "Created");
		object.put("teamSize", 0);
		object.put("projectName", "LION_Z");
		
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(object.toJSONString());
		
		Response resp = req.post("http://49.249.28.218:8091/addProject");
		resp.then().log().all();
		resp.then().assertThat().statusCode(201);
	}

}