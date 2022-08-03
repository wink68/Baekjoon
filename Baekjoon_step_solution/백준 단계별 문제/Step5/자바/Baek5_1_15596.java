/* 백준 15596번(step5-1): 정수 N개의 합, 함수 */
/* JAVA - BufferedReader */

package step5;

public class Baek5_1_15596 {
	long sum (int[] a) {                       // a : 정수 n개가 저장되어 있는 배열
		long sum = 0;                          // 정수 long형
		
		for (int i = 0; i <a.length; i++) {    // 마지막 번째 수 = 배열 총 길이-1
			sum += a[i];                       // a배열에서 0번째부터 총합
		}
		return sum;
	}
}
