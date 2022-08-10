/* 백준 2442번: 별 찍기 5 */
/* JAVA - BufferedReader */

//   *
//  ***
// *****

package solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2442_1 {
	final static String STAR = "*";
	final static String BLANK = " ";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i=1; i <= N; i++) {               // i는 줄의 수
			for (int j=N; j > i; j--) {        // j는 공백의 수
				System.out.print(BLANK);
			}
			
			for (int k=1; k <=i*2-1; k++) {    // k는 별의 수
				System.out.print(STAR);
			}
			System.out.println();
			br.close();
		}
		
	}

}
