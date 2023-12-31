package Day15;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04_FileReadAndWrite {
	public static void main(String[] args) {
		//직접 입력한 문자를 텍스트 파일로 출력하는 프로그램
		//테스트 : 문자열을 입력하고 마지막에 ctrl + Z 단축키 입력 (EOF 가 입력됨)
		//EOF (End Of File) : 파일의 끝을 알려주는 키워드
		
		InputStreamReader is = new InputStreamReader(System.in); //키보드로 입력받음. 
		FileWriter fw = null;
		int data = 0;
		try {
			fw = new FileWriter("./src/Day15/Test3.txt");
			while ((data = is.read()) != -1) {			//읽고
				fw.write(data);							//쓰고
			}
			is.close();
			fw.close();
		} catch (IOException e) {
			System.err.println("입출력 시, 예외가 발생하였습니다.");
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
