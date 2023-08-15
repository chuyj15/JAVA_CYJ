package JavaMission.m15;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {
	//현재 발행일
		public static String now() {
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd일 (E) HH:mm:ss");
			String today = sdf.format(cal.getTime());
			return today;
		}
		//추첨일
		public static String late() {
			Calendar cal = Calendar.getInstance();
			if (cal.get(Calendar.DAY_OF_WEEK) ==7 && cal.get(Calendar.HOUR_OF_DAY) <=21 ) {
				cal.set(Calendar.HOUR_OF_DAY, 21);
				cal.set(Calendar.MINUTE, 0);
				cal.set(Calendar.SECOND, 0);
				
			} else {
				cal.add(Calendar.DAY_OF_MONTH, (7-cal.get(Calendar.DAY_OF_WEEK)));	
				cal.set(Calendar.HOUR_OF_DAY, 21);
				cal.set(Calendar.MINUTE, 0);
				cal.set(Calendar.SECOND, 0);
			}
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd일 (E) HH:mm:ss");
			String today = sdf.format(cal.getTime());
			return today;
		}
		//지급기한
		public static String lim() {
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE, 1);	
			cal.add(Calendar.YEAR, 1);	
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd일 (E)");
			String today = sdf.format(cal.getTime());
			return today;
		}
		
	
	
	
	
	
	
	
	
	
	
	
}
