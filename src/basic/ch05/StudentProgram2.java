package basic.ch05;

public class StudentProgram2 {

	// 코드의 시작점(메인함수)
	public static void main(String[] args) {

		int n1 = 1;
		double d1 = 5.0;
		// 참조 타입( 값이 들어가는게 아닌 주소값 들어간다)
		Student student1 = new Student();
		Student student2 = new Student();	
		// .연산자를 통해서 접근할 수 있다.
		
		student1.name ="홍길동";
		// 콘솔창에 student1(변수에 연결되어 있는 객체의 이름을 화면에 출력)
		System.out.println(student1.name);
		student2.name ="이순신";
		System.out.println(student2.name);
		
		System.out.println(student1);
		System.out.println(student2);
		
		//메모리에 올리다를 인스턴스화라고 한다.
	} // end of main

} // end of class
