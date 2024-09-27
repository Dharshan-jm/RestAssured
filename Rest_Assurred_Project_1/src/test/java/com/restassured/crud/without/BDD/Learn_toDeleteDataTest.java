package com.restassured.crud.without.BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Learn_toDeleteDataTest {
	
	@Test
	public void toDeleteData() {
		
		Response resp = RestAssured.delete("http://49.249.28.218:8091/project/NH_PROJ_2859");
	     resp.then().log().all();
	     resp.then().assertThat().statusCode(204);
	}

}
