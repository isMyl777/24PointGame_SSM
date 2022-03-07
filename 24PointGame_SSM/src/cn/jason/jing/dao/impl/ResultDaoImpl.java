package cn.jason.jing.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.jason.jing.dao.ResultDao;
import cn.jason.jing.domain.Result;

public class ResultDaoImpl extends SqlSessionDaoSupport implements ResultDao{

	
	public int saveResult(Result res){
		int i =this.getSqlSession().insert("cn.jason.jing.mapper.ResultMapper.InsertResult", res);
		return i;
	}

	public List<Result> getResultList(){
		return this.getSqlSession().selectList("cn.jason.jing.mapper.ResultMapper.SelectAllResult");
	}
}
