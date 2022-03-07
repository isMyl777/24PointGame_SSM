package cn.jason.jing.mapper;

import java.util.List;


import cn.jason.jing.domain.Result;



public interface ResultMapper {

	public void InsertResult(Result result);
	
	
	public List<Result> selectAllResult();
}
