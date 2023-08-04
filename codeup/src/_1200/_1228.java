package _1200;

import java.util.Scanner;

public class _1228 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키와 몸무게를 입력하시오: ");
		double height = sc.nextDouble();
		double weight = sc.nextDouble();
		
		double stanW = (height-100)* 0.9;
		double fat = (weight-stanW)*100 / stanW;
		
		System.out.println("비만도: "+fat);
		
		//방법1
		if (fat<=10) System.out.println("정상");
		if (10<fat && fat<=20) System.out.println("과체중");
		if (fat>20) System.out.println("비만");
		
		//방법2
		if  (fat<=10) {
			System.out.println("정상");
		} else if (fat<=20) {
			 System.out.println("과체중");
		} else { System.out.println("비만");
		}
		
		sc.close();
		
	}
}
