import java.util.Arrays;

public class C06_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] array2 = new int[2][3];
		int[] arr1 = new int[] {1,2,3};
		int[] arr2 = new int[3];
		
		array2[0] = arr1;
		array2[1] = arr2;
		
		int[][] array2_2 = {
				{1,2,3}, {11,9999,33}, {4444,44, 4444}, {123, 123, 13}
		}; // int[4][3]
		
		// 배열이 몇개 있는지 알면, 2차원 배열안에 있는 1차원 배열의 길이는 신경쓰지 않는다(없이도 만들 수 있다)
		int[][] a2 = new int[5][];
		
		
		int[][][] array3 = { array2, array2_2};
		
		System.out.println(array2_2[1][1]);
		
		for (int i=0;i<array2_2.length; i++) {
			System.out.println(Arrays.toString(array2_2[i]));
			for (int j=0; j<array2_2[i].length; j++) {
				System.out.print(array2_2[i][j] + " ");
			}
			System.out.println();
		}
	}

}
