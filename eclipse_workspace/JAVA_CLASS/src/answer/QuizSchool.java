package answer;

public class QuizSchool {

	public static void main(String[] args) {
		School2 s = null;
		while (true) {
			
			s = new School2();
			
			s.initSchool();
			//생성된 정보의 반 평균점수를 통해 rank 정렬
			s.setBaanRank();
			
			//최고점수의 학생을 찾음
			s.findTop();
			
			//최고점수 학생이 1명인 경우 출력 안함
			if(s.numOfStudent == 1)
				continue;
			// 중복되는 학생이 있을경우 continue;
			
			//중복되는 학생 출력, break;
			for (int i = 0; i < s.numOfStudent; i++) {
				s.top[i].view();
			}
			break;
		}
		
	}

}
