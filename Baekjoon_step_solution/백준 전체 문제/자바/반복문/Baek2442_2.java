/* 백준 2442번: 별 찍기 5 */
/* JAVA - BufferedReader, repeat() */

package solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2442_2 {
	final static String STAR = "*";
	final static String BLANK = " ";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i=1; i <= N; i++) {                                     // i는 줄의 수
			System.out.println(BLANK.repeat(N-i) + STAR.repeat(2*i-1));  // 공백은 N-i개
		}                                                                // 별은 (2*줄의 수-1) 씩 증가
		br.close();
	}
		
}

