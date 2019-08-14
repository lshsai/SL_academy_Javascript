package answer.chatGui;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {
	static Socket cs;
	public static void main(String[] args) {
		// Socket cs = new Socket("localhost", 8889);
		
		ClientMainFrame mainFrame = new ClientMainFrame();
		//192.168.0.219
		
		cs = mainFrame.cs;
		new ClientReceiveThread(cs, mainFrame).start();
		// new ClientSendThread(cs).start();
	}
}

// 서버, 클라이언트 수정 
