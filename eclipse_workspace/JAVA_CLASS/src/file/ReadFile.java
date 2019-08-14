package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) {
		File folder = new File("D:\\FileTest\\");
		File file = new File(folder, "test.html");

		if (!folder.exists())
			folder.mkdir();

		Scanner sc = null;
		try {
			String data = "Scanner로 읽어온 내용 \n";
			sc = new Scanner(new FileReader(file));

			while (sc.hasNext()) {
				data += sc.nextLine();
			}

			System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sc != null)
				sc.close();
		}

		InputStreamReader isr = null;
		try {
			isr = new InputStreamReader(new FileInputStream(file));
			char[] buf = new char[100];
			String data = "InputStream reader로 한 글자씩 읽은 내용\n";

			// 한글자씩 읽기
			int val = -1;
			while((val = isr.read()) != -1) {
				data += (char)val;
			}
			
			// buf배열에 read해서, 여러글자 일기
			/*
			 * while (true) { int len = isr.read(buf);
			 * 
			 * if (len == -1) break;
			 * 
			 * data += new String(buf, 0, len);
			 * 
			 * }
			 */
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 1. inputstreanreader
		// 버퍼가 없는 inputstreamreader이다. 다양한 inputstream을 읽는데 사용된다.
		// 다양한 inputstream : 소켓의 inputstream, file의 inputstream, system의 inputstream 등등
		
		// 	2. BufferedReader
		//  버퍼라는 메모리를 할당한 객체, 작업속도가 빠름. 엔터만 경계로 인식
		
		// 3. Scanner
		//  	작업속도가 느림. 스페이스와 엔터를 경계로 인식
		
		// 적은양의 데이터 처리 : 큰 차이가 없음
		// 많은 양의 데이터 처리 : bufferedreader을 사용하는 것이 좋다
		BufferedReader br = null;

		try {
			if (isr != null)
				br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "EUC-KR"), 100);
			// InputStreamReader의 charset을 유의하자(EUC-KR, UTF-8...등등)
			// encoding - decoding 타입을 맞춰야 한다. 
			int val = -1;

			String line = null;
			
			System.out.println("bufferedreader로 한줄씩");
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			

			System.out.println("bufferedreader로 한글자씩");
			while (true) {
				val = br.read();
				// read는 한 글자씩 읽어온다
				// 
			
				if (val == -1)
					break;

				System.out.print((char) val);
				// Thread.sleep(100);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

