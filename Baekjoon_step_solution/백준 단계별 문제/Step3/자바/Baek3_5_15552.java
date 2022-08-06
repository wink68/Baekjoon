/* 백준 15552번(step3-5): 빠른 A+B 합 */
/* JAVA - BufferedReader, StringTokenizer */

package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baek3_5_15552 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int T = Integer.parseInt(br.readLine());
		
		for (int i=0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");  // 문자열을 기준으로 공백 나눔
			
			int a = Integer.parseInt(st.nextToken());  // Integer.parseInt() : 문자열을 정수로 변환
			int b = Integer.parseInt(st.nextToken());  // .nextToken() : 쪼개진 문자(토큰, Token) 입력
			
			bw.write((a+b + "\n"));
			
		}
		br.close();
		bw.flush(); // 버퍼에 남아있는 데이터를 모두 출력해서 버퍼를 비움
		bw.close();
	}
}
