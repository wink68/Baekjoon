/* 백준 10952번(step3-11): A+B 출력 */
/* JAVA - BufferedReader, StringTokenizer */

package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek3_11_10952_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();  // A+B 값을 넣을 공간 생성
		
		while(true) {   // 여러 번 실행할 때
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");  // br값 쪼개기
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if (A==0 && B==0) {
				break;
			
			}
			sb.append(A+B).append('\n');
		}
		System.out.println(sb);
		br.close();

	}

}
