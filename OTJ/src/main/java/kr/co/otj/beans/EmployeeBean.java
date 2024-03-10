package kr.co.otj.beans;

import javax.persistence.Entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class EmployeeBean {
	private int emp_num;
	private String emp_id;
	private String emp_pw;
	private String emp_name;
	private String emp_birth;
	private String gender_cd;
	private String emp_enter_date;
	private String rank_cd;
	private String skill_rank_cd;
	private String work_status_cd;
	private String emp_photo;
	private String emp_phoneNum;
	private String emp_addr;
	
	private boolean loginCheck;
	

}






