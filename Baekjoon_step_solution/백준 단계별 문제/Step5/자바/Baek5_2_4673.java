/* 백준 4673번(step5-2): 셀프넘버, 함수 */
/* JAVA - 배열 */

package step5;

import java.io.IOException;

public class Baek5_2_4673 {

	public static int d(int number) {              // 수열을 계산해 줄 함수 생성
		int sum = number;
		
		while (number != 0) {
			sum = sum + (number %10);      // 처음 number값 + 1의 자리수
			number = number/10;            // 10으로 나누어 10의 자리수가 1의 자리수가 되게 함
			                               // 123(3) → 12(2) → 1(1) → 0   (0이 되면 while 구문 끝)
		}
		return sum;
	}
		
	
	public static void main(String[] args) throws IOException {
		
		int[] arr_num = new int[10001];        // 1 ~ 10000까지 담을 수 있는 배열 생성
		
		for (int n=1; n <= 10000; n++) {       // 생성자 n
			int c_num = d(n);              // 수열을 계산한 값 (생성자 숫자 + 각 자리수 합)
			
			if (c_num < 10001) {           // index 번호 = 계산한 값
				arr_num[c_num] = c_num;
			}
			
		}
		
		for (int selfnum = 1; selfnum <=10000; selfnum++) {
			if (arr_num[selfnum] != selfnum) {      // index번호와 동잃한 값이 없는 경우 = 생성자가 없는 경우
				System.out.println(selfnum);    //  = 셀프넘버
			}
		}
	}

}
