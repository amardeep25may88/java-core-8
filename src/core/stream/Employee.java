package core.stream;

import java.util.List;

public class Employee {
	private String firstName;
	private String lastName;
	private Double salery;
	private List<String> projects;
	
	public Employee() {}
	
	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", salery=" + salery + ", projects="
				+ projects + "]";
	}

	public Employee(String firstName, String lastName, Double salery, List<String> projects) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salery = salery;
		this.projects = projects;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Double getSalery() {
		return salery;
	}
	public void setSalery(Double salery) {
		this.salery = salery;
	}
	public List<String> getProjects() {
		return projects;
	}
	public void setProjects(List<String> projects) {
		this.projects = projects;
	}
	
	
	
	
}
