package answer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 1. email파일 생성하기 2. 파일을 읽어서 도메일 %를 출력하는 html파일 만들기 3. html파일을 result폴더에 저장 4.
 * 유저 아이디 리스트를 콘솔에 출력
 */
public class EmailStatistics {
	static File folder = new File("D:\\Statistics\\");
	static File resultFile = new File(folder, "result");
	static File fileSrc = new File(folder, "EmailList.txt");
	static File file = new File(resultFile, "result.html");

	static ArrayList<String> idList = new ArrayList<String>();
	static ArrayList<String> domainList = new ArrayList<String>();
	static ArrayList<String> countDomain = new ArrayList<String>();
	static ArrayList<Integer> j = new ArrayList<Integer>();
	
	static String[] domainL = new String[6];
	static String[] percentP = new String[6];
	

	public static void main(String[] args) {

		if (!resultFile.exists())
			resultFile.mkdir();

		String data = "";
		InputStreamReader isr = null;
		try {
			isr = new InputStreamReader(new FileInputStream(fileSrc));
			char[] buf = new char[100];

			while (true) {
				int len = isr.read(buf);

				if (len == -1)
					break;

				data += new String(buf, 0, len);

			}

			// System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] dataArray = data.split("\n");

		for (int i = 0; i < dataArray.length; i++) {
			String[] splitedEmail;
			splitedEmail = dataArray[i].split("@");

			idList.add(splitedEmail[0]);
			domainList.add(splitedEmail[1]);

		}
		System.out.println("**** id 출력 ****");
		System.out.println(idList.toString());
		System.out.println("*****************");
		// System.out.println(domainList.toString());
		// System.out.println(domainList.get(0));

		
		// 중복없는 도메인 종류 구하기
		 Map<String, Integer> map = new HashMap<>();
		 
		    for (String temp : domainList) {
		        Integer count = map.get(temp);
		        map.put(temp, (count == null) ? 1 : count + 1);
		    }
		    // System.out.println(map.toString());
		    System.out.println("domain" + "\t" + "percent");
			int totalSize = domainList.size();
			float percent; 
		    Set<String> domains = map.keySet();
			
		    int i = 0;
		    for (String domain : domains) {
				float count = map.get(domain);

				percent = count/totalSize*100;
				
				// System.out.println(domain + "\t" + percent + "% \n");
				
				domainL[i] = domain;
				percentP[i] = ""+percent;
				// System.out.println(domainL[i].toString());
				// System.out.println(percentP[i].toString());
				i++;
				
			}
		// System.out.println(domainL.toString());
			
		
		
		/////////파일 쓰기 
		FileWriter fw = null;

		try {
			fw = new FileWriter(file, true);
			String head = "<html><body>";
			String content = "";
			String foor = "</html></body>";
					
			fw.write("domain" + "\t\t" + "percent");
			// fw.write(html);
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
