/* 백준 1157번(step6-5): 단어 공부 */
/* JAVA - BufferedReader */

package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek6_5_1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();                          // 입력한 문자
		int[] alphabet = new int[26];                      // 알파벳 26개에 해당하는 (숫자) 값이 들어갈 배열
		
		
		for (int i=0; i < S.length(); i++) {
			if (65 <= S.charAt(i) && S.charAt(i) <= 90) {  // 대문자 범위 (아스키 코드값)
				alphabet[S.charAt(i) -65]++;               // 해당 대문자 알파벳 횟수 1 추가
			}
			else {
				alphabet[S.charAt(i) -97]++;               // 해당 소문자 알파벳 횟수 1 증가
			}
		}
		
		
		int most = -1;                       // 빈 배열의 초기값은 0이므로
		char ch = '?';                       // 가장 많이 사용된 알파벳이 여러개 존재할 경우
		
		for (int i=0; i < 26; i++) {
			if (alphabet[i] > most) {
				most = alphabet[i];          // most값 → 가장 많이 사용된 알파벳의 횟수로 변경
				ch = (char) (i + 65);        // 문자로 출력해야 하므로 +65 (아스키 코드값)
			}
			else if (alphabet[i] == most) {  // 이미 입력된 값이랑 동일하다는 것 = 최빈도 알파벳이 여러개
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}
