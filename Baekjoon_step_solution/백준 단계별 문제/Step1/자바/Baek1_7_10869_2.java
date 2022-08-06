/* 백준 10869번(step1-7): 사칙연산 */
/* JAVA - BufferedReader, StringTokenizer */

package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek1_7_10869_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");   // 공백을 기준으로 문자열 쪼갬
		int A =Integer.parseInt(st.nextToken());   // 쪼개진 문자열(토큰) → 정수
		int B =Integer.parseInt(st.nextToken());   // 쪼개진 문자열(토큰) → 정수
		
		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A / B);
		System.out.println(A % B);

	}

}
