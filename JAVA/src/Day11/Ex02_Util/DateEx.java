package Day11.Ex02_Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) throws ParseException {
		//Date 객체는 시스템에서 현재 날짜를 가져온 정보를 가지고 있다.
		Date now = new Date();		//데이트객체 생성
		System.out.println("now: "+now);	//출력해보니 기본포맷으로 출력해준다.
		
		String dateStr = now.toString();
		System.out.println("Date 문자열 기본 포맷: "+dateStr);
		
		// 날짜/시간/ 문자
		// yyyy:년도, MM:월, dd: 일
		//hh: 시, mm: 분, ss:초
		String dateFormat = "yyyy년 MM월 dd일 hh시, mm분, ss초";
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);	//위의 형식으로 날짜를출력하고싶음. 
		String nowStr = sdf.format(now);	//Date객체를 넣어주면 각각 형식에 대입해서 문자열로 만들어줌. 
		System.out.println(nowStr);
		
		String day1 = "2023/07/25";	//개강
		String day2 = "2024/01/24";	//종강
		
		Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse(day1);	//parse는 기존 문자열을 분석해서 년/월/일로 만들어서 Date객체로 반환해줌. 
		//하지만 만약에 기호가 일치하지 않으면 분석에 오류가 생길 수 있음. String day1 = "2023.07.25" 인데 포맷은 "yyyy/MM/dd" 인 경우
		Date date2 = new SimpleDateFormat("yyyy/MM/dd").parse(day2);
		//Date.getTime()
		// : 1970년 1월1일0시0분0초 부터 Date에 지정된 날짜/시간까지의 ms(밀리초) 누적
		long gapDays = (date2.getTime() - date1.getTime()) / (1000*60*60*24);
		long gapHours = (date2.getTime() - date1.getTime()) / (1000*60*60);
		long gapMin = (date2.getTime() - date1.getTime()) / (1000*60);
		long gapSec = (date2.getTime() - date1.getTime()) / (1000);
		
		System.out.println("종강 D-day: "+gapDays);
		System.out.println("종강까지 남은 시간(/시): "+gapHours);
		System.out.println("종강까지 남은 시간(/분): "+gapMin);
		System.out.println("종강까지 남은 시간(/초): "+gapSec);
		
		//Date객체의 getXXX() 메소드는 deprecated(더이상 사용권장 안 함)
		//--> 날짜의 년/월/일 추출하는 기능은 Calendar 클래스에서 주로 사용
		System.out.println("Today (년): "+date1.getYear());		//2023이 나왔으면 좋겠는데 출력값이 123이 나옴. 
		System.out.println("Today (월): "+date1.getMonth());		
		System.out.println("Today (일): "+date1.getDate());		
		
		Date today = new Date();
		System.out.println("오늘: "+today);
		
		long dayTime = (1000*60*60*24); 		//1일 : ms단위 : 1000*60*60*24
		long day5TimeValue = 5* dayTime;		//5일 ms단위
		long day10TimeValue = 10* dayTime;	
		long day100TimeValue = 100* dayTime;	
		
		//5일 후
		Date after5Days = new Date();
		after5Days.setTime(today.getTime()+ day5TimeValue );//today.getTime() : 오늘을 ms단위로 가져와줌. 
		String after5DayStr = sdf.format(after5Days);
		System.out.println(after5DayStr);
		//10일 후
		Date after10Days = new Date();
		after5Days.setTime(today.getTime()+ day10TimeValue );//today.getTime() : 오늘을 ms단위로 가져와줌. 
		String after10DayStr = sdf.format(after10Days);
		System.out.println(after10DayStr);
		//100일 후
		Date after100Days = new Date();
		after100Days.setTime(today.getTime()+ day100TimeValue );//today.getTime() : 오늘을 ms단위로 가져와줌. 
		String after100DayStr = sdf.format(after100Days);
		System.out.println(after100DayStr);
		
	}
}
