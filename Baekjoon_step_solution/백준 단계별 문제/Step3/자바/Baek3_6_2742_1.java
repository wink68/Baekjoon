/* 백준 2742번(step3-6): 기찍N */
/* JAVA - BufferedReader */

package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek3_6_2742_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
        
		int i=0;
		while(n > 0) {
			System.out.println(n-i);
            n--;
		}
        br.close();
	}
}
