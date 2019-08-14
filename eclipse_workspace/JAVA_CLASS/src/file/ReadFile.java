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
			String data = "Scanner�� �о�� ���� \n";
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
			String data = "InputStream reader�� �� ���ھ� ���� ����\n";

			// �ѱ��ھ� �б�
			int val = -1;
			while((val = isr.read()) != -1) {
				data += (char)val;
			}
			
			// buf�迭�� read�ؼ�, �������� �ϱ�
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
		// ���۰� ���� inputstreamreader�̴�. �پ��� inputstream�� �дµ� ���ȴ�.
		// �پ��� inputstream : ������ inputstream, file�� inputstream, system�� inputstream ���
		
		// 	2. BufferedReader
		//  ���۶�� �޸𸮸� �Ҵ��� ��ü, �۾��ӵ��� ����. ���͸� ���� �ν�
		
		// 3. Scanner
		//  	�۾��ӵ��� ����. �����̽��� ���͸� ���� �ν�
		
		// �������� ������ ó�� : ū ���̰� ����
		// ���� ���� ������ ó�� : bufferedreader�� ����ϴ� ���� ����
		BufferedReader br = null;

		try {
			if (isr != null)
				br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "EUC-KR"), 100);
			// InputStreamReader�� charset�� ��������(EUC-KR, UTF-8...���)
			// encoding - decoding Ÿ���� ����� �Ѵ�. 
			int val = -1;

			String line = null;
			
			System.out.println("bufferedreader�� ���پ�");
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			

			System.out.println("bufferedreader�� �ѱ��ھ�");
			while (true) {
				val = br.read();
				// read�� �� ���ھ� �о�´�
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

