/* 백준 18108번(step1-9): 1998년생인 내가 태국에서는 2541년생?! */
/* JAVA - BufferedReader */

package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek1_9_18108_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int year = Integer.parseInt(br.readLine());  // 입력받은 문자열 number의 정수화
		
		System.out.println(year -543);               // 태국과 차이나는 543년 빼주기
		br.close();

	}

}
