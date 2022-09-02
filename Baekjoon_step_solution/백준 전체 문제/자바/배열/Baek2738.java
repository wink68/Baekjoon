/* 백준 2738번: 행렬 덧셈 */
/* JAVA - BufferedReader, StringTokenizer, StringBuilder */

package 배열;

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2738 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[N][M];
		
		
		// 1. A 배열에 값 대입
		for (int i=0; i < N; i++) {           // N개의 행
			st = new StringTokenizer(br.readLine());
			
			for (int j=0; j < M; j++) {   // M개의 열
			arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		// 2. A배열 값에 B배열 값 합산
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i < N; i++) {           // N개의 행
			st = new StringTokenizer(br.readLine());
			
			for (int j=0; j < M; j++) {   // M개의 열
				int sum = arr[i][j] + Integer.parseInt(st.nextToken());
				sb.append(sum).append(" ");
			}
			sb.delete(sb.length()-1, sb.length()).append('\n');  // N줄 끝 공백 제거 및 엔터 추가
			
		}
		System.out.println(sb);
		
		br.close();
	}

}
