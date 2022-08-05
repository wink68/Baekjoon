/* 백준 1152번(step6-6): 단어의 개수 */
/* JAVA - BufferedReader, StringTokenizer */

package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek6_6_1152 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		System.out.println(st.countTokens());     // countTokens() : 토큰(단어) 개수 세려줌

	}

}
