package socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class A02_Client {
	public static void main(String[] args) {
		/// 127.0.0.1 로컬 호스트
		try {
			// 여기서 접속
			Socket cs = new Socket("192.168.0.219",8888);
			
			InputStream input = cs.getInputStream();
			byte[] buffer = new byte[100];
			
			input.read(buffer);
			System.out.println(Arrays.toString(buffer));
			System.out.println(new String(buffer));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("??");
		}
	}
}
