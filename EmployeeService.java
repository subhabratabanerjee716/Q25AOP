package Q25.iNeuron.SpringAOP.Service;

import org.springframework.stereotype.Component;

import Q25.iNeuron.SpringAOP.Entity.Employee;

@Component
public class EmployeeService {

	public Employee createEmp(String empId, String firstName, String secondName) {
	
		Employee e= new Employee();
		
		e.setEmpId(empId);
		e.setFirstName(firstName);
		e.setSecondName(secondName);
		
		return e;
	}

}
