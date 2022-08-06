/* 백준 2742번(step3-6): 기찍N */
/* JAVA - BufferedReader, StringBuilder */

package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek3_6_2742_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
        
		StringBuilder sb = new StringBuilder();
		
		while(n > 0) {
			sb.append(n + "\n");
            n--;
		}
		System.out.println(sb);
        br.close();
	}
}
