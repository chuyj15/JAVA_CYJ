package Day15;

import java.io.FileInputStream;

public class Ex06_FileInputStream {
	public static void main(String[] args) {
		
		byte[] data = new byte[100];
		
		try {
			FileInputStream fin = new FileInputStream("./src/Day15/Test.out");
			int i=0, b;
			while ( (b=fin.read()) != -1 ) {
				data[i] = (byte)b;		//읽어온 바이트 b를 바이트 배열에 형변환하여 대입
				i++;
			}
			
			for (byte a : data) {
				System.out.print( (char) a);
			}
			System.out.println();
			fin.close();
		} catch (Exception e) {
			System.err.println("입출력 시, 예외가 발생하였습니다. ");
			e.printStackTrace();
		}
		
		//한글을 입력한 걸 프린트하니까 문자가 깨져서 나옴. 
		
		
		
		
		
		
		
		
		
	}
}
