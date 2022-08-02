/* 백준 1008번(step1-8): A/B */
/* JAVA - BufferedReader, StringTokenizer, double형 */

package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek1_8_1008 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");   // 공백을 기준으로 문자열 쪼갬
		// Double.parseDouble();
		double A = Double.parseDouble(st.nextToken());   // 쪼개진 문자열(토큰) → 실수형
		double B = Double.parseDouble(st.nextToken());   // 쪼개진 문자열(토큰) → 실수형
		
		System.out.println(A/B);

	}

}
