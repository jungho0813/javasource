<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/include/header.jsp"%>
<h1>도서 정보 입력</h1>
<form action="insertPro.jsp" method="post">
  <div class="mb-3">
    <label for="code" class="form-label">code</label>
    <input type="text" class="form-control" id="code" name="code" placeholder="도서코드">    
  </div>
  <div class="mb-3">
    <label for="title" class="form-label">title</label>
    <input type="text" class="form-control" id="title" name="title" placeholder="도서명">    
  </div>
  <div class="mb-3">
    <label for="writer" class="form-label">writer</label>
    <input type="text" class="form-control" id="writer" name="writer" placeholder="저자명">    
  </div>
  <div class="mb-3">
    <label for="price" class="form-label">price</label>
    <input type="text" class="form-control" id="price" name="price" placeholder="도서가격">    
  </div>  
  <div class="mb-3">
    <label for="description" class="form-label">description</label>
    <textarea class="form-control" id="description" name="description" placeholder="상세정보"></textarea>
  </div>  
  <button type="submit" class="btn btn-primary">저장</button>
</form>
<script>
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
</script>
<%@ include file="/include/footer.jsp"%>



