package Day12.Ex02_Text;
//이해됨
import java.text.DecimalFormat;

public class DecimalFormatEx {
	public static void main(String[] args) {
		//DecimalFormat : 숫자 형식 클래스
		//: 숫자 데이터를 원하는 형식으로 표현하게 해주는 클래스
		//ex) 천 단위 구분 기호: 1,000,000
		
		double num = 1234.5678;
		
		//숫자 형식 패턴 기호
		//0		: 10진수를 표기, 빈자리를 0으로 채움
		//#		: 10진수를 표기, 빈자리를 채우지 않음
		//,		: 단위 구분
		//.		: 소수점
		//%		: 100을 곱하고 % 표기 (백분율)
		// \u00A4 : \(원화 표시)
		DecimalFormat df = new DecimalFormat("0");			//소숫점에 있는 건 반올림해서 표기해줌!
		System.out.println(df.format(num));				//1235
		
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));				//1234.6
		
		df = new DecimalFormat("00000.00000");
		System.out.println(df.format(num));				//01234.56780
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));				//1235
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));				//1234.6
		
		df = new DecimalFormat("#####.#####");
		System.out.println(df.format(num));				//1234.5678
		
		double num2 = 10000000;
		
		//천 단위 구분(,)
		df = new DecimalFormat("#,###");
		System.out.println(df.format(num2));				//10,000,000
		
		
		double num3 = 123;
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num3));				//+123.0
		
		double num4 = 0.2454;					//(백분율)
		df = new DecimalFormat("#.#%");
		System.out.println(df.format(num4));				//24.5%
		
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num2));				//₩ 10,000,000
		
		
		
		
		
	}
}
