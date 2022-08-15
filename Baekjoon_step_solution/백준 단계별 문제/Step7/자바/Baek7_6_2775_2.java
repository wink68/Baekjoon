/* 백준 2775번(step7-6): 부녀회장이 될테야, 2차원 배열 */
/* JAVA - BufferedReader */

package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek7_6_2775_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());  // 테스트 수
		
		// 0층 1호부터,  k층 n호 = k-1층 n호까지의 합
		// 1 <= k, n <= 14
		int[][] APT = new int[15][15]; 
		
		for (int i=0; i <15; i++) {
			APT[0][i] = i;   // 0층
			APT[i][1] = 1;   // 1호 라인,  1호 = 1호 - 0호 (0호가 없기에 1호를 미리 만들어 줌)
		}
		
		for (int i=1; i < 15; i++) {      // i = k층, 층수
			for (int j=2; j < 15; j++) {  // j = n호, 호수
				APT[i][j] = APT[i-1][j] + APT[i][j-1];
			}
		}
		
		for (int i=0; i < T; i++) {  // 각 테스트의 k와 n이 다른 줄로 되어 있기에 이중 for문 활용
			int k = Integer.parseInt(br.readLine()); 
			int n = Integer.parseInt(br.readLine());
			System.out.println(APT[k][n]);
		}
		br.close();
	}

}
