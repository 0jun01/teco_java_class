package basic.exercise.test02;

public class MainTest1 {

	public static void main(String[] args) {

		// 문제 1
		A a = new A();
		B b = new B();
		// a 참조변수로 시작해서 D의 네임 값을 수정 및 설계
		System.out.println(a.b.c.d.getName());
	}

}
