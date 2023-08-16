package Day16.Ex02_Stream;

import java.util.Arrays;

public class StreamArraySum {
	
	//메소드1
	public static int method1(int[] arr) {
		int sum=0;
		for (int i :  arr) {
			sum += i;
		}
		return sum;
	}
	
	//메소드2
	public static int method2(int[] arr) {
		//스트림을 사용~!
		//스트림: 컬렉션을 반복해주는 도구임. 
		return Arrays.stream(arr).sum();
	}
	
	
	//메인메소드
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int result1 = method1(arr);
		int result2 = method2(arr);
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		
		
		
		
	}
}
