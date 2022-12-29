package q67;

public class Employee {
	
	private String firstName;
	private String lastName;

	public Employee(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
}
