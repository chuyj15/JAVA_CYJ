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
		try (FileInputStream fis = new FileInputStream("test.txt")) {
			//fis = new FileInputStream("test.txt");
			//FileInputStream fis = new FileInputStream("test.txt");
			
			int read = 0;
			while ((read= fis.read()) != -1) {		//한글자한글자씩 읽어드려와서 출력함
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
