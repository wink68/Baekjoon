/* 백준 10950번(step3-2): A+B 출력 */
/* JAVA - Scanner */

package step3;

import java.util.Scanner;

public class Baek3_2_10950_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i=0; i<T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
	sc.close();
	}

}
