package com.restassured.crud.with.BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class Learn_ToReadDataTest {

	@Test
	public void postDataToServer() {

		// create a JSON Object

		JSONObject json = new JSONObject();
		json.put("createdBy", "dharshanJm");
		json.put("status", "Created");
		json.put("teamSize", 10);
		json.put("projectName", "Orange-111");

		// 1st specify what type of data we are going to write

	    given()
	    .contentType(ContentType.JSON)
	    .body(json.toJSONString())

		// create data
	    
	    .when()
		.post("http://49.249.28.218:8091/addProject")
		
		.then()
        .log().all()
		.assertThat().statusCode(200);
	}

	// to change the data using put method()modify
	public void putDataToServer() {

		// create a JSON Object

		JSONObject json = new JSONObject();
		json.put("createdBy", "dharshanJm");
		json.put("status", "Created");
		json.put("teamSize", 10);
		json.put("projectName", "Orange-112");

		// 1st specify what type of data we are going to write

		given()
		.contentType(ContentType.JSON)
		.body(json.toJSONString())

		// create data
		.when()
		.put("http://49.249.28.218:8091/Project/NH_PROJ_013")
		
		.then()
		.log().all()
		.assertThat().statusCode(200);
	}

	// to change the data using patch method() partial update
	public void patchDataToServer() {

		// create a JSON Object

		JSONObject json = new JSONObject();
		json.put("projectName", "Orange-113");

		// 1st specify what type of data we are going to write

		given()
		.contentType(ContentType.JSON)
		.body(json.toJSONString())

		// create data
		.when()
		.patch("http://49.249.28.218:8091/Project/NH_PROJ_013")
		
		.then()
		.log().all()
		.assertThat().statusCode(200);
	}
	
	// to delete data using delete method
		public void deleteDataToServer() {
			

			//create data
			when()
			.delete("http://49.249.28.218:8091/Project/NH_PROJ_013")
			
			.then()
			.log().all()
			.assertThat().statusCode(200);
			}

}
