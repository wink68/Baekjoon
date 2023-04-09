// input값 처리
const input = require('fs').readFileSync('/dev/stdin')
  .toString().trim().split('\n').map((v) => v.split(" ").map((v) => +v));
input.pop();  // 맨 끝 [0, 0] 제거

console.log(input.map(function solution(nums) {  // 한 줄씩 입력
  if (nums[1] % nums[0] === 0) {  // 약수
    return 'factor';
  } else if (nums[0] % nums[1] === 0) {  // 배수
    return 'multiple';
  } else {
    return 'neither';  // 둘 다 아닐 때
  }
}).join('\n'));
