package basic.exercise.interfaces;

import basic.ch05.User;

public class UserInfoClinet {
	
	// main (메인 쓰래드 : 메인 작업자 1) 
	public static void main(String[] args) {
		
		// 사용자에게 정보를 입력하세요 --> Scanner 활용
		String inputUserName = "홍길동";
		String inputUserPw = "asd123";
		// data Transfer Object
		// DTO : 데이터를 받아서(취합해서) 전달하는 역할을 가지고 있는 인스턴스를 말한다.
		UserInfo info1 = new UserInfo(inputUserName, inputUserPw);
		
		// 데이터를 받아서 IUserInfoDao를 구현한 구현 클래스에게 전달하고자 한다.
		// UserInfoMySqlDaoImpl,UsesrInfoOracleDaoImpl
		//IUserInfoDao iUserInfoDao1 = new UserInfoMySqlDaoImpl();// 다형성 , 업캐스팅 된 상태
		IUserInfoDao iUserInfoDao1 = new UsesrInfoOracleDaoImpl();
		
		iUserInfoDao1.insertUserInfo(info1);
		iUserInfoDao1.updateUserInfo(info1);
		iUserInfoDao1.deleteUserInfo(info1.getId());
		iUserInfoDao1.selectUserInfo();
		
	} // end of main
	
} // end of class
