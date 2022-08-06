/* 백준 10871번(step3-10): X보다 작은 수 */
/* JAVA - BufferedReader, StringTokenizer */

package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek3_10_10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i=0; i < N; i++) {
			int A = Integer.parseInt(st.nextToken());

			if (A < X)
				sb.append(A).append(' ');
		}
		System.out.println(sb);

	}

}
