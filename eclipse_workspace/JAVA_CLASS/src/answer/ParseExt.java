package answer;

import java.io.File;

public class ParseExt {

	public static void readFolder (File oriDir){
		for (File oriFile : oriDir.listFiles()) {
			
			int extNum = oriFile.getName().lastIndexOf( "." );
			String ext = oriFile.getName().substring(extNum + 1 );
			System.out.println(ext);
			

		}
			
			
			
//			if(oriFile.isDirectory()) {
//				copyFolder(oriFile, dstFile); // ���ȣ��
//			}
		
	}
	
	
	public static void main(String[] args) {

		// � File��ü���� Ȯ���ڸ� �����ϴ� �޼��� �����
		
		File ori_folder = new File("D:\\Statistics\\FileTest");
		readFolder(ori_folder);
	}
	
	
	
}

