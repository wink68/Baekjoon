/* 백준 2440번: 별 찍기 3 */
/* JAVA - BufferedReader */

package solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2440 {
	final static String STAR = "*";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i=1; i <= N; i++) {           // i는 줄의 수
			for (int j=1; j <= N-i+1; j++) {   // j는 별의 수, j가 N이 될때까지 별 찍기
				System.out.print(STAR);
			}
			System.out.println();
			br.close();
		}
		
	}


}