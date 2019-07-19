import java.util.Arrays;

public class C06_Array2_instructorVer{

	public static void main(String[] args) {
		// 다차원배열 
		
		// 배열 : 한 타입의 변수를 여러개 담고 있는 것
		// 2차원배열 : 배열 타입의 변수를 여러개 담고 있는 것 		
		int[][] array2 = new int[2][3];
		int[] arr1 = new int[] {1, 2, 3};
		int[] arr2 = new int[3];
		
		array2[0] = arr1;
		array2[1] = arr2; 
		
		// 배열이 몇개 있는지만 알면, 
		// 2차원 배열안에 들어있는 1차원 배열의 길이는 신경쓰지않는다
		int[][] a2 = new int[5][];
		a2[0] = arr1;
		a2[1] = arr1;
		a2[2] = arr1;
		a2[3] = arr1;
		a2[4] = arr1;
		
		int[][] array2_2 = {
				{1, 2, 3, 4, 5, 6, 7, 8}, {11, 9999}, {1,1,1,1,1,1,1,1,11,1,1}
		}; // new int[2][];
		
		int[][][] array3 = { array2, array2_2 };
		
		System.out.println(array2_2[2][8]);
		System.out.println(array2_2[1][1]);
		
		for (int i = 0; i < array2_2.length; i++) {
			System.out.println(Arrays.toString(array2_2[i]));
			for (int j = 0; j < array2_2[i].length; j++) {
				System.out.print(array2_2[i][j] + " ");
			}
			System.out.println();
		}
		
		
		// 1차원 배열 : [5]	
		int[] numbers = new int[] {5, 5, 5, 5, 5};
		
		// 2차원 배열 : [4][5]
		int[][] numbers2 = { 
								 {5, 5, 5, 5, 5}, 
								 {5, 5, 5, 5, 5},
								 {5, 5, 5, 5, 5},
								 {5, 5, 5, 5, 5}								 
						   };
		
		String[][] messages = {
				{
					"Hello", 
					"Hi", 
					"Greeting"
				},
				{
					"Good", 
					"Nice", 
					"Perfect"
				},
				{
					"Bad", 
					"Awesome", 
					"Cool"
				}
		};
		
		System.out.println(Arrays.toString(messages[0]));
		
		// 3차원 배열 : [3][5][5]
		int[][][] numbers3 = {
				{ 
					 {5, 5, 5, 5, 5}, 
					 {5, 5, 5, 5, 5},
					 {5, 5, 5, 5, 5},
					 {5, 5, 5, 5, 5},
					 {5, 5, 5, 5, 5}
			    },
				{ 
					 {5, 5, 5, 5, 5}, 
					 {5, 5, 5, 5, 5},
					 {5, 5, 5, 5, 5},
					 {5, 5, 5, 5, 5},
					 {5, 5, 5, 5, 5}
			    },
				{ 
					 {5, 5, 5, 5, 5}, 
					 {5, 5, 5, 5, 5},
					 {5, 5, 5, 5, 5},
					 {5, 5, 5, 5, 5},
					 {5, 5, 5, 5, 5}
			    }
		};
	
		
		// 다차원 배열에서 뒤의 배열은 유동적으로 할당할 수도 있다  
		int[][] num2 = new int[3][];
		
		int[] a = {1, 2, 3};
		int[] b = {33, 44, 55, 66, 77};
		int[] c = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
		
		num2[0] = a;
		num2[1] = b;
		num2[2] = c;
		// num2[3] = new int[]{1, 2, 3};
		
		System.out.println(num2[0].length);
		System.out.println(num2[1].length);
		System.out.println(num2[2].length);
	}

}
