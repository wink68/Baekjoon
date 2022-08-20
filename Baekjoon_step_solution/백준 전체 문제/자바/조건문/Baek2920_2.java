/* 백준 2920번: 음계 */
/* JAVA - BufferedReader, StringTokenizer */

package 조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2920_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] array = new int[8];         // 8개 음계가 담길 빈 배열
		for (int i=0;  i < array.length; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		
		String result = "";               // 결과를 담을 빈 문자열
		
		for (int i=0; i < array.length -1; i++) {
			
			if (array[i] == array[i+1] -1) {        // <, >로 앞뒤 비교로는 올바른 결과 도출 X
				result = "ascending";
			} else if (array[i] == array[i+1] +1) {
				result = "descending";
			} else {
				result = "mixed";
				break;
			}
		}
		System.out.println(result);
		br.close();
	}

}
