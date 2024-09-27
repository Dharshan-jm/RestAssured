package com.restassured.crud.with.BDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Learn_GetForReadTest {
	
	
	@Test
	public void get_dataFromserver() {
	
		when()
        .get("http://49.249.28.218:8091/projects")
	
       .then()
       .assertThat().statusCode(200)
	   .log().all();
	
	}    

}
