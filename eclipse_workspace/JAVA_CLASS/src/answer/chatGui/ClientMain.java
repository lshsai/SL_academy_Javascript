package answer.chatGui;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {
	public static void main(String[] args) {
		try {
			Socket cs = new Socket("localhost", 8889);
			
			ClientMainFrame mainFrame = new ClientMainFrame(cs);
			//192.168.0.219
			new ClientReceiveThread(cs, mainFrame).start();
			// new ClientSendThread(cs).start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

// 서버, 클라이언트 수정 
