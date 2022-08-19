/* 백준 2743번: 단어 길이 재기 */
/* JAVA - BufferedReader */

package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2743 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		System.out.print(str.length());
		
		br.close();
	}
	
}
