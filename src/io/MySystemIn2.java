package io;

import java.io.IOException;
import java.util.Scanner;

public class MySystemIn2 {

	public static void main(String[] args) {

		// 키보드에서 데이터를 응용 프로그램 안으로 넣기
		System.out.println("알파벳 하나를 쓰고 Enter를 누르세요");

		// 바이트 동작 --> 0과 1로 구성
		// 정수 -> byte, short, int ,long

		int i;
		int j;
		// 한 바이트씩 키보드에 값을 읽어라

		try {
			// while 안에 수식사용 가능
			// 100 != 302 엔터가 아니라면 계속 돌아감 여러 값을 넣을 수 있음!
			while ((i = System.in.read()) != '\n') {
				System.out.println(" i : " + i);
				System.out.println(" (char)i : " + (char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	} // end of main
}
