package Day13.Ex01_Collection;

import java.util.LinkedList;
import java.util.Queue;
/*
 * Queue : 먼저 추가된 데이터가 가장 먼저 나오는 자료구조
 		FirstIn FirstOut (F.I.F.O)
 		
  데이터 추가 - Enqueue: 한 쪽에서 데이터를 추가하는 연산
  데이터 삭제 - Dequeue: 가장 먼저 추가한 데이터를 삭제하는 연산
  
  앞쪽 : front, head
  뒤쪽 : rear, tail
  
  요소 추가
  add()	:데이터를 추가하여 성공하면, true 반환
  				*추가할 공간이 없으면 예외 발생
  offer()	: 용량 제한을 위반하지 않고 데이터 추가
  				*용량이 넘어가면 false를 반환
  
  요소 검색
  element()	: head의 데이터를 반환
  peek()	: head의 데이터를 반환, 큐가 비어있으면 null반환
  
  요소 삭제
  remove()	: head의 데이터를 삭제하고, 삭제된 값을 반환	//큐가 비어있으면 예외가 발생함. 따라서 예외처리를 해줘야할 가능성이 있음. 
  					NoSuchElementException 예외 발생
  poll()	: head의 데이터를 삭제하고, 삭제된 값을 반환, 큐가 비어있으면 null 반환	
 */


public class QueueEx {
	public static void main(String[] args) {
		//Queue 는 인터페이스이기에 객체로 구현 불가함. LinkedList로만 구현 가능함. 
		//다른 ArrayList같은 걸로 구현 불가한 이유: ArrayList는 List만 implement(구현)함. 
		//LinkedList는 Queue를 implement(구현)했기 때문에 이거로만 구현 가능함. 
		Queue<Integer> queue = new LinkedList<Integer>();
		
		//offer() :  요소 추가
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		
		for (Integer item : queue) {
			System.out.println("item : "+item);
		}
		
		//poll() : head에서 데이터를 삭제하고 삭제된 값을 반환
		int remove1 = queue.poll();		//값1 삭제
		System.out.println("삭제1: "+remove1);
		
		int remove2 = queue.poll();		//값2 삭제
		System.out.println("삭제2: "+remove2);
		
		//peek() : head에 있는 값을 반환
		System.out.println("Last item : "+queue.peek());
		
		
		
		
		
		
		
		
		
		
		
	}
}
