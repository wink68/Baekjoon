const input = require('fs').readFileSync('example.txt')
  .toString().trim().split('\n').map((v) => v.split(" ").map(Number));  // 정수화
[T, ...arr] = input;

const answer = [];

arr.map(nums => solution(nums[0], nums[1]));  // A와 B 한 쌍씩 함수에 넣기

function solution(a, b) {
  let x = a;
  let y = b;

  while (x % y !== 0) {
    let rest = x % y  // 나머지
    
    if (rest !== 0) {  // 나머지가 0일때 그 나머지 출력
      x = y;           // 나머지를 나눈수에 재할당
      y = rest;        // 나머지에 새 나머지 할당 
    }
  }
  answer.push(a * b / y); // 최소공배수 입력
}
console.log(answer.join('\n'));
