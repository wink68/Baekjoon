/* 백준 1193번(step7-3): 분수찾기 */
/* JAVA - BufferedReader */

package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek7_3_1193_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long X = Long.parseLong(br.readLine()); // X번째 분수 찾기
		
		// N번째 줄에 N개의 분수  /  분자+분모 = N+1
		int N = 1;               // N번째 줄의 분수 개수
		int N_1 = 0;             // N-1번째까지 총 분수 개수 (누적 합)
		
		while (true) {
			if (X <= N + N_1) {    // X <= X가 있는 줄까지의 총 분수 개수
				
				// N번째 줄의 분수 개수 = 짝수
				// (X - N-1번째 줄 누적합)  /  N번째 - (X - N-1번째 누적합 -1)
				// 7번째: 1/4 : (7-6) / 4 -(7-6-1)
				if (N % 2 == 0) {
					System.out.println((X - N_1) + "/" + (N - (X - N_1 -1)));
					break;
					
					
				// N번째 줄의 분수 개수 = 홀수
				// N번째 - (X - N-1번째 누적합 -1)  /  (X - N-1번째 줄 누적합)
				// 4번째: 3/1 : 3 -(4-3-1) / (4-3)
				} else {
					System.out.println((N - (X - N_1 -1)) + "/" + (X - N_1));
					break;
				}
				
			} else {          // X가 있는 줄까지 도착하지 않음
				N_1 += N; // N-1번째까지 누적합
				N++;      // 줄의 수 추가
			}
		}
		br.close();
	}

}
