package answer;

import java.util.Scanner;

public class CreateTvQuiz {
	
	int channel;
	int preChannel;
	int volume;
	boolean isPowerOn;
	
	/*
	 	isPowerOn의 값이 true면 false, false면 true로 바꾸는 메서드 turnOnOff()
	 	volume의 값을 1 증가 시키는 메서드 volumUP()
	 	volume의 값을 1 감소 시키는 메서드 volumDown()
	 	
	 	channel의 값을 1 증가 시키는 메서드 channelUP()
	 	channel의 값을 1 감소 시키는 메서드 channelDown()
	 	
	 	채널을 입력받아, 채널을 이동하는 메서드 moveChannel()
	 	
	 	이전 채널로 돌아가는 메서드 preChannel() 	
	 */
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 500;
	final int MIN_CHANNEL = 3;
	
	void info() {
		System.out.println("전원 : " + isPowerOn);
		System.out.println("현재 채널 : " + channel);
		System.out.println("이전 채널 : " + preChannel);
		System.out.println("현재 볼륨 : " + volume);
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
 			System.out.println("이동할 채널 입력 : ");
 			channel = new Scanner(System.in).nextInt();
 			
 			if (channel >= MIN_CHANNEL && channel < MAX_CHANNEL)
 				break;
 			else
 				System.out.println("잘못된 채널 입니다. 다시 입력하세요.");
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
