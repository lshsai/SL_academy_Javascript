package answer;

public class TrainQuiz {

	public static void main(String[] args) {
		// 11 지하철 역
		// 총 37분
		// 한역 당 시간은? 소수점 2자리
		
		double station = 11;
		double time = 37;
		double one_sta_time = time/ station;
		
		System.out.printf("%.2f", one_sta_time);
		// int와 int의 결과는 int 
		// double과 double 결과는double
		// int와 double 결과는 double
		// 큰 타입의 결과로 나옴(아니면 37.0)
		

	}

}
