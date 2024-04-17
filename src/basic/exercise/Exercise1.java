package basic.exercise;

public class Exercise1 {
	// 코드의 시작점(main 함수)
	public static void main(String[] args) {
		// 1. 데이터 10, 100, 100 변수를 이름을 정해서 선언
		// 선언하고 동시에 초기화 후 화면에 출력 하시오
		
		int one = 10;  // 변수에 선언과 동시에 초기화(값을 넣다)
		int two = 100;
		int three = 100;
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
	
		
		// 2. int agebox 상자에 20을 담기
		int ageBox = 20;
		
		// 2.1 ageBox 상자의 값을 30으로 변견하고 기존에
		// 담겨 있던 데이터를 다른 곳으로 옮기기
		int oldBox = ageBox;
		ageBox = 30;
		// 아까있던 녀석은 어떻게 찾아 오지?
		System.out.println("ageBox : " + ageBox);
		System.out.println("ageBox : " + oldBox);
		
		// 3. int a = 1; int b = 3 일 때 둘이 바꾸기
		int a = 1;
		int b = 3;
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Changed a : " +a);
		System.out.println("Changed b : " +b);
		
	} // end of main
} // end of class
