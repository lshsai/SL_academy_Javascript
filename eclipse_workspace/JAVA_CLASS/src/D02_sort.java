import java.util.Arrays;

public class D02_sort {

	public static void main(String[] args) {
		// 버블 정렬

		int[] arr = { 16, 5, 5, 4, 68, 4, 6 };

//		bubble_sort(arr);
//		enhanced_bubble_sort(arr);
//		insertion_sort2(arr);
		selection_sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	void swap() {

	}

	static void bubble_sort(int[] arr) {

		int n = arr.length;

		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {

				// 부등호 방향에 따라 오름.내림차순
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}

			}
		}
	}

	static void enhanced_bubble_sort(int[] arr) {

		int n = arr.length;

		boolean flag = true;

		for (int i = n - 1; flag; i--) {
			flag = false;
			for (int j = 0; j < i; j++) {

				// 부등호 방향에 따라 오름.내림차순
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					flag = true;
				}

			}
		}
	}

	static void insertion_sort(int[] arr) {
		int n = arr.length;

		for (int i = 1; i < n; i++) {

			int now = arr[i];

			int j;

			for (j = (i - 1); j >= 0 && now < arr[j]; j--) {
				// 비교 후, 내자리가 아니면 앞의 숫자를 당겨옴.
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = now;
			System.out.println(Arrays.toString(arr));
		}
	}

	static void insertion_sort2(int[] arr) {
		int n = arr.length;

		for (int i = 1; i < n; i++) {

			int now = arr[i];

			int j;

			for (j = (i - 1); j >= 0; j--) {
				// 비교 후, 내자리가 아니면 앞의 숫자를 당겨옴.
				if (now < arr[j])
					arr[j + 1] = arr[j];
				else
					break;
			}
			arr[j + 1] = now;
			System.out.println(Arrays.toString(arr));
		}
	}

	static void selection_sort(int[] arr) {
		int n = arr.length;
		
		for (int i = 0; i < n-1; i++) {
			
			int biggest = i;
			
			for (int j = i+1; j<n; j++) {
				if(arr[biggest] > arr[j])
					biggest = j;
			}
		
		int tmp = arr[i];
		arr[i] = arr[biggest];
		arr[biggest] = tmp;
		}
	}
}
