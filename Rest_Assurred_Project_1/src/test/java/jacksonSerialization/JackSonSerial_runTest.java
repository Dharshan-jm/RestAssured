package jacksonSerialization;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonPropertyOrder(
	value= {  "createdBy",
			   "project_name",
			   "status",
			   "teamSize",			
	}
)

@JsonIgnoreProperties(
		value= {
				"teamSize"
		},allowSetters = true
		)

class Project{
	
	private String project_name;
	
	@JsonProperty(value="created by")
	private String createdBy;
	private int teamSize;
	private String status;
	
	//empty constructor
	private Project() {}
	
	public Project(String project_name, String createdBy, int teamSize, String status) {
		super();
		this.project_name = project_name;
		this.createdBy = createdBy;
		this.teamSize = teamSize;
		this.status = status;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
public class JackSonSerial_runTest {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		Project pro=new Project("echo_1", "dharshan", 10,"created");
		
		ObjectMapper mapper=new ObjectMapper();
		mapper.writeValue(new File("./project.json"),pro);
		System.out.println("--------------------");

	}

}
