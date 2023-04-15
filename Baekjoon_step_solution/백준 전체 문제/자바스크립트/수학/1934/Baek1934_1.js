const input = require('fs').readFileSync('/dev/stdin')
  .toString().trim().split('\n').map((v) => v.split(" ").map((v) => +v));  // 정수화
[T, ...arr] = input;

arr.map(nums => solution(nums[0], nums[1]));  // A와 B 한 쌍씩 함수에 넣기

function solution(a, b) {
  let divisor = 1;
  let multiple;
  
  // 최대공약수
  for (let i=2; i <= a; i++) {
    if (a % i === 0 && b % i === 0) {
      divisor = i;
    }
  }
  // 최소공배수
  if (a === divisor) {  // a가 최대공약수라면
    multiple = (b / divisor) * divisor;
  } else {
    multiple = a * b / divisor;
  }
  console.log(multiple);
}
