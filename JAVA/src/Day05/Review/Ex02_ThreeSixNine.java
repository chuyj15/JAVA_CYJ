package Day05.Review;

public class Ex02_ThreeSixNine {
	public static void main(String[] args) {
		//정수 1~100까지 반복하면서, 해당 수가 3 또는 6 또는 9일 때, 
		//369가 되는 개수만큼 "*"를 출력하는 프로그램을 작성하시오. 
		//ex) 3 --> "*"
		//	  39--> "**"
		//    40--> 40
		
		for (int i = 0; i < 100; i++) {
			int ten = i/10;
			int one = i%10;
			boolean ten369 = (ten==3||ten==6||ten==9);
			boolean one369 = (one==3||one==6||one==9);
			
			if (ten369 && one369) { //10의 자리수가 369인지?
				System.out.println("**");
			}
			else if (ten369 || one369) { //1의 자리수가 369인지?
				System.out.println("*");
			} else {
				System.out.println(i);
			}
		}
		
		
		
		
		
	}
}
