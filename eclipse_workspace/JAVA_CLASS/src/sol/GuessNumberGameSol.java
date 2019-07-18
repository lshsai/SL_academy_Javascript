package sol;

import java.util.Scanner;

public class GuessNumberGameSol {
	
	static final int SCORE_SIZE = 10;
	
	static String[] userNames = new String[SCORE_SIZE];
	static int[] userScores = new int[SCORE_SIZE];
	
	static int comAnswer = 0;
	static int humanAnswer = 0;
	
	static Scanner sc = new Scanner(System.in); 
	
	static void initGame() {
		comAnswer = (int)(Math.random()*1000+1);
		System.out.println("정답 : " + comAnswer);
		humanAnswer = 0;
	}	
	
	static void aGame() {		
		initGame();
		
		int count = 0;		
		while (true) {			
			System.out.print("숫자를 맞춰보세요 : ");
			humanAnswer = sc.nextInt();
			count++;
			
			if (comAnswer > humanAnswer)
				System.out.println("UP");
			else if (comAnswer < humanAnswer) 
				System.out.println("DOWN");
			else if (comAnswer == humanAnswer)
				break;
		}
		System.out.println("정답입니다! 시도횟수 : " + count);	
		
		sc.nextLine();
		System.out.print("이름을 입력하세요 >> ");
		String userName = sc.nextLine();
		
		writeScore(userName, count);
		viewScore();
	}
	
	static void writeScore(String name, int score) {		
		for (int i = 0; i < SCORE_SIZE; i++) {
			if (userScores[i] == 0) {
				userScores[i] = score;
				userNames[i] = name;
				break;
			} else if (score < userScores[i]) {				
				makeSpace(i); 				
				userScores[i] = score;
				userNames[i] = name;
				break;
			}
		}		
	}
	
	static void makeSpace(int index) {
		for (int i = SCORE_SIZE-1; i > index; i--) {
			userScores[i] = userScores[i-1];
			userNames[i] = userNames[i-1];			
		}
	}
	
	static void viewScore() {
		System.out.println("======== 랭 킹 ========");
		System.out.println("순위\t이름\t시도횟수");
		for (int i = 0; i < SCORE_SIZE; i++) {
			String msg = "" + (i+1) + "\t";
			if (userNames[i] == null)
				msg += " \t";
			else 
				msg += userNames[i] + "\t" + userScores[i];
			
			System.out.println(msg);
		}
	}
	
	public static void main(String[] args) {
		// 숫자 맞추기 게임!
		
		// 1. 컴퓨터가 랜덤으로 한 숫자를 고른다 (1 ~ 1000)
		// 2. 사람이 숫자를 고르면 up/down으로 범위를 좁혀준다
		// 3. 정답을 맞추면 시도횟수를 출력해준다
		
		// 심화 - 한 게임이 끝나면 사용자의 이름을 입력받고 순위표를 출력해보자 
		//		 (순위는 1위 ~ 10위 까지만 기록됩니다)		
		while (true)
			aGame();
	}

}






