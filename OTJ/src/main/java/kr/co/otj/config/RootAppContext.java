package kr.co.otj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

import kr.co.otj.beans.EmployeeBean;


@Configuration
public class RootAppContext {
	
	@Bean("loginUserBean")
	@SessionScope
	public EmployeeBean loginUserBean() {
		return new EmployeeBean();
	}
}
