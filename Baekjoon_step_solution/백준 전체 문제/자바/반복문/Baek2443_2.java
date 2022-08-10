/* 백준 2443번: 별 찍기 6 */
/* JAVA - BufferedReader, repeat() */

// *****
//  ***
//   *

package solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2443_2 {
	final static String STAR = "*";
	final static String BLANK = " ";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i=1; i <= N; i++) {                                           // i는 줄의 수
			System.out.println(BLANK.repeat(i-1) + STAR.repeat(2*(N-i+1)-1));  // 공백은 i-1개
		}                                                                      // 별은 (2*(N-줄의 수+1)-1) 씩 증가
		br.close();
	}
		
}

