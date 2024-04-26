package useful;

public class StringTest {
	
	public static void main(String[] args) {

		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println( System.identityHashCode(str3)	); // 원시 해쉬코드의 주소값을 출력 해주는 녀석
		System.out.println( System.identityHashCode(str4)	); 
		str3 = str3 + " : def " ; // 새로운 것을 만들어 냄
		// String str5 =  str3 + " : def ";
		
		System.out.println( System.identityHashCode(str3)	); 
		
		// 리터럴 타입으로 생성한 String은 한번 생성하면 불변이다.
	} // end of main

} // end of class
