/* 백준 2420번: 사파리월드 */
/* JAVA - BufferedReader, StringTokenizer, Math.abs() */

package 입력과_계산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2420_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long N = Long.parseLong(st.nextToken());
		long M = Long.parseLong(st.nextToken());
		
		System.out.println(Math.abs(N-M));  // Math.abs() : 절대값
		br.close();

	}

}
