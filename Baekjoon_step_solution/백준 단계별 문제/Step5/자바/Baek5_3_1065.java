/* 백준 1065번(step5-3): 한수, 등차수열 */
/* JAVA - BufferedReader */

package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek5_3_1065 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(hansu(Integer.parseInt(br.readLine())));  // 입력받은 문자열 number를 정수로 입력
	}

	public static int hansu(int number) {
		int count = 0;            // 한수 카운팅
		
		if (number < 100) {       // 100보다 작은 2자리 수는 전부 수열이므로
			return number;    // 수 = 수열 갯수
		}
		
		else {
			count = 99;       // 100이상이 들어올 때, 최소 99개의 한수 존재
			
			for (int i=100; i <= number; i++) {
				int num000 = i / 100;                      // 100의 자리수
				int num00 = (i/10) % 10;                   // 10의 자리수
				int num0 = i % 10;                         // 1의 자리수
				
				if ((num000 - num00) == (num00 - num0)) {  // 자리수의 차이 = 수열
					count++;                           // 99개 + 100 이상 한수 개수
				}
			}
		}
		return count;
	}
}
