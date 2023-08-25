package Ex03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/*
 [문제3번] 모두의 코딩에서 월말 코딩 대회를 열었다. 매니저는 학생들의 성적을 취합하여 
“student.txt” 파일로 정리하였다. 한 학생의 성적은 다음과 같은 양식으로 기록되어 있다. txt 파일
에서 학생들의 성적정보 (번호/이름/성적/수업이름) 추출하여, 성적 순으로 내림차순, 번호 순으로 
오름차순 정렬하여 출력하시오.
<조건>
- 아래 txt 파일을 읽어 List로 변환하는 메소드를 참조하여 프로그램을 완성하시오.
 */
public class Manager{
	//텍스트 파일 입력하고 링크드리스트를 반환하는 메소드
	public static LinkedList<Student> getTxtToList() {
		LinkedList<Student> list = new LinkedList<>();
		try {
			//파일경로가 ./src부터 있어야 읽을 수 있네!
			File file = new File("./src/Ex03/student.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				String[] std = str.split("/");
				int no = Integer.parseInt(std[0]);
				String name = std[1];
				int score = Integer.parseInt(std[2]);
				String className = std[3];
				Student student = new Student(no, name, score, className);
				list.offer(student);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일못읽어옴");
		} 
		return list;
	}
	
	public static void main(String[] args) {
		LinkedList<Student> sortedList = getTxtToList();
		
		Collections.sort( sortedList );
		
		for (Student student : sortedList) {
			int no = student.getNo();
			String name = student.getName();
			int score = student.getScore();
			String className = student.getClassName();
			System.out.printf("%-4d %-4s %-5d %-5s %n" , no ,name ,score ,className);
		}
	}
	
	
}
