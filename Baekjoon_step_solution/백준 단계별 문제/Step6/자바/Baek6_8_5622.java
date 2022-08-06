/* 백준 5622번(step6-8): 다이얼 */
/* JAVA - BufferedReader, switch-case */

package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek6_8_5622 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();            // 문자열 S 입력
		int time = 0;                        // 전화를 거는 데 걸리는 시간
		
		
		for (int i=0; i < S.length(); i++) {
			char a = S.charAt(i);            // 문자열 S의 각 자리 문자
			
			switch (a) {
			case 'A' : case 'B' : case 'C' : // 다이얼 2에 해당하는 문자
				time +=3;                    // 2를 누를려면 3초 필요
				break;
				
			case 'D' : case 'E' : case 'F' : // 다이얼 3에 해당하는 문자
				time +=4;
				break;
				
			case 'G' : case 'H' : case 'I' : // 다이얼 4에 해당하는 문자
				time +=5;
				break;
				
			case 'J' : case 'K' : case 'L' : // 다이얼 5에 해당하는 문자
				time +=6;
				break;
				
			case 'M' : case 'N' : case 'O' : // 다이얼 6에 해당하는 문자
				time +=7;
				break;
				
			case 'P' : case 'Q' : case 'R' : case 'S' : // 다이얼 7에 해당하는 문자
				time +=8;
				break;
				
			case 'T' : case 'U' : case 'V' : // 다이얼 8에 해당하는 문자
				time +=9;
				break;
				
			case 'W' : case 'X' : case 'Y' : case 'Z' : // 다이얼 9에 해당하는 문자
				time +=10;
				break;
			}
		}
		System.out.println(time);            // 전화를 거는데 걸리는 최소 시간 출력
		
	}

}
