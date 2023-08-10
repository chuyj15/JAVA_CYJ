package Day12.Ex01_Time;

import java.time.LocalDateTime;

public class DateTimeOperation {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재 시간: "+now);
		
		//날짜, 시간 추가하기
		//+1년 +1개월 +1일 -3시간 -15분 -25초
		LocalDateTime targetTime = now.plusYears(1);
		targetTime = targetTime.plusMonths(1)
								.plusDays(1)
								.plusHours(-3)
								.plusMinutes(-15)
								.plusSeconds(-25)
								; //(메소드 체인), 빌더 패턴
		
		// 그냥 메소드만 사용했을 때는 안들어감. 밑에 
		// targetTime.plusMonths(1); 처럼.. 
		//왜냐면 , 이 메소드가 반환하는 건 LocalDateTime객체임. 새로운 객체가 생성된 거나 마찬가지임. 
		
		System.out.println("변경시간: "+targetTime);
		
		
		
		
		
		
		
		
		
	}
}
