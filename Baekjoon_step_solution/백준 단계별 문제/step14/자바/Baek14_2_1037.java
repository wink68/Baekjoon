/* 백준 1037(step14-2)번: 약수 */
/* JAVA - BufferedReader */

package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Baek14_2_1037 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());    // N의 약수의 개수
		int[] divisor = new int[n];                 // 약수(divisor)의 배열
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i=0; i < divisor.length; i++) {
			divisor[i] = Integer.parseInt(st.nextToken());  // 배열에 약수 입력
		}
		
		Arrays.sort(divisor);  // 작은 숫자부터 배열 정렬
		System.out.println(divisor[0] * divisor[n-1]);  // N = 제일 작은 약수 * 제일 큰 약수
		br.close();
	}

}
