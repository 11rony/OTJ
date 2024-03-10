package kr.co.otj.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.otj.beans.EmployeeBean;
import kr.co.otj.mapper.EmployeeMapper;
import kr.co.otj.service.UserService;


@Repository
public class UserDao {
	
	@Autowired
	EmployeeMapper employeeMapper;
	
	public EmployeeBean getLoginUserInfo(EmployeeBean tempLoginEmployeeBean) {
		return employeeMapper.getLoginUserInfo(tempLoginEmployeeBean);
	}
	
}
