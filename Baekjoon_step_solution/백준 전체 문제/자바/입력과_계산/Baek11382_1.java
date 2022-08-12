/* 백준 11382번: 꼬마 정민 */
/* JAVA - Scanner */

package 입력과_계산;

import java.util.Scanner;

public class Baek11382_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();  // 10의 12승 이하
		long B = sc.nextLong();
		long C = sc.nextLong();
		
		System.out.println(A+B+C);
		sc.close();
	}

}
