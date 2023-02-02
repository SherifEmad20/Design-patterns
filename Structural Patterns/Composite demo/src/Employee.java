import java.util.*;

public class Employee {

	private String name;
	private String department;
	private double salary;
	private List<Employee> subordinates;

	public Employee(String name, String department, double salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.subordinates = new ArrayList<Employee>();
	}

	public void addEmployeeSubordinates(Employee employee) {
		this.subordinates.add(employee);
	}

	public void removeEmployeeSubordinates(Employee employee) {
		this.subordinates.remove(employee);
	}

	public List<Employee> getSubordinates() {
		return this.subordinates;
	}

	public String toString() {
		return ("Employee :[ Name : " + name + ", dept : " + department + ", salary :" + salary + " ]");
	}

}
