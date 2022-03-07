package cn.jason.jing.service;

import java.util.List;

import cn.jason.jing.domain.ExpressElem;
import cn.jason.jing.domain.Result;
import cn.jason.jing.service.impl.ExpressElemServiceImpl;

public interface TwentyFourPointGameService {

	public void adjustExpElem(ExpressElem a[], ExpressElem arr[], int i, int j,
			ExpressElem e);
	
	
	public String gameCalc(ExpressElem a[], int total);
	public void saveResult(Result res);
	public List<Result> SelectAllResult();
}


