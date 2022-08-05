/* 백준 11720번(step6-2): 숫자의 합 */
/* JAVA - Scanner, charAt() */

package step6;

import java.util.Scanner;

public class Baek6_2_11720_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();                     // N개 숫자
		String a = sc.next();                     // 한 줄로 나열된 N개 숫자
		int sum = 0;
			
		for (int i=0; i < N; i++) {               // 예시 "문자열 321" : 3 + 2 + 1
			sum += a.charAt(i) -'0';              // 각 자리수 총 합
				
		}
		System.out.print(sum);
		sc.close();
	}
}
