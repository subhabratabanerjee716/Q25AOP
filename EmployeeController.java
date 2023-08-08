package Q25.iNeuron.SpringAOP.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Q25.iNeuron.SpringAOP.Entity.Employee;
import Q25.iNeuron.SpringAOP.Service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	@GetMapping("/add/employee")
	public Employee addEmployee(@RequestParam("empId") String empId,@RequestParam("firstName") String firstName,@RequestParam("secondName") String secondName){
		
		return empService.createEmp(empId,firstName,secondName);
		
		
	}
	
}
