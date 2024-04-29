package useful.ch03;

public class PasswordMaintTest {

	public static void main(String[] args) {

		Password password = new Password();

		String inputPwd = null;
		inputPwd = "abcde";
		// 텟
		// 숫자를 안넣으면 오류
		//password.setPwd(inputPwd);
		// 테스트 해보니깐 아래 코드는 실행 시점에 예외가 발생한 코드이네!!!
		// 해결 1. 직접 예외 처리
		// 2. 던지기
		try {
			password.setPwd(inputPwd);
			// 예외 클래스를 던졌기 때문에 예외 구문이 밑에 출력이 된다.
		} catch (PasswordException e) {
			System.out.println("우리가 정의한 password 예외가 발생");
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
	} // end of main

} // end of class
