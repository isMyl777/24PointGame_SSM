package cn.jason.jing.service.impl;

import cn.jason.jing.domain.ExpressElem;
import cn.jason.jing.service.ExpressElemService;

public class ExpressElemServiceImpl extends ExpressElem implements ExpressElemService {

	@Override
	public void initeExp(ExpressElem[] arr, int length) {
		//初始化一个ExpressElem数组，里面的值是垃圾值
		for (int i = 0; i < length; i++) {
			//arr[i] = new ExpressElem();
			arr[i] = new ExpressElem();
		}
	}

	
	public ExpressElem[] convertExpressElem(int[] a) {
		ExpressElem[] exp = new ExpressElem[a.length];
		for (int i = 0; i < a.length; i++) {
			exp[i] = new ExpressElem();
			exp[i].value=a[i];
			exp[i].str=""+a[i];
		}
		return exp;
	}

	@Override
	public int getLength(String string) {
		if(string==null){
			return -1;
		}
		String regex=",";
		String[] strArray=string.split(regex);
		return strArray.length;
	}

	@Override
	public int[] convertString(String string) {
		if(string==null){
			return null;
		}
		String regex=",";
		String[] strArray=string.split(regex);
		int a[]=new int[strArray.length];
		for(int i=0;i<strArray.length;i++){
			a[i] = Integer.parseInt( String.valueOf(strArray[i]));
		}
		return a;
	}

	@Override
	public ExpressElem operations(ExpressElem left, ExpressElem right, int op) {
		ExpressElem e = new ExpressElem();
		switch (op) {
		case 0:
			e.value = left.value + right.value;
			e.str = "(" + left.str + "+" + right.str + ")";
			break;
		case 1:
			e.value = left.value - right.value;
			e.str = "(" + left.str + "-" + right.str + ")";
			break;
		case 2:
			e.value = right.value - left.value;
			e.str = "(" + right.str + "-" + left.str + ")";
			break;
		case 3:
			e.value = left.value * right.value;
			e.str = left.str + "*" + right.str;
			break;
		case 4:
			if (right.value != 0 ) {
				e.value = left.value / right.value;
				e.str = "(" + left.str + "/" + right.str + ")";
			}
			break;
		case 5:
			if (left.value != 0 ) {
				e.value = right.value / left.value;
				e.str = "(" + right.str + "/" + left.str + ")";
			}
			break;
		default:
			break;
		}
		return e;
	}

}











