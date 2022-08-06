/* 백준 2675번(step6-4): 문자열 반복 */
/* JAVA - BufferedReader, StringBuilder, getBytes; */

package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek6_4_2675_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());          // T = 전체 테스트 케이스 수
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i < T; i++) {
			String[] str = br.readLine().split(" ");  // R과 S 분리
			
			int R = Integer.parseInt(str[0]);         // R = 반복해서 입력해야 할 횟수
			String S = str[1];                        // S = 입력해야 할 문자열
			
			for (byte character : S.getBytes()) {     // S를 구성하는 문자 추출
				for (int k=0; k < R; k++) {       // R번만큼 반복해서 sb에 입력
					sb.append((char) character);
				}
			}
			sb.append("\n");                          // 엔터 - 다음 테스트 케이스로 넘어가기
		}
		System.out.print(sb);
	}

}
