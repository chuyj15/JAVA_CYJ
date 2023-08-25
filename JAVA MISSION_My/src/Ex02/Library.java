package Ex02;

import java.util.ArrayList;

/*
<제출> 패키지명 : Ex02 / 파일명 : Book.java, Library.java
########## 휴먼 스터디 도서관 ##########
123123 | 이게 자바냐 | 감자바 | 자바 감자바 | 33000 
112112 | 정보처리기사 | 김휴먼 | 국가기술자격 | 45000
001001 | 실무 DB | 박디비 | 디비디비딥 | 60000
 */
public class Library {
	
	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<Book>();
		Book book1 = new Book("123123","이게 자바냐", "감자바", "자바 감자바", 33000);
		Book book2 = new Book("112112","정보처리기사", "김휴먼", "국가기술자격", 45000);
		Book book3 = new Book("001001","실무 DB","박디비", "디비디비딥", 60000);
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		System.out.println("########## 휴먼 스터디 도서관 ##########");
		for (Book book : bookList) {
			String isbn = book.getIsbn();
			String title= book.getTitle();
			String writer= book.getWriter();
			String content= book.getContent();
			int price= book.getPrice();
			System.out.printf("%-10s|%-10s|%-10s|%-10s|%-10d", isbn,title,writer,content,price);
			System.out.println();
		}
		
		
		
	}
}
