package cn.jason.jing.domain;

public class Result {

	private int resno;
	private String str;
	private String value;
	private String result;
	
	public Result(){
		
	}
	public Result(int resno,String str,String value,String result){
		this.resno=resno;
		this.str=str;
		this.value=value;
		this.result=result;
	}
	
	
	public int getResno() {
		return resno;
	}
	public void setResno(int resno) {
		this.resno = resno;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	
	
	
}
