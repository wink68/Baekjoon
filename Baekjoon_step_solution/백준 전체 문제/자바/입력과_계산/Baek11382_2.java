/* 백준 11382번: 꼬마 정민 */
/* JAVA - BufferedReader, StringTokenizer */

package 입력과_계산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek11382_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Long.parseLong(st.nextToken());  // 10의 12승 이하
		long B = Long.parseLong(st.nextToken());
		long C = Long.parseLong(st.nextToken());
		
		System.out.println(A+B+C);
		br.close();
	}

}
