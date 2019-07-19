package answer;
import java.util.Arrays;


public class Array2Practice {

	public static void main(String[] args) {
		// °ªµéÀÇ ÃÑÇÕ°ú Æò±Õ
		
		int[][] numArr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20},
				{30,30,30}	
		};
		
		int sum = 0;
		int count = 0;
		
		for(int i = 0; i < numArr.length; i++) {
			for(int j=0; j<numArr[i].length; j++) {
				sum += numArr[i][j];
				count ++;
			}	
		}
		System.out.println(sum);
		System.out.println(count);
		System.out.println((sum/(float)count));
		
		int total = 0;
		int arrSize = 0;
		
		for (int i=0; i<numArr.length;i++) {
			int len = numArr[i].length;
			arrSize +=len;
			
			for (int j=0; j<len; j++) {
				total += numArr[i][j];
			}
		}
		
		System.out.println("ÃÑ ÇÕ :" + total);
		System.out.println("Æò ±Õ : " + (double)total/arrSize);
	}

}
