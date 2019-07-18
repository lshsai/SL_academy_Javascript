package sol;

import java.util.Arrays;

public class LottoQuizSol {

	static int[] winNum;
	
	// final �� �Ŀ� ������ ���ϰ� ���´�
	static final int LOTTO_LENGTH = 6;
	
	static int getLottoNum() {
		return (int)(Math.random()*45+1);
	}
	
	static int[] getLottoArray() {
		int[] lotto = new int[LOTTO_LENGTH];
		
		for (int i = 0; i < LOTTO_LENGTH; i++) {
			lotto[i] = getLottoNum();
						
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) 
					i--;
			}			
		}
		
		// viewLottoArray(lotto);
		
		return lotto;
	}
	
	static void viewLottoArray(int[] lottoArray) {
		
		for (int i = 0; i < LOTTO_LENGTH; i++) 
			System.out.print(lottoArray[i] + " ");
		System.out.println();
	}
	
	static boolean isWin(int[] guess) {
		for (int i = 0; i < LOTTO_LENGTH; i++) {
			boolean exist = false;
			
			for (int j = 0; j < LOTTO_LENGTH; j++) {
				if (winNum[i] == guess[j]) {
					exist = true;
					break;
				}
			}
			
			if (!exist)
				return false;
		}
		
		return true;
	}
	
	static boolean isWinSortVersion(int[] guess) {
		Arrays.sort(guess);	
		for (int i = 0; i < LOTTO_LENGTH; i++) {			
			if (winNum[i] != guess[i])
				return false;			
		}
		return true;
	}
	
	public static void main(String[] args) {
		// 1. ���� 1-45���ڸ� �����ϴ� �޼��� �����
		
		// 2. 6��¥�� �迭�� ���� ���ڸ� �ߺ����� ���
		
		// 3. ��ȣ�� ����ϱ�
		
		// ��ȭ - ó���� ��÷ ��ȣ�� �̰�, ��÷ ��ȣ�� ���ö����� �ݺ��ϱ�
		//		  ���α׷��� ������ �õ�Ƚ���� ��÷��ȣ�� ���				
		
		// Arrays Ŭ������ �迭�� �ٷ�� ���� �޼������ ������ �ִ�		
		// Arrays.toString(arr) : ���� �迭�� ����ϴ� �޼��� 
		// Arrays.sort(arr) : ���� �迭�� �������ִ� �޼���
		
		System.out.print("��÷��ȣ : ");
		winNum = getLottoArray();
		viewLottoArray(winNum);		
		
		
		long start = System.currentTimeMillis();
		int count = 0;
		
		while (!isWin(getLottoArray())) 
			count++;
		
		System.out.println("�õ�Ƚ�� : " + count);
		long end = System.currentTimeMillis();
		System.out.println("�ɸ��ð� : " + (end - start));
		
		
		start = System.currentTimeMillis();		
		Arrays.sort(winNum);
		count = 0;
		
		while (!isWinSortVersion(getLottoArray())) 
			count++;
		
		System.out.println("�õ�Ƚ�� : " + count);
		end = System.currentTimeMillis();
		System.out.println("�ɸ��ð� : " + (end - start));
	}

}






