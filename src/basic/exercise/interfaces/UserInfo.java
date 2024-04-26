package basic.exercise.interfaces;

// DTO 개념으로 바라볼 수 있다.
public class UserInfo {

	public static int SERIAL_NUM = 0;
	private int id; // PK(식별자) -> 홍길동, 나이 이름과 나이가 같을 수 있다
					// 식별하기 위해 id가 필요
	private String userName;
	private String pw;

	public UserInfo(String userName, String pw) {
		this.userName = userName;
		this.pw = pw;
	}

	public int getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getPw() {
		return pw;
	}

	@Override
	public String toString() {
		return id + "," + userName + ", " + pw;
	}

}
