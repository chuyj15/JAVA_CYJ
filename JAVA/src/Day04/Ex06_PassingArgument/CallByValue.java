package Day04.Ex06_PassingArgument;

public class CallByValue {
	public static int sum(int a, int b) { // (a,b): 10,20 이 넘어옴. 
		a=100;
		b=200;
		System.out.println("****sum 메소드****");
		System.out.println("(a,b): "+a+","+b); //a=100, b=200
		int sum = a+b;
		return sum; //300
	}
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("****main 메소드****");
		System.out.println("(a,b): "+a+","+b); // (a,b): 10,20
	
		int sum = sum(a,b);  //300
		System.out.println("sum: "+sum);
		
		System.out.println("****sum 메소드 호출 후****");
		System.out.println("(a,b): "+a+","+b);
	}

}
