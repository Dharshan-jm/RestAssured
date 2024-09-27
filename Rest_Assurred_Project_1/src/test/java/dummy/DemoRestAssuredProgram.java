package dummy;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DemoRestAssuredProgram {

	
	@Test
	public void demoGetRegTest() {
		
		Response resp = RestAssured.get("https://reqres.in/api/users?page=2");
		
		System.out.println(resp.prettyPrint());
	}
}
