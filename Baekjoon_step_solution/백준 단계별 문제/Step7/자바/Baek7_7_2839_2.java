/* 백준 2839번(step7-7): 설탕 배달 */
/* JAVA - BufferedReader */

package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek7_7_2839_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		if ((N % 5) == 0) {                                      // 5로 딱 떨어지는 경우
			System.out.println(N / 5);
		}
		
		else if ((N>=3) && ((N % 5) == 1 || (N % 5) == 3)) {     // 5로 나누었을 때, 나머지가 1 or 3인 경우
			System.out.println((N / 5) +1);                  // 5의 봉지 갯수 + 1
		}
		
		else if ((N>=8) && ((N % 5) == 4 || (N % 5) == 2)) {     // 5로 나누었을 때, 나머지가 4 or 2인 경우
			System.out.println((N / 5) +2);                  // 5의 봉지 갯수 + 2
		}
		
		else if (N == 4 || N == 7) {
			System.out.println(-1);
		}
		br.close();

	}

}
