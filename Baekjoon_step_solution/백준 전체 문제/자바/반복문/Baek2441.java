/* 백준 2441번: 별 찍기 4 */
/* JAVA - BufferedReader */

// ****
//  ***
//   **
//    *

package solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2441 {
	final static String STAR = "*";
	final static String BLANK = " ";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i=1; i <= N; i++) {                   // i는 줄의 수
			for (int j=1; j <= N; j++) {           // j는 공백의 수+1
				if (j >= i) {                  // i와 j를 비교하여 공백 입력
					System.out.print(STAR);
				} else {
					System.out.print(BLANK);
				}
			}
			System.out.println();
			br.close();
		}
		
	}

}
