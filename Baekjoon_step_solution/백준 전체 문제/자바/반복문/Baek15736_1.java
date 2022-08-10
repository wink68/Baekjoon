/* 백준 15736번: 청기 백기 */
/* JAVA - BufferedReader */

package solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// "i의 제곱" ~ "(i+1)의 제곱-1"번 : i개   // 손코딩 해보기
// 1~3번 : 1
// 4~8번 : 2
// 9~15번 : 3

public class Baek15736_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());  // 사람 수
		int white = 0;                            // 최종 백기 수
		
		for (int i=1; i*i<=N; i++)                // 제곱의 총합
			white++;
		
		System.out.print(white);

	}

}
