/* 백준 10951번(step3-12): A+B 출력 */
/* JAVA - BufferedReader, StringTokenizer */

package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek3_12_10951_1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();      // A+B 값을 넣을 공간 생성
		String str;

		while ( (str=br.readLine()) != null ) {      // 값이 없는 상황(null)이 아닐 때
			
			StringTokenizer st = new StringTokenizer(str, " ");   // str값 쪼개기
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			sb.append((A+B)).append('\n');
   		}
		System.out.println(sb);
	}

}
