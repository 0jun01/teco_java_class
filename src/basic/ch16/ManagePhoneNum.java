package basic.ch16;

import java.util.Scanner;

public class ManagePhoneNum {
	static int lastPhoneNum = 100;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Phone[] phones = new Phone[100];
		phones[0] = new Phone("010-1234-5678", "변영준");
		phones[1] = new Phone("010-5678-1234", "김영준");
		phones[2] = new Phone("010-5678-1234", "나영준");
		phones[3] = new Phone("010-5678-1234", "신영준");
		phones[4] = new Phone("010-5678-1234", "박영준");
		lastPhoneNum = 5;
		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String REVISE = "3";
		final String DELETE_ALL = "4";
		final String SEARCH_BY_NUMBER_ = "5";
		final String END = "0";
		boolean flag = true;

		while (flag) {
			System.out.println("** 메뉴 선택 **");
			System.out.println("1.저장 2.조회 3.수정 4.삭제 5.선택 조회 0.프로그램 종료");
			String selectedNumber = sc.nextLine();
			if (selectedNumber.equals(SAVE)) {
				System.out.println(">> 저장 하기 << ");
				save(sc, phones);

			} else if (selectedNumber.equals(SEARCH_ALL)) {
				System.out.println(">> 전체 조회 하기  << ");
				readAll(phones);

			} else if (selectedNumber.equals(REVISE)) {
				System.out.println(" 수정하기");
				reviseNumber(phones, sc);
			} else if (selectedNumber.equals(SEARCH_BY_NUMBER_)) {
				System.out.println(">> 선택 조회 하기  << ");
				readByPhone(sc, phones);
			} else if (selectedNumber.equals(DELETE_ALL)) {
				System.out.println(">> 전체 삭제 하기  << ");
				deleteAll(phones);
			} else if (selectedNumber.equals(END)) {
				System.out.println(">> 프로그램 종료 << ");
				flag = false;
			} else {
				System.out.println(">> 잘못된 선택 입니다.  << ");

			}
		}

	}

	// 전체 조회하기
	public static void readAll(Phone[] phones) {
		System.out.println("-----전체 조회하기-----");
		for (int i = 0; i < phones.length; i++) {
			// 방어적 코드 작성
			if (phones[i] != null) {
				System.out.println(phones[i].getName() + ", " + phones[i].getNumber());
			}
		}
	}

	// 전체 삭제하기
	public static void deleteAll(Phone[] phones) {
		System.out.println("-----전체 삭제하기-----");
		for (int i = 0; i < phones.length; i++) {
			// Object --> null
			phones[i] = null;
		}
	}

	// 수정하기
	public static void reviseNumber(Phone[] phones, Scanner sc) {
		System.out.println("----- 수정하기 ------");
		System.out.println("----- 이름을 입력해주세요-----");
		String sc1 = sc.nextLine();  
		for (int i = 0; i < phones.length; i++) {
			
				if (phones[i].getName().equals(sc1)) {
					if (phones[i] != null) {
						System.out.println("변경할 이름을 입력해주세요");
						String revise = sc.nextLine();
						phones[i].setName(revise);
						break;
					
					} else {
						System.out.println("입력한 이름이 없습니다.");
					}
				
				}
					
			}
		}
	

	// 저장하기
	public static void save(Scanner sc, Phone[] phones) {
		System.out.println("----저장하기----");
		System.out.println("폰의 번호를 입력하세요.");
		String phoneNumber = sc.nextLine();
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		Phone phone = new Phone(phoneNumber, name);
		if (lastPhoneNum >= phones.length) {
			System.out.println("더 이상 저장할 공간이 부족합니다.");
			return;
		}
		for (int i = 0; i < phones.length; i++) {
			if (phones[i] == null) {
				phones[i] = phone;
				lastPhoneNum++; // 요소의 갯수로 사용해 보자
				break;
			}
		}
		System.out.println("번호가 저장 되었습니다.");
	}

	// 선택 조회
	public static void readByPhone(Scanner sc, Phone[] phones) {
		System.out.println("----- 선택 조회 하기 ----");
		System.out.println(">>> 이름을 입력해주세요 <<< ");
		String phoneName = sc.nextLine();
		boolean isFind = false;
		for (int i = 1; i < phones.length; i++) {
			if (phones[i] != null) {
				if (phones[i].getName().equals(phoneName)) {
					System.out.println(phones[i].getName() + "," + phones[i].getNumber());
					isFind = true;
					break;
				}
			}
		}
		if (isFind == false) {
			System.out.println("해당 연락처는 존재하지 않습니다.");
		}
	}
}
