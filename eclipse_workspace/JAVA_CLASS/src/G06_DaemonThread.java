import java.util.HashSet;

public class G06_DaemonThread {

	public static void main(String[] args) {
		// DaemonThread 
		//  생성한 쓰레드를 보조하는 쓰레드		
		//  일반쓰레드가 모두 종료되면 함께 종료된다
		//	프로그램이 끝나면 데몬쓰레드는 모두 함께 종료된다
		
		//  데몬쓰레드는 프로그램 하나에 종속된다 (쓰레드 하나에 종속될 수 없다)
		
		/* 메인 쓰레드 */
		ThreadGroup g1 = new ThreadGroup("test1");
		ThreadGroup g2 = new ThreadGroup("test2");
		
		Thread asth = new AutoSaveThread(g1);
		asth.setDaemon(true);
		asth.start();
		
		new NormalThread(15, g1).start();
		new NormalThread(8, g2).start();
		new ThreadTwo("t2").start();
		
	}

}

class NormalThread extends Thread {
	boolean autoSave = false;
	int count;
	ThreadGroup group;
	
	
	public NormalThread(int count, ThreadGroup group) {
		super(group, "노말쓰레드");
		this.count = count;
		this.group = group;
		AutoSaveThread.saveObj.add(this);
	}
	
	@Override
	public void run() {
		/* Normal 쓰레드 */	
		//Thread asTh = new AutoSaveThread();
		//asTh.setDaemon(true);
		//asTh.start();
		System.out.println("activeCount : " + group.activeCount());		
		
		for (int i = 1; i <= count; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) { e.printStackTrace(); }			
			
			System.out.println(i);
			if (i == 5)
				autoSave = true;
		}
		
		autoSave = false;
		AutoSaveThread.saveObj.remove(this);
		System.out.println("NormalThread가 종료되었습니다.");
	}
}

// 같은 작업을 하기위해 쓰레드 2개를 돌리는 것보다는 
// 배열로 일괄처리 하는것이 좋다
class AutoSaveThread extends Thread {
	static HashSet<NormalThread> saveObj = new HashSet<>();
	
	public AutoSaveThread(ThreadGroup group) {
		super(group, "자동저장쓰레드");		
	}
	
	@Override
	public void run() { 
		/* AutoSave 쓰레드 */
		
		while (true) {
			try {
				Thread.sleep(3*1000);
			} catch(Exception e) { e.printStackTrace(); }
			
			for (NormalThread nt : saveObj) {
				if (nt.autoSave) {
					autoSave();
				}
			}
		}
	}
	
	public void autoSave() {
		System.out.println("작업이 자동저장되었습니다.");
	}
}












