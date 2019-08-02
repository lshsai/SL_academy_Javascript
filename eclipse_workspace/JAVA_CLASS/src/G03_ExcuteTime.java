
public class G03_ExcuteTime {
	static long startTime = 0;
	
	public static void main(String[] args) {
		// �̱� Thread vs ��Ƽ Thread ����ð�
		startTime = System.currentTimeMillis();
		
		new ExcuteTimeTestThread().start();
		
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
			if (i%50 == 49)
				System.out.println();
		}
			
		System.out.println("�ҿ�ð� 1 : " + (System.currentTimeMillis() - startTime));
		
//		for (int i = 0; i < 300; i++) {
//			System.out.print("|");
//			if (i%50 == 49)
//				System.out.println();
//		}
//			
//		System.out.println("�ҿ�ð� 2 : " + (System.currentTimeMillis() - startTime));
//	
	}
	
	// �̱� ������ : 5 mil
	// ��Ƽ ������ : 6~7 mil
}

class ExcuteTimeTestThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
			if (i%50 == 49)
				System.out.println();
		}
			
		System.out.println("Thread �ҿ�ð� : " + (System.currentTimeMillis() - G03_ExcuteTime.startTime));
	}
}