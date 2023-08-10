package Day13.Ex01_Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VectorEx {
	/*
	 * List출력 메소드
	 */
	public static void printList(List<?> list) {	//List와 하위클래스만 넣을 수 있음. //<>안에는 아무거나 넣을 수 있음.
		
		if (list ==null || list.isEmpty() ) {
			//list ==null  : list를 만들었는데, 안에 아무것도 없음. 벡터를 넣은 적이 없음
			//list.isEmpty() : list안에 vector를 넣었는데 vector안에 아무것도 없음. 사이즈가 0임.
			// list.isEmpty() || list ==null 이렇게 쓰면 문제가 생김.
			//왜? list.isEmpty()  쇼트서킷!! 얘를 먼저 체크하니까.. 뒤에는 실행을 안함.
			System.out.println("요소가 없습니다.");
			return;
		}
		Iterator<?> it = list.iterator();
		while (it.hasNext()) {
			Object item = it.next();
			System.out.print(item);
			
			if (it.hasNext()) System.out.print(", ");
			else System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		//컬렉션 객체 생성
		//컬렉션 타입 <요소 타입> 변수명 = new 클래스명<요소타입>();
		
		//벡터 객체 생성
		Vector<String> vector = new Vector<String>(10);	//10을 안써도 됨. 기본적으로 10개의 칸을 생성함. 
		
		//요소 추가
		vector.add("아메리카노");
		vector.add("청포도에이드");
		vector.add("인크레드불");
		vector.add("초코우유");
//		vector.add("초코우유");
//		vector.add("초코우유");
//		vector.add("초코우유");
//		vector.add("초코우유");
//		vector.add("초코우유");
//		vector.add("초코우유"); //10개
//		vector.add("초코우유");
//		vector.add("초코우유");
		
		//개수 확인
		System.out.println("개수: "+vector.size());
		//용량 capacity : 기본 10개 
		System.out.println("용량: "+vector.capacity());
		System.out.println();
		
		//검색
		//반복 방법1
		System.out.println(">> 반복 1");
		for (int i = 0; i < vector.size(); i++) {
			String item = vector.get(i);
			System.out.println("메뉴 이름: "+item);
		}
		System.out.println();
		
		//반복 방법2
		System.out.println(">> 반복 2");
		for (String item : vector) {
			System.out.println("메뉴 이름: "+item);
		}
		System.out.println();
		
		//반복 방법3
		//Iterator를 이용한 방법
		//iterate: 반복하다, iterator: 반복자
		//해당 리스트 컬렉션으로부터 Iterator객체를 가져와서 반복할 수 있음.
		
		//Iterator 메소드
		//hasNext() : 다음 요소의 존재여부
		//next() :  다음 요소를 반환
		//컬렉션객체.iterator() :  해당 컬렉션에 대한 iterator 객체를 반환
		System.out.println(">>반복 3");
		//Iterator:인터페이스: 커서의 역할
		Iterator<String> it = vector.iterator();
		while (it.hasNext()) {
			String item = it.next();
			System.out.print(item);
			
			if (it.hasNext()) System.out.print(", ");
			else System.out.println();
		}
		
		System.out.println("-------------------");
		System.out.println("삭제 전 출력");
		printList(vector);
		
		// 삭제
		// - 삭제할 때, index가 앞으로 한 칸씩 당겨진다. 
				//0	   		1		2		3
				//아메리카노 청포도에이드  인크레드불  초코우유
				//청포도에이드  인크레드불  초코우유
				//인크레드불  초코우유
				//초코우유
				//아무것도 안남음..ㅎㅎ
		vector.remove(0);
		vector.remove(1);
		vector.remove("청포도에이드");
		vector.remove("초코우유");
		
		System.out.println("삭제 후 출력");
		printList(vector);
		System.out.println("---------------------");
		
		//컬렉션.isEmpty() : 요소가 하나도 없으면 true, 비어있지 않으면 false 
		if (vector.isEmpty()) {
			System.out.println("메뉴가 없습니다.");
		}
		else {
			printList(vector);
		}
		Scanner sc = new Scanner(System.in);
		List<String> newMenuList = new Vector<String>();
		System.out.println("메뉴 추가하기 (종료:0)");
		do {
			System.out.print("추가메뉴: ");
			String menu = sc.nextLine();
			if (menu.equals("0")) break;
			newMenuList.add(menu);
		} while (true);
		
		System.out.println("####[vector]####");
		printList(vector);
		System.out.println("####[newMenuList]####");
		printList(newMenuList);
		
		vector.addAll(newMenuList);		//vector <- newMenuList의 요소 모두 추가
		System.out.println("####[vector]####");
		printList(vector);
		
		
		sc.close();
		
	}
}