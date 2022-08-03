/* 백준 2941번(step6-9): 크로아티아 알파벳 */
/* JAVA - BufferedReader, charAt() */

package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek6_9_2941_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int len = str.length();
		int count = 0;
		
		for (int i=0; i < len; i++) {            // charAt()에서 문자열 0번째부터 계산
			                                     // 예시 "c"에서 c는 길이 1이지만, 0번째 자리
			
			char ch = str.charAt(i);             // i번째 글자
			
			// i번째 글자 == "c"
			if (ch == 'c' && i < len -1) {       // 예시 "c"에서 c가 끝이므로, 다음 if문이 실행될 수 없기에 len는 0 < 1 -1
				if (str.charAt(i+1) == '=' || str.charAt(i+1) =='-') {
					i++;
				}
			}
			
			// i번째 글자 == "d"
			else if (ch == 'd' && i < len -1) {
				if (str.charAt(i+1) == '-') {                     // "d-"인 경우
					i++;
				}
				else if (str.charAt(i+1) == 'z' && i < len -2) {  // "dz="인 경우 "z="과 혼동할 수 있으므로
					if (str.charAt(i+2) == '=') {
						i +=2;                                    // i에 2를 더해줘 len는 2 < 3-2로 실행되지 않도록
					}
				}
			}
			
			// i번째 글자 == "l 또는 n"
			else if ((ch == 'l' || ch == 'n') && i < len -1) {    // lj 또는 nj 경우
				if (str.charAt(i+1) == 'j') {
					i++;
				}
			}
			
			// i번째 글자 == "s 또는 z"
			else if ((ch == 's' || ch == 'z') && i < len -1) {    // s= 또는 z= 경우
				if (str.charAt(i+1) == '=') {
					i++;
				}
			}
			
			count++;  // 각 알파벳 당 카운트 1개씩
		}
		System.out.println(count);
		
	}
}
