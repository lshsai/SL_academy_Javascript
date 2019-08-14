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
//				copyFolder(oriFile, dstFile); // 재귀호출
//			}
		
	}
	
	
	public static void main(String[] args) {

		// 어떤 File객체에서 확장자만 추출하는 메서드 만들기
		
		File ori_folder = new File("D:\\Statistics\\FileTest");
		readFolder(ori_folder);
	}
	
	
	
}

