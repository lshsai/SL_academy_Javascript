
public class G03_ExcuteTime {
	static long startTime = 0;
	
	public static void main(String[] args) {
		// 싱글 Thread vs 멀티 Thread 수행시간
		startTime = System.currentTimeMillis();
		
		new ExcuteTimeTestThread().start();
		
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
			if (i%50 == 49)
				System.out.println();
		}
			
		System.out.println("소요시간 1 : " + (System.currentTimeMillis() - startTime));
		
//		for (int i = 0; i < 300; i++) {
//			System.out.print("|");
//			if (i%50 == 49)
//				System.out.println();
//		}
//			
//		System.out.println("소요시간 2 : " + (System.currentTimeMillis() - startTime));
//	
	}
	
	// 싱글 스레드 : 5 mil
	// 멀티 스레드 : 6~7 mil
}

class ExcuteTimeTestThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
			if (i%50 == 49)
				System.out.println();
		}
			
		System.out.println("Thread 소요시간 : " + (System.currentTimeMillis() - G03_ExcuteTime.startTime));
	}
}