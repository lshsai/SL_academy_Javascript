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
				// 메서드 내부에서 그 메서드가 자기 자신을 또 부르는 것 : Recursive function (재귀함수, 재귀호출) 
			} else {		
				String ext = getExtension(oriFile);
				System.out.println(ext);
				
				if (dataExts.contains(getExtension(oriFile).toUpperCase()) || dataExts.contains(getExtension(oriFile).toLowerCase())) {
					copyDataFile(oriFile, dstFile); 
					// inputStream/outputStream은 byte형식으로 데이터를 다루기 때문에
					// 텍스트가 아닌 파일을 다룰 때는 더 귀찮은 stream을 사용해야한다
				} else {
					copyTxtFile(oriFile, dstFile);
					// 텍스트 파일을 다룰 때는 간편한 reader/writer를 사용해도 된다 
					// reader/writer는 char로 데이터를 다룸 
				}
			}			
		}	
	}
	
	private static String getExtension(File f) {				
		String fileName = f.getName();
		
		// 정규표현식 .은 모든것을 의미
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
			System.err.println("복사도중 에러 발생");
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
		System.out.println("이게 디렉토리니? " + folder.isDirectory());
		
		if (folder.isDirectory()) {			
			/*
			 * String[] list = folder.list(); System.out.println("list로 찍기"); for (String l
			 * : list) { System.out.println(l); }
			 */			
			File[] listFiles = folder.listFiles(); // FileFilter, FilenameFilter			
			System.out.println("listFile로 찍기");
			for (File f : listFiles) {
				if (f.isDirectory()) {
					System.out.println(f.getName() + "은 디렉토리입니다.");
					File[] list = f.listFiles();
					// 하위폴더가 더이상 없을때까지 계속 반복해줘야한다 					
				} else {
					System.out.println(f.getName() + "은 파일입니다.");
				}
			}
		}
	}

}





