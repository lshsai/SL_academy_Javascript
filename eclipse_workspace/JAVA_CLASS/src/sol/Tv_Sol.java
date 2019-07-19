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
		System.out.println("���� : " + isPowerOn);
		System.out.println("���� ä�� : " + channel);
		System.out.println("���� ä�� : " + prevChannel);
		System.out.println("���� ���� : " + volume);
	}
	
	// isPowerOn�� ���� true�� false��, false�� true�� �ٲٴ� �޼��� turnOnOff()
	void turnOnOff() {
		isPowerOn = !isPowerOn;
		info();
	}
	
	// volume�� ���� 1 ������Ű�� �޼��� volumeUp()
	void volumeUp() {
		if (volume < MAX_VOLUME)
			volume++;
		info();
	}
	
	// volume�� ���� 1 ���ҽ�Ű�� �޼��� volumeDown()
	void volumeDown() {
		if (volume > MIN_VOLUME)
			volume--;
		info();
	}
	
	// channel�� ���� 1 ������Ű�� �޼��� channelUp()
	void channelUp() {
		if (channel < MAX_CHANNEL) 
			changeChannel(channel+1);
	}
	
	// channel�� ���� 1 ���ҽ�Ű�� �޼��� channelDown()
	void channelDown() {
		if (channel > MIN_CHANNEL) 
			changeChannel(channel-1);
	}
	
	// ä���� �Է¹޾� ä���� �̵��ϴ� �޼��� moveChannel()
	void moveChannel() {
		int nextChannel = 0;
		while (true) {
			System.out.print("�̵��� ä���� �Է��ϼ��� : ");
			nextChannel = new Scanner(System.in).nextInt();
			
			if (nextChannel >= MIN_CHANNEL && nextChannel <= MAX_CHANNEL)
				break;
			else 
				System.out.println("�߸��� ä���Դϴ�. �ٽ� �Է��ϼ���.");			
		}
		changeChannel(nextChannel);
	}
	
	// ���� ä�η� ���ư��� �޼��� prevChannel()
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















