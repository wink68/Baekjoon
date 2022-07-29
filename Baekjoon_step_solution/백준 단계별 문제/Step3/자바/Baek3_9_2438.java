/* 백준 2438번(step3-9): 별찍기 */
/* JAVA - BufferedReader */

package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek3_9_2438 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i=1; i<=N; i++) {         // i는 줄의 수
			for (int j=1; j<=i; j++) {     // j는 별의 수
				System.out.print("*");
			}
			System.out.println();
			br.close();
		}
	
	}
	
}
