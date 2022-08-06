/* 백준 10757번(step7-8): 큰 수 A+B */
/* JAVA - BufferedReader, StringTokeninizer, BigInteger */

package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.BigInteger;

// 엄청 큰 수를 계산하기 위한 BigInteger
// 덧셈 : num1.add(num2)
// 뺄셈 : num.substract(num2)
// 곱셈 : num1.multiply(num2)
// 나눗셈 : num1.divide(num2)
// 나머지 : num1.remainder(num2)

public class Baek7_8_10757 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		
		System.out.println(A.add(B));

	}

}
