package kr.co.otj.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.otj.beans.EmployeeBean;
import kr.co.otj.service.UserService;
import kr.co.otj.validator.UserValidator;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
	@Resource(name="loginUserBean")
	EmployeeBean loginUserBean;
	
	@Autowired
	UserService userService;
	
	@GetMapping("/login")
	public String login(@ModelAttribute("tempLoginEmployeeBean") EmployeeBean tempLoginEmployeeBean,
			@RequestParam(value="loginFail", defaultValue = "false") boolean loginFail,
			Model model) {

		model.addAttribute("loginFail", loginFail);
		return "user/login";
	}
	
	
	@PostMapping("/login_pro")
	public String login_pro(@Valid @ModelAttribute("tempLoginEmployeeBean") EmployeeBean tempLoginEmployeeBean,
			BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			return "user/login";
		}
		
		userService.getLoginUserInfo(tempLoginEmployeeBean);
			
		if(loginUserBean.isLoginCheck()!=true) {
			tempLoginEmployeeBean = new EmployeeBean();
			boolean loginFail = true;
			
			model.addAttribute("tempLoginEmployeeBean", tempLoginEmployeeBean);
			model.addAttribute("loginFail", loginFail);
			
			return "user/login";
		}
		else {
			return "user/login_success";		
		}
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		UserValidator Vaildator = new UserValidator();
		binder.addValidators(Vaildator);
	}
}
