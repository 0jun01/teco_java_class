package basic.ch04;

public class WhileTest2_1 {

	public static void main(String[] args) {

		// 1 부터 5까지 덧셈 연산을 해라
		// 1 + 2 + 3 + 4 + 5

		int start = 1; // 시작값은 1
		int end = 5; // 5번
		int sum = 0;

		// 첫번째 반복
		// 특정 조건식을 만들어 반복문을 멈추게 해야 한다.
		
		boolean flag = true;
		while (flag) {

			if (start == 10) {
				// 실행애 제어권으 반납한다.
				flag = false;
				//return;
			}
			// 0 0 1
			sum = sum + start;
			System.out.println("sum : (" + start + "): " + sum);
			start++; // 1씩 증가
		}
	}

}
