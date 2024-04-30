package useful.ch04;

import java.util.Random;

public class ArrayTest {

	public static void main(String[] args) {

		int[] arr1 = { 10, 55, 23, 2, 79, 101, 16, 82, 30, 45 };

		int max1 = 0;
		int min1 = 100;
		int maxBox = 0;
		int minBox = 0;
		int i = 0;

		for (i = 0; i < arr1.length; i++) {
			// 101 --> 101
			if (arr1[i] > max1) {
				max1 = arr1[i];
				maxBox = i;
			}

			if (arr1[i] < min1) {
				min1 = arr1[i];
				minBox = i;
			}

		}

		System.out.println("배열의 최댓값은 " + max1 + " 인덱스 번호는 arr1[" + maxBox + "] 입니다.");
		System.out.println("배열의 최솟값은 " + min1 + " 인덱스 번호는 arr1[" + minBox + "] 입니다.");
		System.out.println("------------------------");
		int max = 0;
		int min = 100;
		int maxBox1 = 0;
		int minBox1 = 0;
		int[] arr = new int[10];
		Random random = new Random();
		for (int j = 0; j < arr.length; j++) {
			arr[j] = random.nextInt(100) + 1;
			System.out.print(arr[j] + " ");
			if (arr[j] > max) {
				max = arr[j];
				maxBox1 = j;
			}
			if (arr[j] < min) {
				min = arr[j];
				minBox1 = j;
			}
		}
		System.out.println(" ");
		System.out.println("배열의 최댓값은 " + max + " 위치는 arr1[" + (maxBox1 + 1) + "] 입니다.");
		System.out.println("배열의 최솟값은 " + min + " 위치는 arr1[" + (minBox1 + 1) + "] 입니다.");

	}// main

}
