/* 백준 2475번: 검증수 */
/* JAVA - BufferedReader, charAt() */

package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2475_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int sum = 0;
		
		for (int i=0; i < 5; i++) {
			int num = str.charAt(i*2) -'0';
			sum += num*num;
		}
		System.out.print(sum % 10);
	}
}
