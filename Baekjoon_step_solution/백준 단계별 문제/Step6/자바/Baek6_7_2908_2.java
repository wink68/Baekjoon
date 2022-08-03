/* 백준 2908번(step6-7): 상수 */
/* JAVA - BufferedReader, StringBuilder, StringTokenizer */

package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek6_7_2908_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 공백을 기준으로 숫자 A, B 구분 → 문자열 A, B
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// 문자열 A, B를 넣고 뒤집은 다음 문자열로 반환하고, 그걸 다시 정수화
		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		System.out.println(A > B ? A : B);
		br.close();

	}

}
