package kr.co.otj.beans;

public class ProjectEmployeeBean {
	private int pro_emp_num;
	private int pro_num;
	private int emp_num;
	private String role_cd;
	private String input_date;
	private String pullout_date;
	
	
	public int getPro_emp_num() {
		return pro_emp_num;
	}
	public void setPro_emp_num(int pro_emp_num) {
		this.pro_emp_num = pro_emp_num;
	}
	public int getPro_num() {
		return pro_num;
	}
	public void setPro_num(int pro_num) {
		this.pro_num = pro_num;
	}
	public int getEmp_num() {
		return emp_num;
	}
	public void setEmp_num(int emp_num) {
		this.emp_num = emp_num;
	}
	public String getRole_cd() {
		return role_cd;
	}
	public void setRole_cd(String role_cd) {
		this.role_cd = role_cd;
	}
	public String getInput_date() {
		return input_date;
	}
	public void setInput_date(String input_date) {
		this.input_date = input_date;
	}
	public String getPullout_date() {
		return pullout_date;
	}
	public void setPullout_date(String pullout_date) {
		this.pullout_date = pullout_date;
	}
}
