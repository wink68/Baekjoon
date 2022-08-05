/* 백준 15736번: 청기 백기 */
/* JAVA - BufferedReader, Math.sqrt */

package solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// "i의 제곱" ~ "(i+1)의 제곱-1"번 : i개   // 손코딩 해보기
// 1~3번 : 1
// 4~8번 : 2
// 9~15번 : 3

public class Baek15736_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());  // 사람 수
		
		System.out.print((int) Math.sqrt(N));     // Math.sqrt(N) = 루트 = 제곱근
                                                  // 규칙을 보면 9~15는 제곱근 3, 4~8은 제곱근 2만 출력
	}

}
