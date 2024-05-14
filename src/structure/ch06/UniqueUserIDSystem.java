package structure.ch06;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueUserIDSystem {

	private HashSet<String> userIDs;

	public UniqueUserIDSystem() {
		this.userIDs = new HashSet<String>();
	}

	// 사용자 ID 등록 기능
	// 정상적으로 들어가면 true
	// 중복 발생하면 false
	public boolean registerUserID(String userID) {
		return userIDs.add(userID);
	}

	// 시스템 실행
	public void run() {
		// 동작 - 스캐너 활용
		while (true) {
			Scanner sc = new Scanner(System.in);
			String enterId = sc.next();
			// 실행 흐름 만들기 --> while, if

			if (registerUserID(enterId)) {
				System.out.println("정상 유저 등록");
			} else {
				System.out.println("이미 등록된 사용자 입니다.");
			}
		}
		// 결과 -> 정상 유저 등록
		// -> 이미 등록된 사용자 입니다.
	}

	// 코드 테스트
	public static void main(String[] args) {
		UniqueUserIDSystem system = new UniqueUserIDSystem(); // 객체 올리고
		System.out.println("ID를 입력해 줘");
		system.run();

	} // end of main

} // end of class
