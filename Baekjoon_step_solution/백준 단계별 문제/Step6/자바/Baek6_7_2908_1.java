/* 백준 2908번(step6-7): 상수 */
/* JAVA - Scanner, StringBuilder */

package step6;

import java.util.Scanner;

public class Baek6_7_2908_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		// StringBuilder에 값을 넣고, 그걸 뒤집어서 문자열로 반환하고, 그걸 다시 정수로 바꿔준다
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
		System.out.println(A > B ? A : B);  // 삼항 연산자
		sc.close();

	}

}
