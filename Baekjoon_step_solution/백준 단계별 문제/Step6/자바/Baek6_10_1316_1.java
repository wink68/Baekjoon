/* 백준 1316번(step6-10): 그룹 단어 체커 */
/* JAVA - Scanner, charAt() */

package step6;

import java.util.Scanner;

public class Baek6_10_1316_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();               // 테스트 케이스 수 입력
		int count = 0;                      // 그룹 단어 개수
		
		for (int i=0; i < N; i++) {
			
			int[] array = new int[26];      // 26개 알파벳이 담길 배열
			String word = sc.next();        // 입력받은 단어
			
			char prev = 0;                  // 이전에 등장했는지 체크해주기 위한 변수
			
			// 1번째 알파벳
			for (int j=0; j < word.length(); j++) {
				if (j == 0) {
					prev = word.charAt(j);
					array[prev - 97] = 1;   // 'a' 아스키 코드값 97, 소문자로만 되어 있기에
					continue;               // 해당 알파벳 배열에 알파벳이 있다면 1 추가
				}
				
				// 2번째 알파벳
				if (prev == word.charAt(j)) {                       // 1번째 = 2번째 알파벳
					continue;
				} else {
					if (array[word.charAt(j) - 97] != 1) {      // 이미 등장한 알파벳이 아니라면 array 배열의 값은 0
						array[word.charAt(j) - 97] = 1;
						prev = word.charAt(j);              // 2번째 알파벳 값 대입
					} else {
						count--;                            // for문 끝나기전 -1, 다 끝나고 +1로 해서 그룹 단어 0개로 카운트
						break;
					}
				}
			}
			count++;   // 전체 for문을 다 돌았을 때, 그룹 단어면 +1
		}
		System.out.println(count);
	}

}
