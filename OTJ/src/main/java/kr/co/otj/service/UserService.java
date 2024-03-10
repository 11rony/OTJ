package kr.co.otj.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.otj.beans.EmployeeBean;
import kr.co.otj.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	@Resource(name = "loginUserBean")
	private EmployeeBean loginUserBean;
	
	public void getLoginUserInfo(EmployeeBean tempLoginEmployeeBean) {
		EmployeeBean checkLoginUserBean = userDao.getLoginUserInfo(tempLoginEmployeeBean);
	
		if(checkLoginUserBean!=null) {
			loginUserBean.setEmp_num(checkLoginUserBean.getEmp_num());
			loginUserBean.setEmp_id(checkLoginUserBean.getEmp_id());
			loginUserBean.setEmp_pw(checkLoginUserBean.getEmp_pw());
			loginUserBean.setEmp_name(checkLoginUserBean.getEmp_name());
			loginUserBean.setLoginCheck(true);
		}
	}
}
