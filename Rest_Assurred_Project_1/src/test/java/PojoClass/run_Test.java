package PojoClass;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

class Project {

	private String projectName;
	private String projectstatus;
	private int teamsize;
	List<String> teamMembers;
	ProjectManager proObject;

	public Project(String projectName, String projectstatus, int teamsize, List<String> teamMembers,
			ProjectManager proObject) {
		super();
		this.projectName = projectName;
		this.projectstatus = projectstatus;
		this.teamsize = teamsize;
		this.teamMembers = teamMembers;
		this.proObject = proObject;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectstatus() {
		return projectstatus;
	}

	public void setProjectstatus(String projectstatus) {
		this.projectstatus = projectstatus;
	}

	public int getTeamsize() {
		return teamsize;
	}

	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}

	public List<String> getTeamMembers() {
		return teamMembers;
	}

	public void setTeamMembers(List<String> teamMembers) {
		this.teamMembers = teamMembers;
	}

	public ProjectManager getProObject() {
		return proObject;
	}

	public void setProObject(ProjectManager proObject) {
		this.proObject = proObject;
	}

}

class ProjectManager {

	private String name;
	private String empid;

	public ProjectManager(String name, String empid) {
		super();
		this.name = name;
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

}

public class run_Test {
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		List<String> list=new ArrayList<>();
		list.add("rahul");
		list.add("rohit");
		list.add("virat");
		
		ProjectManager manager=new ProjectManager("dharshan", "EMP01");
		
		Project pro=new Project("DEMO_1", "CREATED", 10, list, manager);
		System.out.println(pro.getProObject());
		System.out.println(pro.getProjectName());
		
		//converting back to json file
		ObjectMapper object=new ObjectMapper();
		object.writeValue(new File("./demojson.json"), pro);
		
	}

}
