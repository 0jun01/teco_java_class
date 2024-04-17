package basic.ch04;

public class ContinueTest2 {

	public static void main(String[] args) {

		int i = 1;

		while (i <= 10) {
			// 단독 if 구문은 - 수행이 될 수도 있고 안될 수도 있다.
			if (i % 7 == 0) {
				// 중간에 멈추어라
				break;
			}
			System.out.println("i의 값은 : " + i);
			i++;
		}

	} // end of main

} // end of class
