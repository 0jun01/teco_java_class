package basic.ch08;

public class UserInfo {

	public String userId;
	public String userPassword;
	public String userName;
	public String userAddress;
	public String phoneNumber;

	// 생성자 오버로딩이란
	// 생성자의 개수가 여러개 있는 것

	// 기본 생성자가 형태 만들어보기
	public UserInfo() {
	}

	public UserInfo(String id) {
		userId = id;
	}

	public UserInfo(String id, String name) {
		userId = id;
		userName = name;
	}

	// 연습 문제 -
	// 1 - 메개변수 3개를 받는 생성자를 만들어 주세요
	public UserInfo(String id, String name, String pwd) {
		userId = id;
		userName = name;
		userPassword = pwd;
	}

	// 2 - 메개변수 4개를 받는 생성자를 만들어 주세요
	public UserInfo(String id, String name, String pwd, String address) {
		userId = id;
		userName = name;
		userPassword = pwd;
		userAddress = address;
	}

	// 3 - 메개변수 5 개를 받는 생성자를 만들어 주세요
	public UserInfo(String id, String name, String pwd, String address, String number) {
		userId = id;
		userName = name;
		userPassword = pwd;
		userAddress = address;
		phoneNumber = number;
	}

} // end of class
