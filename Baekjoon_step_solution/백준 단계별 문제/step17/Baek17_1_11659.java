/* 백준 11659번(step17-1): 구간 합 구하기 4 */
/* JAVA - BufferedReader, StringTokenizer */

package step17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek17_1_11659 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());             // 수의 갯수
		int T = Integer.parseInt(st.nextToken());             // 테스트 케이스 수
		
		long[] S = new long[N+1];                             // 구간합 배열 선언
		                                                      // 첫 번째 값을 [0]이 아니라 [1]부터 시작해서 쉽게 이해할 수 있도록 
                                                              // S[0] 값은 비어있어 초기값 0
		st = new StringTokenizer(br.readLine());
		for (int i=1; i <= N; i++) {
			S[i] = S[i-1] +Integer.parseInt(st.nextToken());  // 구간합 배열 공식 선언
		}                                                     // 예시 {5, 4, 3, 2, 1}
                                                              // 구간4까지의 합 S[4]는 5+4+3+2이기에 S[3] + 2가 된다
		for (int q=0; q < T; q++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());         // 구간 i~j
			int j = Integer.parseInt(st.nextToken());
			System.out.println(S[j] - S[i-1]);                // 1-1 구간은 S[1]인 5에서 S[0]인 0을 빼서 5가 나온다
		}
		br.close();

	}

}
