package basic.ch16;

/**
 * 메서드 오버로딩이란? 같은 이름의 메서드를 여러 개 정의하는 것을 말한다. 단, 메개 변수를 다르게 해야한다.
 */
public class Calculator {

	// 덧셈 메서드 생성
	public int add(int a, int b) {
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	// ---------------------------------------
	public int count(int a, int b) {
		return a + b;
	}

	public double count(double a, double b) {
		return a + b;
	}
	
	public double count(double a, double b, double c, double d) {
		return a+b+c+d;
	}

	public int count(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	// 문자열 더하는 기능
	public String add(String str1, String str2) {
		return str1 + str2;
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.add("서", "사"));
		System.out.println(calculator.add(2, 3));
		System.out.println(calculator.count(1.2, 1.3, 5.7, 2.5));
		System.out.println(calculator.count(123, 789, 123, 124));

	}

}
