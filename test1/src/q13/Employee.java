package q13;

public class Employee {

	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) { // line n1
		boolean result = false;
		Employee employee = (Employee) obj;
		if (this.name.equals(employee.name)) {
			result = true;
		}
		return result;
	}
}
