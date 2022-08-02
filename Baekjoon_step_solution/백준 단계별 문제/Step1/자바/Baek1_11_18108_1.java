/* 백준 18108번(step1-11): 1998년생인 내가 태국에서는 2541년생?! */
/* JAVA - Scanner */

package step1;

import java.util.Scanner;

public class Baek1_11_18108_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int year = scanner.nextInt();		   // nextInt 정수를 입력받을 때
		
		System.out.println(year -543);
		scanner.close();

	}

}
