package Q25.iNeuron.SpringAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAspect {

	@After(value = "execution(* Q25.iNeuron.SpringAOP.Service.EmployeeService.*(..)) and args(empId,fname,sname)")
	public void beforeAspect(JoinPoint joinpoint,String empId,String fname,String sname) {
		
		System.out.println("Before method"+ joinpoint.getSignature());
		
		System.out.println("Creating Employee with firstname "+ fname+ " secondname "+ sname);
	}
	
}
