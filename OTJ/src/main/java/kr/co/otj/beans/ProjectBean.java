package kr.co.otj.beans;

public class ProjectBean {
	private int pro_num;
	private String pro_name;
	private String customer_cd;
	private String Start_date;
	private String end_date;
	
	
	public int getPro_num() {
		return pro_num;
	}
	public void setPro_num(int pro_num) {
		this.pro_num = pro_num;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public String getCustomer_cd() {
		return customer_cd;
	}
	public void setCustomer_cd(String customer_cd) {
		this.customer_cd = customer_cd;
	}
	public String getStart_date() {
		return Start_date;
	}
	public void setStart_date(String start_date) {
		Start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
}
