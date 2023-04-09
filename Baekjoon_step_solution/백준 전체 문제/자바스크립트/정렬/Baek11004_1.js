// input값 처리
const input = require('fs').readFileSync('/dev/stdin')
  .toString().trim().split('\n').map((v) => v.split(" ").map((v) => +v));  // 정수화

const [[N, K], arr] = input;

console.log(solution(arr)[K-1]);  // K번째 수

function solution(arr) {
  return arr.sort((a, b) => a - b);  // 오름차순 정렬
}
