package answer;

public class QuizSchool {

	public static void main(String[] args) {
		School2 s = null;
		while (true) {
			
			s = new School2();
			
			s.initSchool();
			//������ ������ �� ��������� ���� rank ����
			s.setBaanRank();
			
			//�ְ������� �л��� ã��
			s.findTop();
			
			//�ְ����� �л��� 1���� ��� ��� ����
			if(s.numOfStudent == 1)
				continue;
			// �ߺ��Ǵ� �л��� ������� continue;
			
			//�ߺ��Ǵ� �л� ���, break;
			for (int i = 0; i < s.numOfStudent; i++) {
				s.top[i].view();
			}
			break;
		}
		
	}

}
