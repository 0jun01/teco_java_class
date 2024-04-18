package basic.ch11;

public class PersonTest {

	public static void main(String[] args) {
		
		// 객체 1개 생성
		Person person1 = new Person("홍길동", 100);
		Person personBox = person1 ;
		Person personBox2 = person1.getPerson();
		// 위 셋다 같은 주소
		
		
		// 객체 2개 생성
		Person personLee = new Person("이순신", 101);
		System.out.println("---------------------");
		// 위 코드까지는 Heap 메모리 영역에 객체가 2개 생성된 상태 이다. 
		// 지역변수인 person1, personBox, personBox2 는 같은 객체의 주소를 가리킨다.
		
		// 연습 문제
		//person1.setName("티모"); 으로 하든 밑에 Box로 하든 똑같이 입력 된다.
		personBox2.setName("티모");
		person1.showInfo();
	} // end of main

} // end of class
