package answer;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarQuiz2 {

	public static void main(String[] args) {
		// salary = �ſ� 21��
		// �� ��¥ ���̿� salary Ƚ��

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
		
		// �� ���� ���
		//System.out.println(to.get(Calendar.DATE));
		//System.out.println(from.get(Calendar.DATE));
		//System.out.println("�� ���̴� " + salaryCount);
		
		if(!((from.get(Calendar.DATE) < 21) && (to.get(Calendar.DATE) < 21))) {
			if(from.get(Calendar.DATE) > 21)
				salaryCount --;
			if(to.get(Calendar.DATE) > 21)
				salaryCount ++;
		}

		// from, to�� ������ üũ
		// System.out.println("Ȯ�ΰ�� " + salaryCount);
		
		


		return salaryCount;
	}

	static void printResult(Calendar from, Calendar to) {

		SimpleDateFormat simple = new SimpleDateFormat("yyyy.MM.dd");

		System.out.println("������ : " + simple.format(from.getTime()));
		System.out.println("������ : " + simple.format(to.getTime()));
		
		System.out.println("���޳� : " + payCount(from, to) + "ȸ");

	}

}
