/* 백준 1110번(step3-13): 더하기 사이클 */
/* JAVA - BufferedReader, do-while */

package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek3_13_1110_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int copy = N;      // 원래 값으로 돌아왔는지 비교하기 위한 변수
		int count_1 = 0;   // 카운트 횟수
		
		do {               // do-while문
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			count_1++;
		} while (copy != N);
		
		System.out.println(count_1);
		br.close();

	}
}
