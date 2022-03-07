package cn.jason.jing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.jason.jing.domain.ExpressElem;
import cn.jason.jing.domain.Result;
import cn.jason.jing.mapper.ResultMapper;
import cn.jason.jing.service.TwentyFourPointGameService;
import cn.jason.jing.service.impl.ExpressElemServiceImpl;

public class TwentyFourPointGameServiceImpl  extends ExpressElemServiceImpl implements
		TwentyFourPointGameService {

	//注入DAO实例，切记
	@Autowired
	private ResultMapper resultMapper;
	
	@Override
	public void adjustExpElem(ExpressElem[] a, ExpressElem[] arr, int i, int j,
			ExpressElem e) {
		int l = 0;
		for (int k = 0; k < a.length; k++) {
			if (k != i && k != j) {
				arr[l].str = a[k].str;
				arr[l].value = a[k].value;
				l++;
			}
		}
		arr[l].str = e.str;
		arr[l].value = e.value;
	}

	
	public String gameCalc(ExpressElem[] a, int total) {
		if (a.length == 1) {
			if(a[0].value==(double)total){
				return a[0].str;
			} else {
				return null;
			}
		}
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				for (int k = 0; k < 6; k++) {
					ExpressElemServiceImpl t = new ExpressElemServiceImpl();
					ExpressElem e = new ExpressElem();
					e = t.operations(a[i], a[j], k);
					ExpressElem arr[] = new ExpressElem[a.length - 1];
					t.initeExp(arr, a.length - 1);
					adjustExpElem(a, arr, i, j, e);
					String str = gameCalc(arr, total);
					if (str != null) {
						return str;
					}
				}
			}
		}
		return null;
	}


	@Override
	public void saveResult(Result res) {
		resultMapper.InsertResult(res);
	}


	@Override
	public List<Result> SelectAllResult() {
		
		return resultMapper.selectAllResult();
	}

}



