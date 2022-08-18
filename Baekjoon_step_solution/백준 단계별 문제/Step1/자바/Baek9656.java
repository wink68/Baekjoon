/* 백준 9656번: 돌 게임 */
/* JAVA - BufferedReader */

package 조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek9656 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());    // N = 돌의 개수
		
		// 상근이가 먼저 뽑을 때, 마지막에 돌을 집어가는 사람이 패배
		// 뽑는 횟수가 홀수면 창영(CY)이 승, 짝수면 상근(SK) 승
		if (N % 3 == 0) {                               // 돌이 3의 배수일 때
			if ((N / 3) % 2 == 0) {                 // 1, 3... 홀수번째 가져가는 상근이 승
				System.out.println("SK");
			} else {
				System.out.println("CY");
			}
		}
		
		// 돌의 개수가 3의 배수가 아닌 경우                  // 손 코딩 해보기
		else if ((N / 3) % 2 == 0) {                // 3으로 뽑은 횟수가 짝수인 경우
			if ((N % 3) % 2 == 0) {                 // 3으로 뽑은 횟수 짝수 + 나머지 횟수 짝수 = 패배
				System.out.println("SK");
			} else {
				System.out.println("CY");
			}
		}
		
		else if ((N / 3) % 2 != 0) {                // 3으로 뽑은 횟수가 홀수인 경우
			if ((N % 3) % 2 != 0) {                 // 3으로 뽑은 횟수 홀수 + 나머지 횟수 홀수 = 패배
				System.out.println("SK");
			} else {
				System.out.println("CY");
			}
		}
		br.close();
	}

}
