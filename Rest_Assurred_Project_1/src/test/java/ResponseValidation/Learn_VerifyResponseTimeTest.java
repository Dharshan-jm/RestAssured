package ResponseValidation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class Learn_VerifyResponseTimeTest {

	@Test
	public void responseTime() {
		Response resp = given().get("http://49.249.28.218:8091/project/NH_PROJ_943");

		resp.then().log().all();
        
		// To display in form of mili-seconds
		long timetaken = resp.time();
		System.out.println(timetaken);

		// To display in form of seconds
		long timetakenSec = resp.timeIn(TimeUnit.SECONDS);
		System.out.println(timetakenSec);
		
		//validation using miliseconds
		resp.then().assertThat().time(Matchers.lessThan(900L));
		
		//cross verify validation
		resp.then().assertThat().time(Matchers.both(Matchers.lessThan(900L)).and(Matchers.greaterThan(200L)));
	}

}
