/* 백준 11021번(step3-6): A+B */
/* JAVA - BufferedReader, StringTokenizer, StringBuilder */

package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek3_6_11021_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());  // readLine() - 한 줄을 읽어 String으로 변환
		StringBuilder sb = new StringBuilder();
		
		for (int i=1; i<=T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");  // 문자열 분리
			
			sb.append("Case #").append(i).append(": ")
			.append(Integer.parseInt(st.nextToken())           // st.nextToken : 문자열 반환
			+Integer.parseInt(st.nextToken())).append('\n');   // integer.parseInt() : int형으로 변환
			
		}
		System.out.println(sb);
		br.close();

	}

}
