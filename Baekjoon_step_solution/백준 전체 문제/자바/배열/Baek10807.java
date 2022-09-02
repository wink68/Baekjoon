/* 백준 10807번: 개수 세기 */
/* JAVA - BufferedReader, StringTokenizer */

package 배열;

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek10807 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());    // N개 주어진 정수
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int [] arr = new int[N];
		for (int i=0; i < N; i++) {     // 정수 배열 생성
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int v = Integer.parseInt(br.readLine());  // 찾아야 하는 정수 v
		int count = 0;
		
		for (int j=0; j < arr.length; j++) {
			if (arr[j] == v)
			count++;
		}
		System.out.print(count);
		br.close();
		
	}
}
