/* JAVA - BufferedReader, String.valueOf(), Character.isUpperCase(), toUpperCase() */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		for (int i=0; i < str.length(); i++) {    // 1) 대문자일 경우
			char alpha = str.charAt(i);
			
			if (Character.isUpperCase(alpha)) {
				System.out.print(String.valueOf(alpha).toLowerCase());
			
			} else if (Character.isLowerCase(alpha)) {    // 2) 소문자일 경우
				System.out.print(String.valueOf(alpha).toUpperCase());
			}
		}
		br.close();
	}
	
}
