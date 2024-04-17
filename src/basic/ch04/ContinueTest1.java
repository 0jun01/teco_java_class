package basic.ch04;

public class ContinueTest1 {

	public static void main(String[] args) {

		// 1부터 100까지 숫자 중에  3의 배수를 출력 하세요
		
		// 1 ~ 100 --> 반복적인 패턴이 확인
		// 만약 3의 배수라면 화면에 숫자를 출력하세요.
		// 반복문은 for 을 사용해 주세요
		
		int num = 0;
		
		for(int start = 1; start <= 100; start++) {
			if(start % 3 == 0) {
				System.out.println(start);
			}
				
			
		}
		
	} // end of main

} // end of class
