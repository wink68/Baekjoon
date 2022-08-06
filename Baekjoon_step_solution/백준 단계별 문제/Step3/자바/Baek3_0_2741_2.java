/* 백준 2741번(step3-0): N찍기 */
/* JAVA - BufferedReader, StringBuilder */

package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek3_0_2741_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int i = 1;
		while (i <= n) {
			sb.append(i + "\n");
			i++;
		}
		System.out.println(sb);
		br.close();
		
	}
	
}