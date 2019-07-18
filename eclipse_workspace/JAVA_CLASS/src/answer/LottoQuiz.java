package answer;

import java.util.Arrays;

public class LottoQuiz {

	static int getNum() {
		int num = (int) (Math.random() * 45) + 1;
		return num;
	}

	static int[] getLottoNum() {
		int[] lottoNum = new int[6];

		for (int i = 0; i < 6; i++) {
			lottoNum[i] = getNum();
			for (int j = 0; j < i; j++) {
				if (lottoNum[i] == lottoNum[j]) {
					i--;
				}
			}
		}
		return lottoNum;
	}

	public static void main(String[] args) {
		/*
		 * 1. 1 - 45 ���ڸ� �����ϴ� �޼��� (getLottoNum)
		 * 
		 * 2. 6ũ�� �迭, �ߺ����� ���
		 * 
		 * 3. ���
		 */

		/*
		 * 1. ��÷ ��ȣ�� ���� 2. ��÷ �� ������ �ݺ� 3. ��� (�õ� Ƚ��, ��÷��ȣ ���)
		 */


		
		
		// �Ϲ� �ζǹ�ȣ �̱�
		int[] lottoNum = getLottoNum();
		for (int i=0; i < lottoNum.length; i++) {
			System.out.print(lottoNum[i] + " ");
		}
		
		System.out.println();
		

		
		lottoNum = getLottoNum();
		Arrays.sort(lottoNum);

		int[] guessLottoNum = new int[] { 1, 2, 3, 4, 5, 6 };
		Arrays.sort(guessLottoNum);

		int count = 0;

		for (int i = 0; i < 6; i++) {
			while (guessLottoNum[i] != lottoNum[i]) {
				lottoNum = getLottoNum();
				Arrays.sort(lottoNum);
				count++;
			}
		}
		System.out.println(Arrays.toString(lottoNum) + Arrays.toString(guessLottoNum) + count);
	}
}