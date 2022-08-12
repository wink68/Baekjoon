/* 백준 2420번: 사파리월드 */
/* JAVA - BufferedReader, StringTokenizer */

package 입력과_계산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2420_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long N = Long.parseLong(st.nextToken());
		long M = Long.parseLong(st.nextToken());
		
		if ((N-M) > 0)
			System.out.println(N-M);
		else
			System.out.println(M-N);
		
		br.close();

	}

}
