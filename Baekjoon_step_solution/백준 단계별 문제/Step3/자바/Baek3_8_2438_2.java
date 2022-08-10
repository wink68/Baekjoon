/* 백준 2438번(step3-8): 별찍기 1 */
/* JAVA - BufferedReader, StringBuilder */

package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek3_8_2438_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=1; i <= N; i++) {             // i는 줄의 수
			for (int j=1; j <= i; j++) {     // j는 별의 수
				sb.append("*");
			}
			sb.append("\n");                 // 별 타워 층 만들기
			
		}
		System.out.print(sb);
		br.close();
	}
	
}
