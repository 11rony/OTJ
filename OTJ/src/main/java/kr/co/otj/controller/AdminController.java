package kr.co.otj.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.otj.beans.CodeDetailBean;
import kr.co.otj.beans.EmployeeBean;
import kr.co.otj.mapper.CodeDeatilMapper;
import kr.co.otj.mapper.EmployeeMapper;


@Controller
@RequestMapping("/adminPage")
public class AdminController {
	
	@Autowired
	EmployeeMapper employeeMapper;
	
	@Autowired
	CodeDeatilMapper codeDeatilMapper;
	
	@GetMapping("/employeeManage/main")
	public String main(Model model) {
		
		ArrayList<EmployeeBean> resultEmpBeans = employeeMapper.getAllEmployee();
		ArrayList<CodeDetailBean> searchDetailBeans = codeDeatilMapper.getAllDeatail(); 
		int totalList = resultEmpBeans.size();
		System.out.println(searchDetailBeans);
		
		model.addAttribute("resultEmpBeans",resultEmpBeans);
		model.addAttribute("searchDetailBeans", searchDetailBeans);
		model.addAttribute("totalList", totalList);
		
		return "adminPage/employeeManage/main";
	}
	
}
