package kr.co.otj.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import kr.co.otj.beans.CodeDetailBean;

@Mapper
public interface CodeDeatilMapper {
	
	
	@Select(
			"select * from code_detail"
			)
	ArrayList<CodeDetailBean> getAllDeatail();
}
