import java.util.HashSet;

public class G06_DaemonThread {

	public static void main(String[] args) {
		// DaemonThread 
		//  ������ �����带 �����ϴ� ������		
		//  �Ϲݾ����尡 ��� ����Ǹ� �Բ� ����ȴ�
		//	���α׷��� ������ ���󾲷���� ��� �Բ� ����ȴ�
		
		//  ���󾲷���� ���α׷� �ϳ��� ���ӵȴ� (������ �ϳ��� ���ӵ� �� ����)
		
		/* ���� ������ */
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
		super(group, "�븻������");
		this.count = count;
		this.group = group;
		AutoSaveThread.saveObj.add(this);
	}
	
	@Override
	public void run() {
		/* Normal ������ */	
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
		System.out.println("NormalThread�� ����Ǿ����ϴ�.");
	}
}

// ���� �۾��� �ϱ����� ������ 2���� ������ �ͺ��ٴ� 
// �迭�� �ϰ�ó�� �ϴ°��� ����
class AutoSaveThread extends Thread {
	static HashSet<NormalThread> saveObj = new HashSet<>();
	
	public AutoSaveThread(ThreadGroup group) {
		super(group, "�ڵ����徲����");		
	}
	
	@Override
	public void run() { 
		/* AutoSave ������ */
		
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
		System.out.println("�۾��� �ڵ�����Ǿ����ϴ�.");
	}
}












