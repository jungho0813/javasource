/**
 *  기존비밀번호, 새비밀번호, 새비밀번호확인 내용 비어있지 않도록 확인
 * 
 * 	새비밀번호와 새비밀번호확인이 동일한지 확인
 */
const form = document.querySelector("form");
form.addEventListener("submit",(e)=>{
	e.preventDefault();

 const currentPassword = document.querySelector("#floatingPassword1");
 const newPassword = document.querySelector("#floatingPassword2");
 const confirmPassword = document.querySelector("#floatingPassword3");
 

	if(!currentPassword.value){
	  alert("비밀번호를 입력해주세요")
	  currentPassword.select();
	  return;
  }else if(!newPassword.value){
	  alert("변경할비밀번호를 입력해주세요")
	  newPassword.select();
	  return;
  }else if(!confirmPassword.value){
	  alert("비밀번호확인칸을 입력해주세요")
	  confirmPassword.select();
	  return;
  }
  
  
  if(newPassword.value !== confirmPassword.value){
    alert("변경할 비밀번호를 확인해주세요");
  }
  
  
  
  
    form.submit();
  

  });