/* 백준 11654번(step6-1): 아스키 코드 */
/* JAVA - BufferedReader, charAt() */

package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek6_1_11654_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int ascii_code = br.readLine().charAt(0);   // charAt(0): 주어진 1번째 값 → 아스키 코드값
		System.out.println(ascii_code);
		br.close();

	}

}
