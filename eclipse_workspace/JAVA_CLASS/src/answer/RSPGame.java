package answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RSPGame {

	static String[] select = {"����", "����", "��"};
	static String input = null;
	
	public RSPGame() {
		
		
		//	Rock, Scissords, Papper Game
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		
		int value = -1;
		
		try {	
			System.out.println("�Է� : ����0 ����1 ��2");
			input = in.readLine();
			value = Integer.parseInt(input);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("�����Է�");
			System.exit(0);
		}
		
		int com = (int)(Math.random()*3);
		
		if(value <0 || value > 2) {
			System.out.println("�Է� �̻�");
			
		} if(com == value) {
			System.out.println("�����ϴ�.");
		} else {
			if((com+1)%3 == value) {
				System.out.println("����ڰ� �̰���ϴ�.");				
			} else if((value+1)%3 == com) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}
		}
		
		System.out.println("�����" + select[value]);
		System.out.println("�����" + select[com]);
		
	}	
}
