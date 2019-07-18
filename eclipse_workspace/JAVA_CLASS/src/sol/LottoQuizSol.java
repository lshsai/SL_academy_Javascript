package sol;

import java.util.Arrays;

public class LottoQuizSol {

	static int[] winNum;
	
	// final 이 후에 변경을 못하게 막는다
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
		// 1. 랜덤 1-45숫자를 생성하는 메서드 만들기
		
		// 2. 6개짜리 배열에 랜덤 숫자를 중복없이 담기
		
		// 3. 번호를 출력하기
		
		// 심화 - 처음에 당첨 번호를 뽑고, 당첨 번호가 나올때까지 반복하기
		//		  프로그램이 끝날때 시도횟수와 당첨번호를 출력				
		
		// Arrays 클래스는 배열을 다루는 여러 메서드들을 가지고 있다		
		// Arrays.toString(arr) : 넣은 배열을 출력하는 메서드 
		// Arrays.sort(arr) : 넣은 배열을 정렬해주는 메서드
		
		System.out.print("당첨번호 : ");
		winNum = getLottoArray();
		viewLottoArray(winNum);		
		
		
		long start = System.currentTimeMillis();
		int count = 0;
		
		while (!isWin(getLottoArray())) 
			count++;
		
		System.out.println("시도횟수 : " + count);
		long end = System.currentTimeMillis();
		System.out.println("걸린시간 : " + (end - start));
		
		
		start = System.currentTimeMillis();		
		Arrays.sort(winNum);
		count = 0;
		
		while (!isWinSortVersion(getLottoArray())) 
			count++;
		
		System.out.println("시도횟수 : " + count);
		end = System.currentTimeMillis();
		System.out.println("걸린시간 : " + (end - start));
	}

}






