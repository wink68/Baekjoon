/* 백준 11021번(step3-6): A+B */
/* JAVA - BufferedReader, StringTokenizer */

package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek3_6_11021_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());      // readLine() - 한 줄을 읽어 String으로 변환
		
		for (int i=1; i<=T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");  // 문자열 분리
			System.out.println("Case #" + i + ": "
			+(Integer.parseInt(st.nextToken())        // st.nextToken : 문자열 반환
			+Integer.parseInt(st.nextToken())));      // integer.parseInt() : int형으로 변환
		}
		br.close();

	}

}
