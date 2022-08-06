/* 백준 10809번(step6-3): 알파벳 찾기 */
/* JAVA - BufferedReader, charAt() */

// 입력받은 단어 S의 알파벳의 자리(위치)를 알파벳 26개의 위치에 입력
// 예시 bac에서 b는 0번째, a는 1번째, b는 2번째  →  알파벳 1 0 2 -1 ... -1
package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek6_3_10809_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();                   // 입력한 문자
		int[] alphabet = new int[26];               // 알파벳 26개에 해당하는 (숫자) 값이 들어갈 배열

		// 1단계 : 알파벳 배열의 모든 값을 -1로 설정
		for (int i=0; i < alphabet.length; i++) {
			alphabet[i] = -1;                       // 알파벳 배열 = 모든 값을 -1로 초기화
		}
		
		// 2단계 : 문자 S에 해당하는 알파벳의 값 변경
		for (int i=0; i < S.length(); i++) {        // i는 알파벳이 문자 S의 어디에 위치하는지
			int alpha = S.charAt(i) -97;            // alpha는 배열 alphabet에서 알바벳의 위치
                                                    // 아스키코드 a가 97이므로, 알파벳 a는 0이 되도록 97을 빼준다
			if (alphabet[alpha] == -1) {
				alphabet[alpha] = i;                // 단어 S를 구성하는 알파벳이 존재하면, -1를 그 위치값으로 바꿔줌
			}                                       // 예시 baekjoon
		}                                           // b: [1] = 0 / a: [0] = 1 / e: [4] = 2 / k: [10] = 3 / j: [9] = 4 / o: [14] = 5 / n: [13]: 7
                                                    // 1번째 o에서 [14]값이 5로 바뀌었기에 <if문의 == -1>를 충족하지 못해서 두번째 o의 6으로 바뀌지 않는다

		for (int i=0; i < alphabet.length; i++) {
			if (i == alphabet.length) {
				System.out.print(alphabet[i]);
			} else {
				System.out.print(alphabet[i] + " ");
			}
		}
		br.close();
	}

}
