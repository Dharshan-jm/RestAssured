package ResponseValidation;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Learn_VerifyResponseHeaderTest {
	
	@Test
	public void verifyheader() {
		
		 Response resp = given()
		.get("http://49.249.28.218:8091/project/NH_PROJ_943");
		 
		 resp.then().log().all();
		 
		 //validate for content type
		 resp.then().assertThat().contentType(ContentType.JSON);
		 
		 
		 //validation for status line
		 resp.then().assertThat().statusLine("HTTP/1.1 200 ");
		 
		 //validation for status code
		 resp.then().assertThat().statusCode(200);
		 
		 
		 //validation for key 
		 resp.then().assertThat().header("Transfer-Encoding", "chunked");
		 
		 
		 
		
	}

}
