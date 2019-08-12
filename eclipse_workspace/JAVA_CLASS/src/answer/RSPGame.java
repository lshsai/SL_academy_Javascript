package answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RSPGame {

	static String[] select = {"가위", "바위", "보"};
	static String input = null;
	
	public RSPGame() {
		
		
		//	Rock, Scissords, Papper Game
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		
		int value = -1;
		
		try {	
			System.out.println("입력 : 가위0 바위1 보2");
			input = in.readLine();
			value = Integer.parseInt(input);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("숫자입력");
			System.exit(0);
		}
		
		int com = (int)(Math.random()*3);
		
		if(value <0 || value > 2) {
			System.out.println("입력 이상");
			
		} if(com == value) {
			System.out.println("비겼습니다.");
		} else {
			if((com+1)%3 == value) {
				System.out.println("사용자가 이겼습니다.");				
			} else if((value+1)%3 == com) {
				System.out.println("컴퓨터가 이겼습니다.");
			}
		}
		
		System.out.println("사용자" + select[value]);
		System.out.println("사용자" + select[com]);
		
	}	
}
