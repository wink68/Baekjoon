/* 백준 11720번(step6-2): 숫자의 합 */
/* JAVA - BufferedReader, toCharArray() */

package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek6_2_11720_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		br.readLine();    // N개 숫자, 사용하지 않으므로 입력만 받는다

		String a = br.readLine();                           // 한 줄로 나열된 N개 숫자
		char[] number = a.toCharArray();                    // toCharArray() : 문자열 분해 → char형 배열

		int sum = 0;
			
		for (int i=0; i < number.length; i++) {             // 예시 "문자열 321" : 3 + 2 + 1   // 배열의 길이 = N
			sum += number[i] -'0';                          // (배열) 각 자리수 총 합
				
		}
		System.out.print(sum);
		br.close();
	}
}
