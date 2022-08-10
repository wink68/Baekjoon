/* 백준 2443번: 별 찍기 6 */
/* JAVA - BufferedReader */

// *****
//  ***
//   *

package solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2443_1 {
	final static String STAR = "*";
	final static String BLANK = " ";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i=0; i < N; i++) {                 // i는 줄의 수-1
			for (int j=0; j < i; j++) {             // j는 공백의 수
				System.out.print(BLANK);
			}
			
			for (int k = (N-i)*2 -1; k > 0; k--) {  // k는 별의 수
				System.out.print(STAR);
			}
			System.out.println();
			br.close();
		}
		
	}

}