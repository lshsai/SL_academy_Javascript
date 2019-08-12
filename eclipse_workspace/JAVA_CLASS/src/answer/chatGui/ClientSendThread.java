
package answer.chatGui;


import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSendThread extends Thread {

	Socket cs;
	Scanner sc;

	public ClientSendThread(Socket cs) {
		this.cs = cs;
		sc = new Scanner(System.in);
	}

	@Override
	public void run() {
		// BufferedReader systemReader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = null;
		try {
			 writer = new PrintWriter(cs.getOutputStream());

			String sendMsg;			

			while (true) {
				sendMsg = sc.nextLine();
				
				if(sendMsg.equalsIgnoreCase("quit"))
						break;

				writer.println(sendMsg);
				writer.flush();
				
				// System.out.println("³ª : " + sendMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null)
				writer.close();
			if(sc != null)
				sc.close();
		}
	}
}
