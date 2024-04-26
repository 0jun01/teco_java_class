package basic.exercise.interfaces;

public interface IUserInfoDao {
	// 인터페이스는 역할과 구현으로 바라보면 된다 (스펙)
	// C R U D
	// 인터페이스 안이라서 public abstract 생략 가능
	// TODO - 메개변수 수정 예정
	public abstract void insertUserInfo(UserInfo info);

	// 단 수정이 되면 안되는 것은 제외
	public abstract void updateUserInfo(UserInfo info);

	public abstract void deleteUserInfo(int id);

	public abstract void selectUserInfo(); // 전체 조회
}
