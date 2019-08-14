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
import java.util.TreeSet;

public class CopyFile {

	private static TreeSet<String> dataExts = new TreeSet<>();
	static {
		dataExts.add("png");
		dataExts.add("jpg");
		dataExts.add("gif");
		dataExts.add("mp3");
		dataExts.add("mp4");
	}
	
	public static void copyFolder(File oriDir, File dstDir) {
		
		if (!dstDir.exists())
			dstDir.mkdir();
		
		for (File oriFile : oriDir.listFiles()) {
			File dstFile = new File(dstDir, oriFile.getName());
			
			if (oriFile.isDirectory()) {
				copyFolder(oriFile, dstFile); 
				// �޼��� ���ο��� �� �޼��尡 �ڱ� �ڽ��� �� �θ��� �� : Recursive function (����Լ�, ���ȣ��) 
			} else {		
				String ext = getExtension(oriFile);
				System.out.println(ext);
				
				if (dataExts.contains(getExtension(oriFile).toUpperCase()) || dataExts.contains(getExtension(oriFile).toLowerCase())) {
					copyDataFile(oriFile, dstFile); 
					// inputStream/outputStream�� byte�������� �����͸� �ٷ�� ������
					// �ؽ�Ʈ�� �ƴ� ������ �ٷ� ���� �� ������ stream�� ����ؾ��Ѵ�
				} else {
					copyTxtFile(oriFile, dstFile);
					// �ؽ�Ʈ ������ �ٷ� ���� ������ reader/writer�� ����ص� �ȴ� 
					// reader/writer�� char�� �����͸� �ٷ� 
				}
			}			
		}	
	}
	
	private static String getExtension(File f) {				
		String fileName = f.getName();
		
		// ����ǥ���� .�� ������ �ǹ�
		String[] frag = fileName.split("\\."); 	// frag = fileName.split("[.]");
		
		return frag[frag.length-1];
	}
	
	private static void copyDataFile(File oriFile, File dstFile) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;		
		
		final int SZ = 4096;
		
		try {
			bis = new BufferedInputStream(new FileInputStream(oriFile), SZ);		
			bos = new BufferedOutputStream(new FileOutputStream(dstFile), SZ);	
			
			byte[] buffer = new byte[SZ];
			
			while (true) {
				int len = bis.read(buffer);
				
				if (len == -1)
					break;
				
				bos.write(buffer, 0, len);
			}
		} catch (IOException e) {
			
		} finally {
			try {
				if (bis != null)
					bis.close();
				if (bos != null)
					bos.close();
			} catch (IOException e) { System.err.println("close err"); }
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
			System.err.println("���絵�� ���� �߻�");
		} finally {
			try {
				if (br != null)
					br.close();
				if (bw != null)
					bw.close();
			} catch (IOException e) { System.err.println("close error"); }
		}
	}
	
	public static void main(String[] args) {
		File ori_folder = new File("D:\\stats");
		File dst_folder = new File("D:\\stats2");
		copyFolder(ori_folder, dst_folder);
		
		System.out.println("========================================================");
		File folder = new File("D:\\stats");
		System.out.println("�̰� ���丮��? " + folder.isDirectory());
		
		if (folder.isDirectory()) {			
			/*
			 * String[] list = folder.list(); System.out.println("list�� ���"); for (String l
			 * : list) { System.out.println(l); }
			 */			
			File[] listFiles = folder.listFiles(); // FileFilter, FilenameFilter			
			System.out.println("listFile�� ���");
			for (File f : listFiles) {
				if (f.isDirectory()) {
					System.out.println(f.getName() + "�� ���丮�Դϴ�.");
					File[] list = f.listFiles();
					// ���������� ���̻� ���������� ��� �ݺ�������Ѵ� 					
				} else {
					System.out.println(f.getName() + "�� �����Դϴ�.");
				}
			}
		}
	}

}





