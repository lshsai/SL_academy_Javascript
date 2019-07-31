import java.util.Calendar;

public class E07_Calender {

	public static void main(String[] args) throws InterruptedException {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);

		int year = cal.get(Calendar.YEAR);
		int mon = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);

		System.out.println(year + "년" + mon + "월" + day + "일");
		System.out.println(hour + "시" + min + "분" + sec + "초");

		Thread.sleep(500);

		// 1: sun
		// 7 : sat
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		cal.set(Calendar.DATE, 24);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		// 2020.7.7
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 6);
		cal.set(Calendar.DATE, 7);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(Calendar.TUESDAY);
	}
}
