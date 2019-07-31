package answer;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarQuiz2 {

	public static void main(String[] args) {
		// salary = 매월 21일
		// 두 날짜 사이에 salary 횟수

		Calendar start = Calendar.getInstance();
		Calendar to = Calendar.getInstance();

		start.set(2018, 12, 20);
		to.set(2019, 1, 1);

		System.out.println(start.getTime());
		printResult(start, to);

	}

	static int payCount(Calendar from, Calendar to) {

		int yearCount = (to.get(Calendar.YEAR) - from.get(Calendar.YEAR)) * 12;
		int monthCount = (to.get(Calendar.MONTH) - from.get(Calendar.MONTH));

		int salaryCount = yearCount + monthCount;
		
		// 달 차이 계산
		//System.out.println(to.get(Calendar.DATE));
		//System.out.println(from.get(Calendar.DATE));
		//System.out.println("달 차이는 " + salaryCount);
		
		if(!((from.get(Calendar.DATE) < 21) && (to.get(Calendar.DATE) < 21))) {
			if(from.get(Calendar.DATE) > 21)
				salaryCount --;
			if(to.get(Calendar.DATE) > 21)
				salaryCount ++;
		}

		// from, to의 기준일 체크
		// System.out.println("확인결과 " + salaryCount);
		
		


		return salaryCount;
	}

	static void printResult(Calendar from, Calendar to) {

		SimpleDateFormat simple = new SimpleDateFormat("yyyy.MM.dd");

		System.out.println("시작일 : " + simple.format(from.getTime()));
		System.out.println("종료일 : " + simple.format(to.getTime()));
		
		System.out.println("월급날 : " + payCount(from, to) + "회");

	}

}
