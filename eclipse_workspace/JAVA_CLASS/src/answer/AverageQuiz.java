package answer;





public class AverageQuiz {
	
	static double getAverage(int num1, int num2) {
		return (num1 + num2)/2.0;
	}

	static String getGrade(int num1, int num2) {
		double score = getAverage(num1, num2);
		
		String grade = null;
		
		if (score >= 50) grade = "우수";
		else grade = "좋음";
				
		return grade;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getAverage(50, 70));
		System.out.println(getGrade(50, 70));
	}

}
