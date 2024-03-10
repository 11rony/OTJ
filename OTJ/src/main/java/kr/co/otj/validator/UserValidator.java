package kr.co.otj.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import kr.co.otj.beans.EmployeeBean;

public class UserValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return EmployeeBean.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		EmployeeBean employeeBean = (EmployeeBean) target;
		String beanName = errors.getObjectName();
		
		System.out.println(beanName);
		
		if(beanName.equals("tempLoginEmployeeBean")){		
			if(employeeBean.getEmp_id()==null 
					|| employeeBean.getEmp_id().isEmpty()) {
				errors.rejectValue("emp_id", "idEmpty");
			}			
			else if(employeeBean.getEmp_pw()==null 
					|| employeeBean.getEmp_pw().isEmpty()) {
				errors.rejectValue("emp_pw", "pwEmpty");
			}
		}
		
		
	}
	
	
}
