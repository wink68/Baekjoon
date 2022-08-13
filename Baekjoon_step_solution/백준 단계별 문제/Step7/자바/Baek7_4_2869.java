/* 백준 2869번(step7-4): 달팽이는 올라가고 싶다 */
/* JAVA - BufferedReader, StringTokenizer */

package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek7_4_2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// 정점에 도착하면 멈춘다
		long A = Long.parseLong(st.nextToken());  // up
		long B = Long.parseLong(st.nextToken());  // down
		long V = Long.parseLong(st.nextToken());  // length
		long rest = V - A;  // 남은 거리
		long move = A - B;  // 하루에 갈 수 있는 거리
		
		// up = 3, down = 1, length = 7, 딱 맞게 정점에 도착할 경우 (3일 걸림)
		if (rest % move == 0) {
			System.out.println(rest / move +1);
		// up = 3, down = 1, length = 8, 정점을 초과해서 도착할 경우 (4일 걸림)
		} else {
			System.out.println(rest / move +2);
		}
		br.close();
	}

}
