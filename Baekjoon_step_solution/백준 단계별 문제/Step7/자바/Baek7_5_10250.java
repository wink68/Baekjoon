/* 백준 10250번(step7-5): ACM호텔 */
/* JAVA - BufferedReader, StringTokenzier, StringBuilder */

package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek7_5_10250 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());  // 테스트 개수
		
		for (int i=0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int H = Integer.parseInt(st.nextToken());  // N번째 손님
			st.nextToken();                            // 방의 수는 불필요
			int N = Integer.parseInt(st.nextToken());  // H는 건물 층수
			
			
			// 배정: Y는 층수, X는 호수 (엘리베이터로부터 떨어진 거리)
			int X, Y;
			if (N % H == 0) {   // 꼭대기 층, 꼭대기층은 몫 = 호수
				Y = H *100;
				X = N / H;
				sb.append(Y + X).append('\n');
				
			} else {
				Y = (N % H) *100;
				X = (N / H) +1;  // 몫이 호수, 몫이 0일때 맨 처음 1호수가 있기에 +1
				sb.append(Y + X).append('\n');
			}
		}
		System.out.print(sb);
		br.close();
	}

}
