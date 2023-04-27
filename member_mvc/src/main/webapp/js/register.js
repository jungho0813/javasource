/**
 * 폼 도느 요소가 비어있는지 확인
 */
document.querySelector(".btn-success").addEventListener("click",()=>location.href="index.jsp")
const form = document.querySelector("form");
form.addEventListener("submit",(e)=>{
	e.preventDefault();
  // 유효성 검증을 위해 필요한 form element들을 가져옴
  const name = document.querySelector("#name");
  const password = document.querySelector("#password");
  const email = document.querySelector("#email");
  const userid = document.querySelector("#userid");
  const gender = document.querySelector(".gender");
  
  if (!userid.value){
	  alert("아이디를 입력해주세요")
  }else if(!password.value){
	  alert("비밀번호를 입력해주세요")
  }else if(!name.value){
	  alert("이름을 입력해주세요")
  }else if(!email.value){
	  alert("이메일을 입력해주세요")
  }
  
  });
