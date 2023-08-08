package Day11.Ex02_Util;

import java.util.StringTokenizer;

//"1,2,3,4,5"
//","분리 --> 1 2 3 4 5 (String)
//토큰을 int 타입으로 변환하여 합계를 구해보자.

public class StringTokenizerSum {
	public static void main(String[] args) {
		String numm = "1,2,3,4,5";
		StringTokenizer st = new StringTokenizer(numm, ",");
		
		int sum = 0;
		while (st.hasMoreTokens()) {
			sum += Integer.parseInt(st.nextToken());
		}
		System.out.println(sum);
		
	}
}
