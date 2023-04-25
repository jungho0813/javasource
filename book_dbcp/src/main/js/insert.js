/**
 * 	form submit 되기 전 유효성 검증
 * 
 * 	1) 내용은 비어있지 않아야 함(단, description은 내용 없어도 됨)
 *  2) 코드는 무조건 4자리 입력되었는지 확인
 *  3) 가격은 숫자로 입력되었는지 확인
 * 
 *  1,2,3 만족시 form submit 하기
 */

 document.querySelector("form").addEventListener("submit", function(event) {
  // 이벤트의 기본 동작인 form submit을 막음
  event.preventDefault();

  // 유효성 검증을 위해 필요한 form element들을 가져옴
  const code = document.querySelector("#code");
  const title = document.querySelector("#title");
  const writer = document.querySelector("#writer");
  const price = document.querySelector("#price");
  const description = document.querySelector("#description");

  // 유효성 검증
  if (code.value.length !== 4) {
    alert("코드는 4자리로 입력해주세요.");
    return;
  }
  if (!price.value || isNaN(price.value)) {
    alert("가격은 숫자로 입력해주세요.");
    return;
  }
  if (!title.value) {
    alert("제목을 입력해주세요.");
    return;
  }

  // form submit
  this.submit();
});