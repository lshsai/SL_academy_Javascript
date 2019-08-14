package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {

	public static void main(String[] args) {
		// 경로 : / , \ 모두 가능
		// \ <- 문자열 내부에서는 escape 문자로 동작
		String dir = "D:\\FileTest";

		File folder = new File(dir);

		if (folder.exists()) {
			System.out.println("폴더가 존재");
		} else {
			folder.mkdir();
			System.out.println("폴더가 생성되었습니다.");
		}

		// 파일 객체가 생성(프로그램 내부에만 존재함)
		File file = new File(folder, "test.html");

		String html = "<a href=\"https://naver.com\">네이버로<br></a>";
		FileWriter fw = null;
		PrintWriter pw = null;

		// BufferedWriter bw = new BufferedWriter(new FileWriter());
		// 버퍼보다 작은 크기의 데이터 사용
		// 여러곳에서 하나의 파일에 쓰기를 하는 경우
		// 우선 버퍼에 저장을 한 뒤에 보내기 때문에
		// 하드디스크에 적은 횟수로 접근하여 프로그램 속도가 향상 됨
		// 버퍼 : 데이터의 임시저장소
		// 장치에 접근하기 전레 충분한 양의 데이터를 쌓은 뒤에 접근하도록 하는 방식

		// printwriter는 새로 써짐(추가 안 됨)
		// printwriter로 append true 구현
		// printwriter 쓰기전에 read로 string를 가져온다
		// 그 뒤에 +로 글 내용을 추가로 붙인다
		// 그리고 printwriter로 write한 뒤 flush
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
			System.out.println("파일 입력");
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
			// 이거만 여러번 하면 내용 겹쳐짐
			fw = new FileWriter(file, true);
			fw.write("filewriter : <br>");
			fw.write(html);
			fw.flush();
			System.out.println("파일 입력");
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
