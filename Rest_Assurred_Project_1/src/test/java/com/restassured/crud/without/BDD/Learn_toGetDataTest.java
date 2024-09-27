package com.restassured.crud.without.BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Learn_toGetDataTest {
	
	@Test
	public void toGetData() {
		Response resp = RestAssured.get("http://49.249.28.218:8091/projects");
		resp.then().assertThat().statusCode(200);
		resp.then().log().all();
	}

}
