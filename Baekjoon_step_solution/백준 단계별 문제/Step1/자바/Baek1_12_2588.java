/* 백준 2588번(step1-12): 곱셈 */
/* JAVA - BufferedReader */

package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek1_12_2588 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		System.out.println(A * (B % 10));           // A * B의 1의 자리수
		System.out.println(A * ((B / 10) % 10));    // A * B의 10의 자리수
		System.out.println(A * (B/100));            // A * B의 100의 자리수, 나머지 했을 때 정수만 나옴
		System.out.println(A*B);                    // A * B
		br.close();

	}

}
