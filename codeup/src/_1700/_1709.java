package _1700;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * 데이터를 입력받아 내림차순으로 정렬하는 프로그램을 작성하시오.
 *   첫줄에는 데이터의 개수를 입력받는다.(100이하의 정수)
다음 줄에는 데이터가 입력된다.(100이하의 정수)

 */
public class _1709 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		//입력받음
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		for (int i = 0; i <n; i++) {
			arr.add(sc.nextInt());
		}
		
		arr.stream().sorted( Comparator.reverseOrder() ).forEach(r -> System.out.print(r+" "));
		
		sc.close();
	}
}
