

function subReq(){
	if(document.myform.str.value==""){
		alert("the array is empty!");
		document.myform.str.focus();
		return false;
	}else if(document.myform.value.value==""){
		alert("value is empty!");
		document.myform.value.focus();
		return false; 
	}
	var str = document.myform.str.value;
	var value = document.myform.value.value;
	var url = "/24PointGame_SSM/GameController/PlayGame?str="+str+"&value="+value;
	var res = null;
	var xhr=window.XMLHttpRequest?new XMLHttpRequest():new ActiveXObject("microsoft.xmlhttp");
	xhr.open("GET",url,true);
	xhr.onreadystatechange=function(){
		  if(4==xhr.readyState){
		     if(200==xhr.status){
		     	res = xhr.responseText;		   
		     	document.getElementById("result").value = res;
		     }else 
		    	 alert('wrong'+xhr.responseText);
		  }
	};
	xhr.send(null);	
}
	