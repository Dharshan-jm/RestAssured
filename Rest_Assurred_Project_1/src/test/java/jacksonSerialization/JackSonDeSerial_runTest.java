package jacksonSerialization;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JackSonDeSerial_runTest {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper obj=new ObjectMapper();
		
		                                        //pojo class name
		Project pobj = obj.readValue(new File("./project.json"),Project.class);
		System.out.println(pobj.getProject_name());
		System.out.println(pobj.getCreatedBy());
		System.out.println(pobj.getStatus());
		System.out.println(pobj.getTeamSize());
	}

}
