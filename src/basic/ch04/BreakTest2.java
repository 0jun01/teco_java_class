package basic.ch04;

public class BreakTest2 {

	public static void main(String[] args) {

		// for 문 대신에 --> while 변경해서 결과를 출력해보세요
		int i = 1;
		// 풀이 1
		
		//while (i<=100) {
			//if (i % 3 == 0) {
				//System.out.println("i의 값은 : " + i);
			//}
			//i++; // 식 먼저 사용하기 (무한 반복 예방)
		//}
		boolean flag =true;
		while(flag) {
			
			if (i % 3 ==0) {
				System.out.println("3의 배수 : " + i);
			}
			// 특정 조건 --> 멈추기
			if(i == 100) {
				flag=false;
			}
			i++;
		}
		// 풀이 2 : 특정 조건이 되었을 때 반복문을 멈추어라
	}// end of main

}// end of class
