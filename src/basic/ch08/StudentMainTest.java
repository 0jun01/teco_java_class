package basic.ch08;

public class StudentMainTest {

	public static void main(String[] args) {

		Student s1 = new Student("홍길동", 101 , 3); // 메모리에 올라감(객체라고 부름)
		System.out.println(s1); // 주소값이 출력이 된다.
		s1.showInfo();
		Student s2 = new Student("영준", 111,3);
		s2.showInfo();
		// 연습문제
		// s2 참조 변수에 이름으로 학생을 메모리에 올리고
		// 호출해주세요
		
		// 변수에 직접 접근해서 값을 초기화 해보세여
		Student s3 = new Student(); // 기본 생성자로 메모리가 올림
		s3.name = "준";
		s3.number = 123;
		s3.grade = 4;
		s3.showInfo();
		
		
		// 생성자를 여러개 만들어 줄 수 있다.
		// 생성자 오버로딩이라고 함.
	} //end of main

}
