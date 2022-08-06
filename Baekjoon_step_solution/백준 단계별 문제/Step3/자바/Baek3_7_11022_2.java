/* 백준 11022번(step3-7): A+B 출력 */
/* JAVA - BufferedReader, StringBuilder, charAt() */

package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek3_7_11022_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();  // A+B 값을 넣을 공간 생성
		
		for (int i=1; i<=T; i++) {
			String str = br.readLine();
			int A = str.charAt(0)-'0';  // 1번째 자리 값 - 아스키 코드값 48
			int B = str.charAt(2)-'0';  // 3번째 자리 값 - 아스키 코드값 48
			
			sb.append("Case #" +i +": " +A +" + " +B +" = " +(A+B)).append("\n");
		}
		System.out.println(sb);
		br.close();

	}

}
