package kr.co.otj.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import kr.co.otj.beans.EmployeeBean;


@Mapper
public interface EmployeeMapper {
	//로그인 시도
	@Select("select * from employee where emp_id= #{emp_id} and emp_pw = #{emp_pw}")
	EmployeeBean getLoginUserInfo(EmployeeBean tempLoginEmployeeBean);
	
	@Select(
			"SELECT  "
			+ "    EMP_NO, "
			+ "    EMP_ID, "
			+ "    EMP_PW, "
			+ "    EMP_NAME, "
			+ "    EMP_BIRTH, "
			+ "    c1.detail_cd_nm as gender_cd, "
			+ "    EMP_ENTER_DATE, "
			+ "    c2.detail_cd_nm as rank_cd, "
			+ "    c3.detail_cd_nm as skill_rank_cd, "
			+ "    c4.detail_cd_nm as work_status_cd, "
			+ "    emp_photo, "
			+ "    emp_phonenum, "
			+ "    emp_email, "
			+ "    emp_addr "
			+ " FROM EMPLOYEE e "
			+ " INNER JOIN code_detail c1 on c1.domain_cd = 'GD01' and c1.detail_cd = e.gender_cd "
			+ " INNER JOIN code_detail c2 on c2.domain_cd = 'RK01' and c2.detail_cd = e.rank_cd "
			+ " INNER JOIN code_detail c3 on c3.domain_cd = 'SG01' and c3.detail_cd = e.skill_rank_cd "
			+ " INNER JOIN code_detail c4 on c4.domain_cd = 'WS01' and c4.detail_cd = e.work_status_cd")
	ArrayList<EmployeeBean> getAllEmployee();
}
	

