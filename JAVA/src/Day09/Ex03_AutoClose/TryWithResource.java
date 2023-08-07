package Day09.Ex03_AutoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResource {
	public static void main(String[] args) {
		
		//test.txt 파일을 입력받는 객체
		//try (자동으로 자원해제할 객체 생성){}
		//: finally 구문에서 close()하지 않아도, 자동으로 자원해제를 해준다.
		//* AutoClosable 인터페이스를 구현한 클래스여야 자동으로 자원해제 가능
		
		//FileInputStream fis  = null;
		try (FileInputStream fis = new FileInputStream("test.txt")) {	//여기서 예외발생가능성 있음 "파일을 찾을 수 없습니다."
			//fis = new FileInputStream("test.txt");
			//FileInputStream fis = new FileInputStream("test.txt");
			
			int read = 0;
			while ((read= fis.read()) != -1) {		//한글자한글자씩 읽어드려와서 출력함 //여기서 "입출력 관련 예외 발생" 오류발생할수있음. 
				//질문) read = fis.read()는 원래 char형인데 int형으로 형변환함. 그리고 프린트할 때는 다시 char형으로 바꿈.
				//답변) fis.read()의 자료형은 int 형임. 형변환한게 아님. syso할 때 int형을 char형으로 바꾸는 형변환만 이뤄짐. 
				System.out.println( (char) read );
			}
			
		} catch (FileNotFoundException e) {			//파일이 없을 때 예외처리
			//e.printStackTrace();			//예외발생원인을 단계적으로 추적해서 알려줌
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			//e.printStackTrace();
			System.err.println("입출력 관련 예외 발생");
		}
//		finally {
//			try {
//				fis.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		
		
		
		
	}
}
