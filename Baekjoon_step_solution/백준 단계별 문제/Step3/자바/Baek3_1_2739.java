/* 백준 2739번(step3-1): 구구단 */
/* JAVA - BufferedReader */

package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek3_1_2739 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N1 = Integer.parseInt(br.readLine());
		
		for (int N2=1; N2<10; N2++) {
			System.out.println (N1 + " * " + N2 + " = " + N1*N2);
		}

	}

}
