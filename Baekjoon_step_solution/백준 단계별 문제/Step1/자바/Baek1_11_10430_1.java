/* 백준 10430번(step1-11): 나머지 */
/* JAVA - Scanner */

package step1;

import java.util.Scanner;

public class Baek1_11_10430_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();    // nextInt 정수 입력
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		System.out.println((A + B) % C);
		System.out.println(((A % C) + (B % C)) % C);
		System.out.println((A * B) % C);
		System.out.println(((A % C) * (B % C)) % C);
		scanner.close();
	}

}
