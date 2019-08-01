package answer.이승현;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarQuiz3 {
	public static void main(String[] args) {
		/// sc = format yyyy/MM/dd
		/// --> set yyyy ~ dd
		/// --> simple format E 해당 요일 출력
		/// --> if --> 메시지 출력 --> 다시 출력
		
		while (!inputDate()) {
			System.out.println("다시 입력해주세요");
		}
	}

	static boolean inputDate() {
		Scanner sc = new Scanner(System.in);

		String year = "";
		String mon = "";
		String day = "";

		System.out.println("날짜 입력 : ");
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
			System.out.println("year에 숫자가 아닌게 들어와서 1234로 대체합니다.");
			yearValue = 1234;
		}
		
		
		Calendar today = Calendar.getInstance();
		today.set(yearValue, Integer.parseInt(mon) - 1, Integer.parseInt(day));
		SimpleDateFormat simple = new SimpleDateFormat("yyyy/MM/dd/E");
		System.out.println(simple.format(today.getTime()));
		
		return true;
	}

}
