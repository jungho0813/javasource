/**
 * 	newaddr, newmobile 둘중에 하나는 값이 있어야함(둘다있거나)
 * 
 *  둘다 빈칸일때 submit 막고, 메세지 띄우기
 */
const form = document.querySelector('form');

form.addEventListener('submit', (event) => {
  const newaddr = document.querySelector('#newaddr').value.trim();
  const newmobile = document.querySelector('#newmobile').value.trim();

  if (newaddr === '' && newmobile === '') {
    event.preventDefault();
    alert('변경할 주소나 전화번호 중 하나는 반드시 입력해야 합니다.');
  }
});
