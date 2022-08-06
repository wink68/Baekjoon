/* 백준 11720번(step6-2): 숫자의 합 */
/* JAVA - BufferedReader, getBytes() */

package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek6_2_11720_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();    // N개 숫자, 사용하지 않으므로 입력만 받는다
		
		int sum = 0;
		
		byte[] each_number = br.readLine().getBytes();  // getBytes() : 문자열 → 하나의 byte 배열로 변환
		for (byte number : each_number) {               // for-each문 : 뒤의 byte 배열에서 number값을 가져옴
			sum += number - '0';
		}
		System.out.print(sum);
		br.close();
	}

}
