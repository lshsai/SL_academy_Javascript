package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {

	public static void main(String[] args) {
		// ��� : / , \ ��� ����
		// \ <- ���ڿ� ���ο����� escape ���ڷ� ����
		String dir = "D:\\FileTest";

		File folder = new File(dir);

		if (folder.exists()) {
			System.out.println("������ ����");
		} else {
			folder.mkdir();
			System.out.println("������ �����Ǿ����ϴ�.");
		}

		// ���� ��ü�� ����(���α׷� ���ο��� ������)
		File file = new File(folder, "test.html");

		String html = "<a href=\"https://naver.com\">���̹���<br></a>";
		FileWriter fw = null;
		PrintWriter pw = null;

		// BufferedWriter bw = new BufferedWriter(new FileWriter());
		// ���ۺ��� ���� ũ���� ������ ���
		// ���������� �ϳ��� ���Ͽ� ���⸦ �ϴ� ���
		// �켱 ���ۿ� ������ �� �ڿ� ������ ������
		// �ϵ��ũ�� ���� Ƚ���� �����Ͽ� ���α׷� �ӵ��� ��� ��
		// ���� : �������� �ӽ������
		// ��ġ�� �����ϱ� ���� ����� ���� �����͸� ���� �ڿ� �����ϵ��� �ϴ� ���

		// printwriter�� ���� ����(�߰� �� ��)
		// printwriter�� append true ����
		// printwriter �������� read�� string�� �����´�
		// �� �ڿ� +�� �� ������ �߰��� ���δ�
		// �׸��� printwriter�� write�� �� flush
//		try {
//			pw = new PrintWriter(file, "EUC-KR");
//			pw.write("printwriter : <br>");
//			pw.write(html);
//			pw.flush();
//		} catch (Exception e) {
//			//
//		} finally {
//			if (pw != null)
//				pw.close();
//		}

		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(file, true), 1024);
			bw.write("bwwriter : <br>");
			bw.write(html);
			bw.flush();
			System.out.println("���� �Է�");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			// �̰Ÿ� ������ �ϸ� ���� ������
			fw = new FileWriter(file, true);
			fw.write("filewriter : <br>");
			fw.write(html);
			fw.flush();
			System.out.println("���� �Է�");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
