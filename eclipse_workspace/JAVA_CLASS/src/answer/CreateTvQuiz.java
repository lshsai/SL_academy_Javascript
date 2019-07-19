package answer;

import java.util.Scanner;

public class CreateTvQuiz {
	
	int channel;
	int preChannel;
	int volume;
	boolean isPowerOn;
	
	/*
	 	isPowerOn�� ���� true�� false, false�� true�� �ٲٴ� �޼��� turnOnOff()
	 	volume�� ���� 1 ���� ��Ű�� �޼��� volumUP()
	 	volume�� ���� 1 ���� ��Ű�� �޼��� volumDown()
	 	
	 	channel�� ���� 1 ���� ��Ű�� �޼��� channelUP()
	 	channel�� ���� 1 ���� ��Ű�� �޼��� channelDown()
	 	
	 	ä���� �Է¹޾�, ä���� �̵��ϴ� �޼��� moveChannel()
	 	
	 	���� ä�η� ���ư��� �޼��� preChannel() 	
	 */
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 500;
	final int MIN_CHANNEL = 3;
	
	void info() {
		System.out.println("���� : " + isPowerOn);
		System.out.println("���� ä�� : " + channel);
		System.out.println("���� ä�� : " + preChannel);
		System.out.println("���� ���� : " + volume);
	}
	
	void turnOnOff() {
		isPowerOn = !isPowerOn;
	}
	
	void volumUP() {
		if (volume < MAX_VOLUME)
			volume++;
		info();
	}
	
	void volumDown() {
		if (volume > MIN_VOLUME)
			volume--;
		info();
	}
	
	void channelUP() {
		if (channel < MAX_CHANNEL)
			changeChannel(channel+1);
 	}
 	
	void channelDown() {
		if (channel > MIN_CHANNEL)
			changeChannel(channel-1);
 	}
 	
	void moveChannel(int inputChannelNum) {
 		preChannel = channel;
		
 		while (true) {
 			System.out.println("�̵��� ä�� �Է� : ");
 			channel = new Scanner(System.in).nextInt();
 			
 			if (channel >= MIN_CHANNEL && channel < MAX_CHANNEL)
 				break;
 			else
 				System.out.println("�߸��� ä�� �Դϴ�. �ٽ� �Է��ϼ���.");
 		}
 		changeChannel(channel);
 	}
 	
 	void preChannel() {
 		changeChannel(preChannel);
 	}	
 	
 	void changeChannel(int nextchannel) {
 		preChannel = channel;
 		channel = nextchannel;
 		info();
 	}
 	
public static void main(String[] args) {
	CreateTvQuiz lg = new CreateTvQuiz();
	lg.info();
	
	lg.channelUP();
}
}
