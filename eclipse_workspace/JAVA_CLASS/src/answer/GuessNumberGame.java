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
			result = "정답";
			return result;
		}

		else if (guessNum > randomNum)
			result = "Down";
		else
			result = "Up";
		return result;
	}

	static int reTry() {
		System.out.println("다시 입력해 주세요 : ");
		int retryNum = getGuessNum();
		return retryNum;
	}

	public static void main(String[] args) {
		// 숫자 맞추기 게임

		/*
		 * 1. 컴퓨터가 랜덤 숫자 생성 2. userGuess 3. Up / Down 출력 4. randomNum == userGuess 이면
		 * 시도횟수 출력
		 * 
		 * 심화 : 1. 한 게임이 끝나면, 사용자의 이름을 입력받음 2. 순위표를 출력 (1 ~ 10위 까지만 기록)
		 */

		int randomNum = getRandomNum();

		System.out.println("1 - 1, 000 범위 숫자 Guess : ");
		int guessNum = getGuessNum();

		int count = 0;
		randomNum = 50;

		while (guessNum != randomNum) {
			System.out.println(answerUpandDown(guessNum, randomNum));
			guessNum = reTry();
			count++;
		}
		System.out.println(answerUpandDown(guessNum, randomNum));
		System.out.println(count + "회만에 완료했습니다");

		// 사용자 입력 받기
		// 랭킹 띄우기
		// 새게임 시작 물어보기
		// break;
	}
}
