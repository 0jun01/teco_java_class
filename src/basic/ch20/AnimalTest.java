package basic.ch20;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.move();
		animal.eating();
		System.out.println("------------------");

		Animal 주소2 = new Tiger(); // 업캐스팅 --> 부모의 클래스로 자식 클래스의 객체를 참조
		주소2.move();
		주소2.eating();
		System.out.println("------------------");

		// 컴파일 시점의 오류 Animal 클래스에는 readBooks가없음
		Animal 주소3 = new Human();
		주소3.move();
		주소3.eating();
		((Human) 주소3).readBooks(); // 다운 캐스팅
		System.out.println("------------------");
		
		
		
		
	} // end of main

} // end of class
