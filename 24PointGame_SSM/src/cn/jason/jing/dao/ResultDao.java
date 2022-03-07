package cn.jason.jing.dao;

import java.util.List;

import cn.jason.jing.domain.Result;


public interface ResultDao {

	public int saveResult(Result res);
	//public int totalRes();
	public List<Result> getResultList();
}
