package cn.jason.jing.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
















import cn.jason.jing.dao.ResultDao;
import cn.jason.jing.domain.Card;
import cn.jason.jing.domain.Result;
import cn.jason.jing.mapper.ResultMapper;
import cn.jason.jing.service.ExpressElemService;
import cn.jason.jing.service.TwentyFourPointGameService;
import cn.jason.jing.service.impl.ExpressElemServiceImpl;
import cn.jason.jing.service.impl.TwentyFourPointGameServiceImpl;





@Controller
@RequestMapping("/GameController")
public class GameController {
	
	@Autowired
	@Qualifier("expressElemService")
	private ExpressElemService exp;
	
	@Autowired
	@Qualifier("twentyFourPointGameService")
	private TwentyFourPointGameService player;
	
	
	
	@RequestMapping(value="/PlayGame", method = RequestMethod.POST)
	public void PlayGame(Card card,Model model) {
		
		String str=card.getStr();
  		String value=card.getValue();
		System.out.println("str:"+str);
		System.out.println("value:"+value);
		String result = initGame(str,value); 
		
		
		Result res = new Result();
		List<Result> tempRes = player.SelectAllResult();
		
		res.setResno(tempRes.size()+1);
		res.setStr(str);
		res.setValue(value);
		res.setResult(result);	
		player.saveResult(res);
		
		
		
		model.addAttribute("res",res);
		
	}
	public String initGame(String str,String value){
		//ExpressElemServiceImpl exp = new ExpressElemServiceImpl();
  		int val=Integer.parseInt( String.valueOf(value));
  		int length=exp.getLength(str);
  		int a[]=new int[length];
  		//TwentyFourPointGameServiceImpl player = new TwentyFourPointGameServiceImpl();		
		
  		a=exp.convertString(str);
		String result = player.gameCalc(exp.convertExpressElem(a), val);
		if(result!=null){
			result=result+"="+val;
		}
		else{			
		} 
		System.out.println("Result:"+result);
		return result;
	}	
	
	@RequestMapping("/SelectAllResult")
	public ModelAndView SelectAllResult() {
		List<Result> resList = player.SelectAllResult();
		ModelAndView model = new ModelAndView();
		model.addObject("resList", resList);
		model.setViewName("Summary");
		return model;
	}
	
}
