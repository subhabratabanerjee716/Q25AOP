package Q25.iNeuron.SpringAOP.Entity;

public class Employee {
	
	private String empId;
	
	private String firstName;
	
	private String secondName;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empId, String firstName, String secondName) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId2) {
		this.empId = empId2;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	

}
