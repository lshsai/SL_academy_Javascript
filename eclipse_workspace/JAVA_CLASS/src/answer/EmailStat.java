package answer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class EmailStat {
	/*
	 * 1. email파일 생성하기 2. 파일을 읽어서 도메일 %를 출력하는 html파일 만들기 3. html파일을 result폴더에 저장 4.
	 * 유저 아이디 리스트를 콘솔에 출력
	 */

	File target;
	int lineCount = -1;

	ArrayList<EmailData> allEmailData = new ArrayList<EmailData>();
	HashMap<String, Integer> domainCount = new HashMap<String, Integer>();
	HashMap<String, String> domainPercent = new HashMap<String, String>();

	static File folder = new File("D:\\Statistics\\");
	static File resultFile = new File(folder, "result");
	static File file = new File(resultFile, "result.html");

	public EmailStat(String path) {
		target = new File(path);

		if (!target.exists()) {
			System.err.println("파일이 존재하지 않습니다");
			System.exit(0);
		}

		if ((lineCount = readTarget()) == -1) {
			System.out.println("파일 줄수가 이상합니다.");
			System.exit(0);
		}
		;

		makeStat();
		// System.out.println("lineCount : " + readTarget());
		makeHtmlResult(domainPercent);
	}

	private void makeHtmlResult(HashMap data) {
		
		FileWriter fw = null;
		String contentT ="";

		for (Object key : data.keySet()) {
			contentT += "<tr><td>" + key + "</td><td>" + data.get(key) + "</td>";
		}
			try {
				fw = new FileWriter(file, false);
				
				String head = "<html><body><style>table.stat {border-collapse:collapse;\r\n" + 
						"width: 300px;\r\n" + 
						"}\r\n" + 
						".stat th, .stat td{\r\n" + 
						"padding: 8px;\r\n" + 
						"text-align: center;\r\n" + 
						"}\r\n" + 
						".stat tr:nth-child(even) {\r\n" + 
						"background-color: lightgray;\r\n" + 
						"}\r\n" + 
						".stat th{\r\n" + 
						"background-color: green;\r\n" + 
						"color: white;\r\n" + 
						"} </style>";
				String contentTitle = "<table = class='stat'><tr><th>Domain</th><th>Percent</ht></tr>";
				String close = "</table></body></html>";
				String html = head + contentTitle + contentT + close;
				fw.write(html);
				fw.flush();
				System.out.println("파일 입력 완료");
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

	private void makeStat() {
		for (EmailData email : allEmailData) {
			String domain = email.getDomain();
			String id = email.getId();

			if (!domainCount.containsKey(domain)) {
				domainCount.put(domain, 1);
			} else {
				domainCount.put(domain, domainCount.get(domain) + 1);
			}
		}

		for (String domain : domainCount.keySet()) {
			domainPercent.put(domain, getPercent(domainCount.get(domain)));
			// System.out.println(domainPercent.entrySet());
		}
	}

	private String getPercent(int count) {
		return Math.round(count / (float) lineCount * 100 * 100) / 100.0 + "%";

	}

	private EmailData emailParser(String email) {
		EmailData obj = new EmailData();

		obj.setId(email.substring(0, email.indexOf('@')));
		obj.setDomain(email.substring(email.indexOf('@') + 1));

		// System.out.println("ID :" + obj.getId() + "Domain : " + obj.getDomain());
		return obj;
	}

	private int readTarget() {
		BufferedReader br = null;
		int lineCount = 0;
		try {
			br = new BufferedReader(new FileReader(target));
			String line = null;
			while ((line = br.readLine()) != null) {
				// System.out.println(line);

				EmailData data = emailParser(line);
				allEmailData.add(data);

				++lineCount;
			}

			return lineCount;
		} catch (IOException e) {
			System.err.println("Target 읽기 중 에러");
			return -1;
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e2) {
					System.err.println("Target 닫기 중 에러");
				}
		}

	}

	public static void main(String[] args) {
		new EmailStat("D:\\FileTest\\bulk_email.txt");
		// new EmailStatics("D:\\FileTest\\bulk_email.txt");
	}
}

// DTO (data transfer object)
class EmailData {
	private String id;
	private String domain;

	// generate getter & setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}
}