package answer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarQuiz4 {
	public static void main(String[] args) {
		// "첫 문자열을 입력해 주세요. :"
		// "두번째 문자열을 입력해 주세요. :"
		// yyyymmdd * 2
		// 날자를 일 단위로 계산하는 프로그램 getDayDiff(str from, str to)
		// 문자열 확인 checkStr -> return 0

		Scanner sc = new Scanner(System.in);

		System.out.println("날짜 입력 : ");
		String from = sc.nextLine();

		System.out.println("날짜 입력 : ");
		String to = sc.nextLine();

		System.out.println(getDayDiff(from, to));

	///////////// 방법 2
		
	
		
	}
	
	
	public static Calendar setNCalendar(String date) {
		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.YEAR, Integer.parseInt(date.substring(0,4)));
		
		return c;
	}
	
	public static boolean chkValid (String from, String to) {
		if() {
			retuen false;
		}
	}

	public static long getDayDiff(String from, String to) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		try {
			Date startDay = sdf.parse(from);
			Date endDay = sdf.parse(to);

			long diff = endDay.getTime() - startDay.getTime();
			long diffdays = diff / 86400000;
			return diffdays;
		} catch (ParseException e) {
			System.out.println("오류 발생 : 0을 반환합니다.");
			return 0;
		}
	}
}
