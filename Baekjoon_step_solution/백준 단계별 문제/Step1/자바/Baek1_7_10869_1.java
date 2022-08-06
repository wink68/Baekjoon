/* 백준 10869번(step1-7): 사칙연산 */
/* JAVA - Scanner */

package step1;

import java.util.Scanner;   // Scanner : 화면으로부터 데이터를 입력받는 기능을 제공하는 클래스

public class Baek1_7_10869_1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);   // Scanner 객체 생성,  // System.in : 화면 입력
		int A = scanner.nextInt();                  // nextInt 정수를 입력받을 때
		int B = scanner.nextInt();		    // 실수를 입력할 때 : nextFloat()
		
		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A / B);
		System.out.println(A % B);
		
		scanner.close();   // .close() 스캐너 사용 종료
	}
}
