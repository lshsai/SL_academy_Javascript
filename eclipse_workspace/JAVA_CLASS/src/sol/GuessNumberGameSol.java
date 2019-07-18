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
		System.out.println("���� : " + comAnswer);
		humanAnswer = 0;
	}	
	
	static void aGame() {		
		initGame();
		
		int count = 0;		
		while (true) {			
			System.out.print("���ڸ� ���纸���� : ");
			humanAnswer = sc.nextInt();
			count++;
			
			if (comAnswer > humanAnswer)
				System.out.println("UP");
			else if (comAnswer < humanAnswer) 
				System.out.println("DOWN");
			else if (comAnswer == humanAnswer)
				break;
		}
		System.out.println("�����Դϴ�! �õ�Ƚ�� : " + count);	
		
		sc.nextLine();
		System.out.print("�̸��� �Է��ϼ��� >> ");
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
		System.out.println("======== �� ŷ ========");
		System.out.println("����\t�̸�\t�õ�Ƚ��");
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
		// ���� ���߱� ����!
		
		// 1. ��ǻ�Ͱ� �������� �� ���ڸ� ���� (1 ~ 1000)
		// 2. ����� ���ڸ� ���� up/down���� ������ �����ش�
		// 3. ������ ���߸� �õ�Ƚ���� ������ش�
		
		// ��ȭ - �� ������ ������ ������� �̸��� �Է¹ް� ����ǥ�� ����غ��� 
		//		 (������ 1�� ~ 10�� ������ ��ϵ˴ϴ�)		
		while (true)
			aGame();
	}

}






