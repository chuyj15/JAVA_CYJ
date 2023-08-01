package Day04.Ex04_ObjectArray;

import java.util.Scanner;

/* 책제목, 저자명을 갖는 Book 클래스를 정의하고, 
 * Book 클래스타입의 객체 배열을 생성하여
 * 사용자로부터 책 3권을 입력받아 출력하는 프로그램을 작성하시오.
 */

class Book{
	String title, author;
	//생성자
	public Book() {
		this("제목없음", "작자미상");
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
//???
//	@Override //annotation. 메소드오버라이딩을 했을 때 붙음. 부모에 toString이 있을것이다 추측 가능. 
//	//모든 클래스는 java.lang.Object를 상속한다! (참조 자료형의 특징)
//	public String toString() {
//		return "Book [title=" + title + ", author=" + author + "]";
//	}
	
	
	
}

public class BookArray {
	public static void main(String[] args) {
		//Book타입의 객체 배열 선언 및 생성
		Book[] bookArray= new Book[3]; //bookArray라는 객체를 생성했는데 배열임. 
		Scanner sc = new Scanner(System.in);
		//사용자 입력
		for (int i = 0; i < bookArray.length; i++) {
			System.out.print("제목: ");
			String title = sc.nextLine();
			System.out.print("저자: ");
			String author = sc.nextLine();
			
			//Book객체를 생성하여 bookArray 배열요소에 삽입
			bookArray[i] = new Book(title, author);
		}
		//출력
		for (Book book : bookArray) {
			System.out.println(book);
		}
		sc.close();
	}
	
}
