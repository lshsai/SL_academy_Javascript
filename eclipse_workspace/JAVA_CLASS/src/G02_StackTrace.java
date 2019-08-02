
public class G02_StackTrace {
	public static void main(String[] args) {
		new MyExceptionThread().start();
	}
}

class MyExceptionThread extends Thread {
	@Override
	public void run() {
		throwException();
	}

	public void throwException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}