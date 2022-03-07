package cn.jason.jing.service;

import cn.jason.jing.domain.ExpressElem;
import cn.jason.jing.service.impl.ExpressElemServiceImpl;


public interface ExpressElemService {

	public void initeExp(ExpressElem arr[], int length);
	
	
	public ExpressElem[] convertExpressElem(int a[]);
	
	
	
	public int getLength(String string);
	
	
	
	public int[] convertString(String string);
	
	
	
	
	public ExpressElem operations(ExpressElem left, ExpressElem right, int op);

}


