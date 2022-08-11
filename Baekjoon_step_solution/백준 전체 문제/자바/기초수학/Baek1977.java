/* 백준 1977번: 완전제곱수 */
/* JAVA - BufferedReader, Math.sqrt(), floor(), ceil() */

package 기초수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek1977 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		// Math.ceil() : 소수점 올림
		int m = (int) Math.ceil(Math.sqrt(M));  // M의 제곱근 (최소값)
		int sum = 0;                            // 완전제곱수의 합
		
		
		// Math.floor() : 소수점 내림
		for (int i=m; i <= Math.floor(Math.sqrt(N)); i++) {  // 제곱근 m과 n 사이의 제곱근 찾기
			sum += Math.pow(i, 2);                           // 완전제곱수의 총합 계산
		}
		
		if (sum > 0) {
			System.out.println(sum);
			System.out.print((int) Math.pow(m, 2));   // 완전제곱수 최소값
		}
		else                                          // 합이 0일땐 = 완전제곱수 X
			System.out.print(-1);
		
		br.close();
	}
	
}
