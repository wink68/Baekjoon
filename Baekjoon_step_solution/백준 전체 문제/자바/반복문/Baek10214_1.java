/* 백준 10214번: Baseball */
/* JAVA - BufferedReader, BufferedWriter, StringTokenizer */

package solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.util.StringTokenizer;

public class Baek10214_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());                 // 테스트 케이스 T
		
		for (int i=0; i < T; i++) {
			int Y = 0;
			int K = 0;
			
			for (int j=0; j < 9; j++) {                      // 9번 득점
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");  // 런타임 에러 때문에 for문 안에 배치
				Y += Integer.parseInt(st.nextToken());   // 각 회마다 Y대 점수 적립
				K += Integer.parseInt(st.nextToken());   // 각 회마다 K대 점수 적립
				}
				
			if (Y > K) {
				bw.write("Yonsei\n");  // BufferedWriter엔 "ln"이 없기에 "\n" 추가
			}
			else if (Y < K) {
				bw.write("Korea\n");
			}
			else if (Y == K) {
				bw.write("Draw\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}

}

