package Day11.Ex02_Util;

import java.util.Calendar;

public class CalenderEx {
		//메소드
		public static void printCalendar(String msg, Calendar cal) {
			int year = cal.get(Calendar.YEAR);
			//위에를 int year = cal.get(Calendar.1); 로 써도 됨.
			int month = cal.get(Calendar.MONTH) +1 ;			//월(0~11)
			int day = cal.get(Calendar.DAY_OF_MONTH);
			int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);		//일~토(1~7)
			int hour = cal.get(Calendar.HOUR);					//12시 표시
			int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);		//24시 표시
			int ampm = cal.get(Calendar.AM_PM);
			int minute = cal.get(Calendar.MINUTE);
			int second = cal.get(Calendar.SECOND);
			int millisecond = cal.get(Calendar.MILLISECOND);
			System.out.println(msg+" : "+year+"/"+month+"/"+day+"/");		//출력: 현재 : 2023/8/8/
			
			//일요일(1)~토요일(7)
			String Day = "";
			switch (dayOfWeek) {
			case Calendar.SUNDAY: Day = "일요일"; break;
			case Calendar.MONDAY: Day = "월요일"; break;
			case Calendar.TUESDAY: Day = "화요일"; break;
			case Calendar.WEDNESDAY: Day = "수요일"; break;
			case Calendar.THURSDAY: Day = "목요일"; break;
			case Calendar.FRIDAY: Day = "금요일"; break;
			case Calendar.SATURDAY: Day = "토요일"; break;
			}
			System.out.println(Day);		//출력: 화요일
			System.out.println("("+hourOfDay+"시)");		//출력: (15시)
			if(ampm==Calendar.AM)
				System.out.print("오전 ");
			if (ampm==Calendar.PM)
				System.out.print("오후 ");
			System.out.println(hour+"시 "+minute+"분 "+second+"초 "+millisecond+"밀리초");		//출력: 오후 3시 51분 36초 158밀리초
		}
		
		public static void main(String[] args) {
			Calendar now = Calendar.getInstance();		//객체 하나를 생성함. 
			//SingleTon이라서 getInstance를 쓰는건가? =>no!!
			//getInstance() 메소드를 통해서만 객체를 생성할 수 있지만,
			//매번 메소드 호출 마다 새로운 객체를 생성하여 반환합니다.
			//Calendar now2 = new Calendar(); 라고 쓰진 않음. 
			printCalendar("현재", now);			
			
			Calendar test = Calendar.getInstance();
			//월(MONTH) : 0~11(1월~12월)
			test.set(2024, Calendar.JANUARY, 24);//set 메소드를 보면 매개변수가 3개 들어갈 때는 년월일을 써주면 됨. 
			// test.set(2024, 0, 24);
			
			//오늘~종강일 D-day
			//getTimeInMillis() : 날짜를 ms(밀리초) 단위까지 숫자로 반환
			//1970년 1월 1일 0시 0분 0초 0ms 부터 카운트한 숫자를 반환
			//0.001초		: 1ms
			//60초 			: 1분
			//60분			: 1시간
			//24시			: 1일
			long nowT = now.getTimeInMillis() / (1000*60*60*24);
			long testT = test.getTimeInMillis()/ (1000*60*60*24);
			System.out.println("1970년1월1일~오늘날짜까지 일 수: "+nowT);
			System.out.println("1970년1월1일~종강날짜까지 일 수: "+testT);
			System.out.println("D-Day : "+(testT-nowT)+"일");
			
			if (now.before(test)) {
				System.out.println("종강 전입니다.");
			}else if (now.after(test)) {
				System.out.println("수업이 종료된 강의입니다.");
			} else if (now.equals(test)) {
				System.out.println("오늘이 종강일입니다. ");
			}
			
		
	}
}
