/* 백준 2475번: 검증수 */
/* JAVA - BufferedReader, StringTokenizer */

package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2475_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int sum = 0;
		for (int i=0; i < 5; i++) {
			int num = Integer.parseInt(st.nextToken());
			sum += num*num;
		}
		System.out.print(sum % 10);
	}
}
