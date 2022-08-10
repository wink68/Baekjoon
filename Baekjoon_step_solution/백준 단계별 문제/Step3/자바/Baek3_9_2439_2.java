/* 백준 2439번(step3-9): 별찍기 2 */
/* JAVA - BufferedReader, StringBuilder */

package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek3_9_2439_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=1; i<=N; i++) {                 // i는 줄의 수
			for (int j=1; j <= N-i; j++) {     // j는 공백의 수
				sb.append(" ");
			}
			for (int k=1; k<=i; k++) {         // k는 별의 수
				sb.append("*");
			}
			sb.append("\n");                   // 별 타워 층 만들기
			
		}
		System.out.print(sb);
		br.close();
	}
	
}
