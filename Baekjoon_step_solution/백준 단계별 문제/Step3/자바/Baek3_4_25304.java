/* 백준 25304번(step3-4): 영수증 */
/* JAVA - BufferedReader, StringTokenizer */

package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek3_4_25304 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());  // 총 금액
		int N = Integer.parseInt(br.readLine());  // 물건 종류 수

		for (int i=1; i<=N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());    // 물건 가격 a
			int b = Integer.parseInt(st.nextToken());    // 개수 b
			a = a * b;
			X -= a;
		}
		
		if (X == 0) {                   // 개별 물건 금액 합 = 총 금액
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
