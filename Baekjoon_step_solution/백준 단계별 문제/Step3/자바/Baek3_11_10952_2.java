/* 백준 10952번(step3-11): A+B 출력 */
/* JAVA - BufferedReader, StringBuilder, charAt() */

package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek3_11_10952_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();  // A+B 값을 넣을 공간 생성
		
		while (true) {
			String str = br.readLine();
			int A = str.charAt(0) -'0';  // 1번째 자리 값 - 아스키 코드값 48
			int B = str.charAt(2) -'0';  // 3번째 자리 값 - 아스키 코드값 48
			
			if (A==0 && B==0) {
				break;
			}
			sb.append(A+B).append('\n');

		}
		System.out.println(sb);
		br.close();

	}
}
