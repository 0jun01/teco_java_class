package basic.ch04;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {

		// 특정 조건일 때 반복문을 종료 시켜 보자.
		boolean flag = true; // 깃발
		Scanner sc = new Scanner(System.in);
		int end = sc.nextInt();
		int start = 1;

		while (flag) {

			if (start == end) {
				System.out.println("if 구문이 동작함");
				flag = false;
				return;
			}
			System.out.println("start : " + start);

			start++;
		} // end of while

	} // end of main

} // end of class
