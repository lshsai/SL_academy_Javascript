package answer;

import java.util.Scanner;

public class GuessNumberGame {

	static int getRandomNum() {
		int num = (int) (Math.random() * 1000) + 1;
		return num;
	}

	static int getGuessNum() {

		Scanner sc = new Scanner(System.in);
		int guessNum = sc.nextInt();

		return guessNum;
	}

	static String answerUpandDown(int guessNum, int randomNum) {
		String result = " ";

		if (guessNum == randomNum) {
			result = "����";
			return result;
		}

		else if (guessNum > randomNum)
			result = "Down";
		else
			result = "Up";
		return result;
	}

	static int reTry() {
		System.out.println("�ٽ� �Է��� �ּ��� : ");
		int retryNum = getGuessNum();
		return retryNum;
	}

	public static void main(String[] args) {
		// ���� ���߱� ����

		/*
		 * 1. ��ǻ�Ͱ� ���� ���� ���� 2. userGuess 3. Up / Down ��� 4. randomNum == userGuess �̸�
		 * �õ�Ƚ�� ���
		 * 
		 * ��ȭ : 1. �� ������ ������, ������� �̸��� �Է¹��� 2. ����ǥ�� ��� (1 ~ 10�� ������ ���)
		 */

		int randomNum = getRandomNum();

		System.out.println("1 - 1, 000 ���� ���� Guess : ");
		int guessNum = getGuessNum();

		int count = 0;
		randomNum = 50;

		while (guessNum != randomNum) {
			System.out.println(answerUpandDown(guessNum, randomNum));
			guessNum = reTry();
			count++;
		}
		System.out.println(answerUpandDown(guessNum, randomNum));
		System.out.println(count + "ȸ���� �Ϸ��߽��ϴ�");

		// ����� �Է� �ޱ�
		// ��ŷ ����
		// ������ ���� �����
		// break;
	}
}
