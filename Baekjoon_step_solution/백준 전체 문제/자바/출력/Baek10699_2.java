/* 백준 10699번: 오늘 날짜 */
/* JAVA - Date(), SimpleDateFormat() */

package 출력;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Baek10699_2 {

	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat now = new SimpleDateFormat("YYYY-MM-dd");
		
		System.out.println(now.format(today));

	}

}
