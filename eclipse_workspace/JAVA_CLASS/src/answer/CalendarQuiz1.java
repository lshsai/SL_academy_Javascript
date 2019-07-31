package answer;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;



public class CalendarQuiz1 {
	public static void main(String[] args) {
		// 2010년 매월 2번째 일요일의 날짜 everyMonthTwoSun
		// ArrayList로 저장한 뒤 출력
		
		Calendar c = Calendar.getInstance();
		
		
		c.set(2010, 1, 1);
		System.out.println(c.getTime());
		
		ArrayList<Date> secondSunDayList = new ArrayList<>();
		for(int mon = 0; mon < 12; mon++) {
			c.set(Calendar.MONTH, mon);
			c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
			c.set(Calendar.DAY_OF_WEEK_IN_MONTH, 2);
			
			secondSunDayList.add(c.getTime());
		}
		
		SimpleDateFormat simple = new SimpleDateFormat("yyyy.MM.dd / hh:mm:ss / aa / E");
		
		
		for (Date ss : secondSunDayList)
			System.out.println(simple.format(ss));
			//	System.out.println(ss);

	}
}
