/* 백준 8393번(step3-3): 합 */
/* JAVA - BufferedReader */

package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek3_3_8393 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for (int i=1; i<=n; i++)
			sum+=i;
		System.out.println(sum);

	}

}
