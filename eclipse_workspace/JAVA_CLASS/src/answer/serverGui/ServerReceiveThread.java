package answer.serverGui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReceiveThread extends Thread {
	private Socket cs;

	
	public ServerReceiveThread(Socket cs) {
		this.cs = cs;
	}

	@Override
	public void run() {
		// BufferedReader : Á» ´õ ºü¸¥ inputStream

		BufferedReader buffer = null;
		try {
			buffer = new BufferedReader(new InputStreamReader(cs.getInputStream()));

			String receiveMsg;

			while (true) {
				receiveMsg = buffer.readLine();

				if (receiveMsg == null) {
					System.out.println("¿¬°á ²÷¾îÁü");
					break;
				} else {
					System.out.println(receiveMsg);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (buffer != null)
					buffer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
