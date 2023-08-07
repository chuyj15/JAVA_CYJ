package Day09.Ex02_MultiCatch;

import java.util.Scanner;

public class MultiCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 자리 수인 정수 2개를 입력해주세요");
		
		try {
			
			String str1 = sc.nextLine(); //라인의 모든 글을 문자열로 인식(즉, 띄어쓰기도 한 문자열로 봄)	
			String str2 = sc.nextLine();
			
			char[] char1 = str1.toCharArray(); //String --> char[]변환	
			char[] char2 = str2.toCharArray(); //"10" --> [1][0]
			
			String[] input1 = new String[char1.length];
			String[] input2 = new String[char2.length];
			
			//char1 --> ['1']['0']
			//input1 --> ["1"]["0"]
			for (int i = 0; i < char1.length; i++) {
				input1[i] = char1[i]+""; //질문 이 코드가 이해가 안됨... 왜 ""를 쓴거지?=>답변) String형으로 형변환해줄려고. 
				
				//char1[i] + 1; 이럴 때는 char이 int타입으로 형변환되어서 A가 65로 인식이 됨. 
				//하지만 char1[i]+"" 인 경우에는 char이 string타입으로 형변환되어서 "A"가 됨. 
				//input1[i] = Character.toString( char1[i] );랑 같은 거임.
				//char 은 정수형으로 알고있는데, 만약 A를 입력하면 65로 바뀌는 것 아닌가...? 그래서 String으로 변환하면
				//"65"가 되는 것 아닌가?
				
				
				//그리고 input1[i] = (String) char1[i] 이라고 써도 상관 없나??
			}
			for (int i = 0; i < char2.length; i++) {
				input2[i] = char2[i]+"";
			}
			
			System.out.println(input1[0]+input1[1]);	//접근할수없는 배열 인덱스 범위오류가 생길 수 있음. 
			System.out.println(input2[0]+input2[1]);
			
			int value1 = Integer.parseInt(str1);	//숫자로 변환할수 없는 값일 수 있으니 여기서도 오류발생할수있음. 
			int value2 = Integer.parseInt(str2);
			int result = value1+value2;
			
			System.out.println(str1+"+"+str2+"="+result);
			
		} //멀티 catch
		// : 하나의 catch 블록에서 처리하고 싶은 예외를 | 기호로 연결하여 사용한다.
		catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("접근할 수 없는 배열 index 범위입니다.(한자리수만 입력한 경우)");
			System.out.println("숫자로 변환할 수 없는 값입니다. (문자를 입력한 경우)");
		}
		
		//다중 catch
		// : 여러 예외를 각각 다른 catch 블록으로 처리하는 것
		// * 상위 예외클래스가 하위 예외클래스보다 아래쪽에 위치해야한다.
		catch (Exception e) {
			System.out.println("이 외의 알 수 없는 예외 발생");
		}
		
		sc.close();
	}
}
