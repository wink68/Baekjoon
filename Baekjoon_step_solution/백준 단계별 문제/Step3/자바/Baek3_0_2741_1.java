/* 백준 2741번(step3-0): N찍기 */
/* JAVA - BufferedReader */

package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek3_0_2741_1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int i = 1;
		while (i <= n) {
			System.out.println(i);
			i++;
		}
		br.close();

	}

}