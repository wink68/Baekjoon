/* 백준 10926번(step1-10): ??! 문자열 추가 */
/* JAVA - BufferedReader */

package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek1_10_10926_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();    // String 변수 = br.readLine()
					     // : br에 입력된 한 줄을 문자열로 변수에 저장
		System.out.println(a + "??!");
		br.close();


	}

}
