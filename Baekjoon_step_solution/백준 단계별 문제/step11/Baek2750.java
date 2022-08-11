/* 백준 2750번: 수 정렬하기 */
/* JAVA - BufferedReader, Arrays.sort() */

package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek2750 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());           // 주어진 숫자 수
		int[] array = new int[N];                          // N개 숫자가 들어갈 배열
		
		for (int i=0; i < N; i++) {
			array[i] = Integer.parseInt(br.readLine());    // 배열에 대입
		}
		
		Arrays.sort(array);                                // 오름차순 정렬
		
		StringBuilder sb = new StringBuilder();            // 정렬된 수를 담아줄 sb, 동작시간 단축
		for (Integer j : array) {                          // array에서 하나씩 숫자 꺼내기
			sb.append(j+"\n");
		}
		System.out.print(sb);
		br.close();
	}

}
