package q22;

public class Employee {
	
	private String name;
	private String dept;
	private String city;

	public Employee(String name, String dept, String city) {
		this.dept = dept;
		this.name = name;
		this.city = city;
	}

	public String toString() {
		return name + ":" + dept + ":" + city;
	}
}