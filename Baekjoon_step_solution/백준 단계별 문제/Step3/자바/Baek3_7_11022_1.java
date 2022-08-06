/* 백준 11022번(step3-7): A+B 출력 */
/* JAVA - BufferedReader, StringBuilder */

package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek3_7_11022_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int A;
		int B;

		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for (int i=1; i<=T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			sb.append("Case #" +i +": " +A +" + " +B +" = " +(A+B)).append("\n");
		}
		System.out.println(sb);
		br.close();

	}

}
