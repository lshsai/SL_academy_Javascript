package quiz;

import java.io.File;
import java.util.Arrays;

public class ParseExt {

	public static void main(String[] args) {
		// D:\stats2\FileTest\bulk_email_result.PNG
		// � File��ü���� Ȯ���ڸ� �����ϴ� �޼��带 ��������
		
		File f = new File("D:\\stats2\\FileTest\\bulk.email.result.PNG");
		
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
		// System.out.println(f.getName().substring(f.getName().indexOf('.')+1));
		
		String fileName = f.getName();
		
		// ����ǥ���� .�� ������ �ǹ�
		String[] frag = fileName.split("\\."); 
		frag = fileName.split("[.]");		
		
		System.out.println(Arrays.toString(frag));
		System.out.println(frag[frag.length-1]);
	}

}






