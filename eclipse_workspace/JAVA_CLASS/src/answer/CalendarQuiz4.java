package answer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarQuiz4 {
	public static void main(String[] args) {
		// "ù ���ڿ��� �Է��� �ּ���. :"
		// "�ι�° ���ڿ��� �Է��� �ּ���. :"
		// yyyymmdd * 2
		// ���ڸ� �� ������ ����ϴ� ���α׷� getDayDiff(str from, str to)
		// ���ڿ� Ȯ�� checkStr -> return 0

		Scanner sc = new Scanner(System.in);

		System.out.println("��¥ �Է� : ");
		String from = sc.nextLine();

		System.out.println("��¥ �Է� : ");
		String to = sc.nextLine();

		System.out.println(getDayDiff(from, to));

	///////////// ��� 2
		
	
		
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
			System.out.println("���� �߻� : 0�� ��ȯ�մϴ�.");
			return 0;
		}
	}
}
