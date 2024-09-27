package dummy;

import org.testng.annotations.Test;

//important line
import static io.restassured.RestAssured.*;

public class MethodChaining {
	
	@Test
	
	public void getRequest() {
		
		//static method
		get("https://reqres.in/api/users?page=2").then().log().all();
	}

}
