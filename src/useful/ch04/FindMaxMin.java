package useful.ch04;

import java.util.Arrays;
import java.util.Random;

public class FindMaxMin {
	int max;
	int min;
	int maxPos;
	int minPos;

	public int[] createNum() {

		Random random = new Random();
		int[] randomNum = new int[10];
		for (int i = 0; i < randomNum.length; i++) {
			randomNum[i] = random.nextInt(100) + 1;
			for (int j = 0; j < i; j++) {

				if (randomNum[j] == randomNum[i]) {
					// 값이 중복된 상태이다.
					i--;
				}
			}
		}

		return randomNum;

	}
	
	public static void main(String[] args) {
		FindMaxMin findMaxMin = new FindMaxMin();
		int[] resultArray = findMaxMin.createNum();
		for (int i = 0; i < resultArray.length; i++) {
			System.out.print(resultArray[i] + "\t");
		}
		System.out.println(" ");
		//System.out.println("가장 큰 값은" + max + "이고, 위치는 " + maxPos + "번째 입니다.");
		//System.out.println("가장 큰 값은" + min + "이고, 위치는 " + minPos + "번째 입니다.");
	}
}
