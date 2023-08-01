package Day05.Ex01_StaticMember;
class Calculator{
	//아래 연산결과를 구하는 메소드를 작성하시오.
	//1. 절댓값
	//2. 최댓값
	//3. 최솟값
	public static int abs(int val) {
		return val >0 ? val: -val; //삼항연산자(조건연산자)
	}
	public static int max(int arr[]) {
		int max = Integer.MIN_VALUE;
		for (int a : arr) {
			if (max<a)
				max=a;
		}
		return max;
	}
	public static int min(int arr[]) {
		int min = Integer.MAX_VALUE;
		for (int a : arr) {
			if (min>a)
				min=a;
		}
		return min;
	}
}
public class StaticCalculator {
	public static void main(String[] args) {
		int arr[] = {70,90,85,50,100};
		//다른 클래스의 static메소드를 호출할 때는, 
		//클래스.메소드명(); 형태로 호출한다. 
		System.out.println("abs(-123) : " +Calculator.abs(-123));
		System.out.println("max(arr) : "+Calculator.max(arr));
		System.out.println("mina(arr) : " +Calculator.min(arr));
		
	}
	
		//Math.random(); //Math클래스에 static메소드인 random를 호출한 것!!
	
}
