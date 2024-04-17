package basic.ch05;

public class UserMainTest {

	public static void main(String[] args) {

		User clientInfo = new User();
		clientInfo.clientName = "변영준";
		clientInfo.clientEmail ="dudwns@naver.com";
		clientInfo.clientNum ="010-1234-5678";
		clientInfo.clientAge = 27;
		
		System.out.println(clientInfo.clientName);
		System.out.println(clientInfo.clientEmail);
		System.out.println(clientInfo.clientNum);
		System.out.println(clientInfo.clientAge);
				
		
	}

}
