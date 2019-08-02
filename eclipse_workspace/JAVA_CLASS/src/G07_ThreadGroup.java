import java.util.Map;
import java.util.Set;

public class G07_ThreadGroup {

	public static void main(String[] args) {
		// ThreadGroup: 쓰레드가 속해있는 그룹

		ThreadGroup groupone = new ThreadGroup("그룹1");
		ThreadGroup grouptwo = new ThreadGroup("그룹2");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();


		System.out.println("List of ThreadGroup : " + mainGroup.getName() + ",Active ThreadGroup :"
				+ mainGroup.activeGroupCount() + ",Active Thread" + mainGroup.activeCount());
		mainGroup.list();
		new ThreadOne(groupone, "Thread1").start();
		new ThreadTwo(grouptwo, "Thread2").start();

		
		
	}

}

class ThreadOne extends Thread {

	public ThreadOne(String name) {
		super(name);
	}

	public ThreadOne(ThreadGroup group, String name) {
		super(group, name);
	}

	@Override
	public void run() {
		try {
			sleep(5 * 1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

class ThreadTwo extends Thread {
	public ThreadTwo(String name) {
		super(name);
	}

	public ThreadTwo(ThreadGroup group, String name) {
		super(group, name);
	}

	@Override
	public void run() {
		Map<Thread, StackTraceElement[]> stackMap = getAllStackTraces();
		Set<Thread> keys = stackMap.keySet();

		int i = 0;
		for (Thread t : keys) {
			StackTraceElement[] stes = stackMap.get(t);

			try {
				System.out.println("[" + i + "] name : " + t.getName() + ", group :" + t.getThreadGroup().getName()
						+ ", daemon :" + t.isDaemon());
				for (StackTraceElement ste : stes)
					System.out.println(ste);
			} catch (NullPointerException e) {
				System.out.println("********************");
				System.out.println(
						"[" + i + "] name : " + t.getName() + ", group :" + null + ", daemon :" + t.isDaemon());
				for (StackTraceElement ste : stes)
					System.out.println(ste);
				System.out.println("********************");
			}

		}
	}
}