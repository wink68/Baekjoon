/* 백준 1712번(step7-1): 손익분기점 */
/* JAVA - BufferedReader, StringTokeninizer */

package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek7_1_1712_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		if (C-B <= 0) {                          // 손익분기점 n = A/(C-B)
			System.out.println("-1");            // n이 0 또는 음수여야 손익 발생 X
		}
		
		else {
			System.out.println((A/(C-B)) +1);    // 손익분기점보다 1개 더 많이 팔아야 수익권
		}

	}

}
