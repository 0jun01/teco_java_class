package useful.ch03;

public class NickName {

	String nick;

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) throws NickNameException {
		if (nick == null) {
			throw new NickNameException("닉네임을 입력해주세요.");
		}
		if (nick.length() < 2) {
			throw new NickNameException("닉네임은 한 글자 일 수 없습니다.");
		}
		if (nick.length() >= 7) {
			throw new NickNameException("닉네임은 7자 이내로 지어주세요.");
		}
		if (nick.matches("[a-zA-Z]+")) {
			throw new NickNameException("닉네임은 한글로만 입력해주세요.");
		}
		if (nick.matches("^[가-힣]*$")) {
			throw new NickNameException("특수문자 하나 넣어");
		}
		this.nick = nick;
	}
}
