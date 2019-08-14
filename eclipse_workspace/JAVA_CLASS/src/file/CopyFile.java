package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;

public class CopyFile {
	private static TreeSet<String> dataExts = new TreeSet<String>();
	static {
		dataExts.add("png");
	}

	public static void copyFolder(File oriDir, File dstDir) {
		if (!dstDir.exists())
			dstDir.mkdir();

		for (File oriFile : oriDir.listFiles()) {
			File dstFile = new File(dstDir, oriFile.getName());

			if (oriFile.isDirectory()) {
				copyFolder(oriFile, dstFile); // 재귀호출
			}
		}
	}

	private static String getExtension(File f) {

	}

	private static void copyDataFile(File oriFile, File dstFile) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		final int SZ = 4096;
		
		try {
			bis = new BufferedInputStream(new FileInputStream(oriFile), 4096);
			bos = new BufferedOutputStream(new FileOutputStream(dstFile), 4096);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void copyTxtFile(File oriFile, File dstFile) {
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			br = new BufferedReader(new FileReader(oriFile), 4096);
			bw = new BufferedWriter(new FileWriter(dstFile), 4096);

			char[] buffer = new char[4096];

			while (true) {
				int len = br.read(buffer);

				if (len == -1)
					break;

				bw.write(buffer, 0, len);

			}

		} catch (IOException e) {
			System.err.println("복사 중 오류");
		} finally {

		}
	}

	public static void main(String[] args) {
		File ori_folder = new File("D:\\Statistics\\result");
		File dst_folder = new File("D:\\Statistics\\FileTest");
		copyFolder(ori_folder, dst_folder);

		System.out.println("===================================");
		File folder = new File("D:\\Statistics\\result");
//		System.out.println("디렉토리?" + folder.isDirectory());

		if (folder.isDirectory()) {
			String[] list = folder.list();

			File[] listFiles = folder.listFiles();

//			System.out.println("리스트로 찍기");
//			for(String l : list) {
//				System.out.println(l);
//			}

			System.out.println("리스트filese로 찍기");
			for (File f : listFiles) {
				if (f.isDirectory()) {
					System.out.println(f.getName() + "은 디렉토리");
				} else {
					System.out.println(f.getName() + "은 파일");
				}
			}

		}
	}
}
