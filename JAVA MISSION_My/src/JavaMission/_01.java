package JavaMission;

import java.util.Scanner;

public class _01 {
	int eng, math, java;

	public _01(int eng, int math, int java) {
		super();
		this.eng = eng;
		this.math = math;
		this.java = java;
	}
	
	public void method() {
		int sum = eng+math+java;
		double average = sum/3;
		System.out.println("영어 점수 : "+eng);
		System.out.println("수학 점수 : "+math);
		System.out.println("자바 점수 : "+java);
		System.out.println(sum);
		System.out.println(average);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		_01 student = new _01(a, b, c);
		student.method();
		
		sc.close();
	}
}
