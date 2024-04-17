package basic.ch03;

public class Operation2 {

	public static void main(String[] args) {

		int result1 = 5 + 3;
		int result2 = 5 - 3;
		int result3 = 5 * 3;
		// 고민해볼 사항
		// int result4 = 5 / 3;
		double result4 = 5.0 / 3;
		int result5 = 5 % 3;
		
		System.out.println("result1 " + result1);
		System.out.println("result2 " + result2);
		System.out.println("result3 " + result3);
		System.out.println("result4 " + result4);
		System.out.println("result5 " + result5);
		System.out.println("-------------");
		int data1 = (12 + 3) / 3;
		int data2 = (25 % 2);
		double data3 = 15.0/ 4;
		System.out.println(data1);
		System.out.println(data2);
		System.out.println("Data3의 절대값 : " + Math.abs(data3));
		
		// 고등학생인 영준, 미영, 미진이가 4500원짜리 담배를 3갑 사러 편의점을 갔는데
		// 고등학생은 담배가 한 갑당 30% 할인이라고 한다. 할인 받은 한 갑의 금액과 
		// 할인 받은 담배 3개의 총 구입 금액은?
		final int SMOKE_PRICE = 4500;
		final double DISCOUNTED_RATE = 0.3;
		double discounted_value = SMOKE_PRICE * (1 - DISCOUNTED_RATE);
		int final_value = (int) discounted_value;
		int total_value = final_value * 3;
		System.out.println("고등학생 할인 받은 담배 가격 : " + final_value);
		System.out.println("담배 3개를 30% 할인받아 구입한 총 금액 : " + total_value);
		
	}// end of main

}// end of class
