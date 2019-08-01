package answer.�̽���;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarQuiz3 {
	public static void main(String[] args) {
		/// sc = format yyyy/MM/dd
		/// --> set yyyy ~ dd
		/// --> simple format E �ش� ���� ���
		/// --> if --> �޽��� ��� --> �ٽ� ���
		
		while (!inputDate()) {
			System.out.println("�ٽ� �Է����ּ���");
		}
	}

	static boolean inputDate() {
		Scanner sc = new Scanner(System.in);

		String year = "";
		String mon = "";
		String day = "";

		System.out.println("��¥ �Է� : ");
		String date = sc.nextLine();
		
		if (date.charAt(4) != '/' || date.charAt(7) != '/')
			return false;
		
		for (int i = 0; i < 4; i++) {
			char c = date.charAt(i);
			
			if (c >= '0' && c <= '9')			
				year += date.charAt(i);
			else
				return false;
		}
		for (int j = 5; j < 7; j++) {
			mon += date.charAt(j);
		}
		for (int k = 8; k < 10; k++) {
			day += date.charAt(k);
		}
		
		int yearValue = 0;
		
		try {
			yearValue = Integer.parseInt(year);
		} catch (NumberFormatException abc) {
			// abc.printStackTrace();
			System.out.println("year�� ���ڰ� �ƴѰ� ���ͼ� 1234�� ��ü�մϴ�.");
			yearValue = 1234;
		}
		
		
		Calendar today = Calendar.getInstance();
		today.set(yearValue, Integer.parseInt(mon) - 1, Integer.parseInt(day));
		SimpleDateFormat simple = new SimpleDateFormat("yyyy/MM/dd/E");
		System.out.println(simple.format(today.getTime()));
		
		return true;
	}

}
