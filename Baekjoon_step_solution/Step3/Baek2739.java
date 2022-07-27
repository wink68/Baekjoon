package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2739 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N1 = Integer.parseInt(br.readLine());
		for (int N2=0; N2<9; N2++) {
			System.out.println (N1 + " * " + (N2+1) + " = " + N1*(N2+1));
		}

	}

}
