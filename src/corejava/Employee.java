package corejava;

public class Employee {

	private String firstName; // attributes
	private String lastName;
	private String designation;
	private String email;
	private long phoneNumber;
	private String location;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	Employee(String fName, String lName, String designation, String email, long phoneNumber, String location) {
		firstName = fName;
		lastName = lName;
		this.designation = designation;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.location = location;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", designation=" + designation
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", location=" + location + "]";
	}

	public static void main(String[] args) {

		Employee employee = new Employee(); // 1
		employee.firstName = "Gadi";
		employee.lastName = "Sai Chenna Kesava Naidu";
		employee.designation = "Analyst";
		employee.email = "sai@gmail.com";
		employee.phoneNumber = 9876543210L;
		employee.location = "Hyderabad";

		//System.out.println(employee);

		Employee employee2 = new Employee("Pavan", "Phanindra", "Analyst", "pavan@gamil.com", 9876567890L,
				"Bangolaore"); // 2
		
		Employee employee3 = new Employee("Jeevana", "Sree", "Analyst", "jeevana@gamil.com", 9871234590L,
				"Chennai");

		Employee[] employee_details; // declaration of an object array
		employee_details = new Employee[3];
		employee_details[0] = employee;
		employee_details[1] = employee2;
		employee_details[2] = employee3;
		
		System.out.println("Names Of the Employees: ");
		System.out.println("=========================");
		for(Employee emp: employee_details) {
			System.out.println(emp.firstName+" "+emp.lastName);
		}
		
		System.out.println("Employees with Complete Details: ");
		System.out.println("=========================");
		for(Employee emp: employee_details) {
			System.out.println(emp);
		}

	}

}
