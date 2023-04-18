/**
 *  add.html 사용자 입력값 검증
 *  num1, num2 숫자인지 확인하기
 */
const form = document.querySelector("form");
form.addEventListener("submit",(e)=>{
	e.preventDefault();
	
	const num1 = document.querySelector("#num1");
	const num2 = document.querySelector("#num2");
	
	if(isNaN(num1.value) || num1.value == ""){
		alert("num1 입력값을 확인해 주세요");
		num1.select();
		return;
	}else if(isNaN(num2.value) || num2.value == ""){
		alert("num2 입력값을 확인해 주세요");
		num2.select();
		return;
	}
	form.submit();
})





