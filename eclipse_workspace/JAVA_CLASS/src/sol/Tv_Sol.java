package sol;

import java.util.Scanner;

public class Tv_Sol{
	
	int channel;
	int prevChannel;
	int volume;
	boolean isPowerOn;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 500;
	final int MIN_CHANNEL = 1;
	
	void info() {
		System.out.println("전원 : " + isPowerOn);
		System.out.println("현재 채널 : " + channel);
		System.out.println("이전 채널 : " + prevChannel);
		System.out.println("현재 볼륨 : " + volume);
	}
	
	// isPowerOn의 값이 true면 false로, false면 true로 바꾸는 메서드 turnOnOff()
	void turnOnOff() {
		isPowerOn = !isPowerOn;
		info();
	}
	
	// volume의 값을 1 증가시키는 메서드 volumeUp()
	void volumeUp() {
		if (volume < MAX_VOLUME)
			volume++;
		info();
	}
	
	// volume의 값을 1 감소시키는 메서드 volumeDown()
	void volumeDown() {
		if (volume > MIN_VOLUME)
			volume--;
		info();
	}
	
	// channel의 값을 1 증가시키는 메서드 channelUp()
	void channelUp() {
		if (channel < MAX_CHANNEL) 
			changeChannel(channel+1);
	}
	
	// channel의 값을 1 감소시키는 메서드 channelDown()
	void channelDown() {
		if (channel > MIN_CHANNEL) 
			changeChannel(channel-1);
	}
	
	// 채널을 입력받아 채널을 이동하는 메서드 moveChannel()
	void moveChannel() {
		int nextChannel = 0;
		while (true) {
			System.out.print("이동할 채널을 입력하세요 : ");
			nextChannel = new Scanner(System.in).nextInt();
			
			if (nextChannel >= MIN_CHANNEL && nextChannel <= MAX_CHANNEL)
				break;
			else 
				System.out.println("잘못된 채널입니다. 다시 입력하세요.");			
		}
		changeChannel(nextChannel);
	}
	
	// 이전 채널로 돌아가는 메서드 prevChannel()
	void prevChannel() {
		changeChannel(prevChannel);
	}
	
	void changeChannel(int nextChannel) {
		prevChannel = channel;
		channel = nextChannel;
		info();
	}
	
	public static void main(String[] args) {
		Tv_Sol lg = new Tv_Sol();
		lg.info();
		
		lg.channelUp();
		lg.turnOnOff();

		for (int i = 0; i < 5; i++)
			lg.moveChannel();
	}
}















