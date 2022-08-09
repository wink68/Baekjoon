/* 백준 2292번(step7-2): 벌집 */
/* JAVA - BufferedReader */

package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek7_2_2292 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int first = 1;               // 벌집 첫번째 수 (기본값)
		int len = 1;                 // N번 수까지 거리
		
		// 2~7: 거리2, 8~19: 거리3, 20~37, 거리4
		for (int i=0; first < N; i++) {
			if ((first + i*6) < N) {
				first = first +(i*6);   // 1, 7, 19, 37, 61... 6의 배수만큼 늘어난다
				len++;
			} else
				break;
		}
		System.out.println(len);
	}

}
