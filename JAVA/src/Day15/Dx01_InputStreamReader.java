package Day15;

import java.io.InputStreamReader;

public class Dx01_InputStreamReader {
	public static void main(String[] args) {
		
		//문자 스트림 클래스
		// System.in : 키보드로부터 문자 입력
		InputStreamReader is = new InputStreamReader(System.in);
		
		while(true) {
			char ch = 0;
			
			try {
				ch = (char) is.read();		//입력스트림으로부터 한 글자씩 읽어옴. 
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			//reda() 로 더 이상 읽어올 문자가 없으면 -1을 반환	(ctrl + Z 입력)
			if (ch == -1) {
				break;
			}
			
			System.out.println(ch);
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
