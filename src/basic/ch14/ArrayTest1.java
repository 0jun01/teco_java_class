package basic.ch14;

public class ArrayTest1 {

	public static void main(String[] args) {

		// 배열이란?
		// 연관된 데이터를 모아서 통으로 관리하기 위한 데이터 타입!!
		
		// 배열에 특징(중요)
		// 배열은 사용하기 전에 반드시 크기를 몇 개의 데이터가 들어갈지
		// 크기를 지정해야 사용할 수 있다.
		
		// 배열 메모리 공간 만들기
		int[] numbers  = new int[3]; // heap이라는 메모리안에 정수값 3개라는 값을 담을 수 있는 변수 생성
		int intBoxes[] = new int[5]; // 배열 문법은 2개 
		
		// 값 넣기 (초기화)
		// 배열에 길이 -> 3
		// 인덱스에 길이 -> 2
		numbers[0] = 1000;
		numbers[1] = 1001;
		numbers[2] = 1002;
		//numbers[3] = 1003; 오류발생, 인덱스 범위 벗어남
		// 사전기반지식 - 모든 프로그래밍에 인덱스 번호의 시작은 0부터 시작.
		
		// 배열에 선언과 동시에 초기화
		int[] grades = new int[] {5,3,1}; // 인덱스의 길이는 2
		int[] grades2 = {5,3,1}; // new int[] 생략 가능.
		
		// 문제 1
		// 5개의 크기를 가지는 double 타입의 배열을 선언 하시오
		// 단, 배열에 이름은 마음대로 작성하세요
		double[] arr1 = new double[5]; // -> [][][][][]
		
		// 문제 2
		// 위에서 선언한 배열의 값을 인덱스 0 ~ 2 까지 초기화 하시오
		// 값은 아무거나 상관 없음
		arr1[0] = 1.0;
		arr1[1] = 2.0;
		arr1[2] = 3.0;
		//arr1[3] = 0.0;
		//arr1[4] = 0.0; 값을 안넣으면 0으로 초기화 되어있음
		
		
		// 문제 3
		// String 타입의 배열을 선언, 배열의 크기는 3개
		String[] arr2 = new String[] {"a","b","c"};
		String[] arr3 = {"a","b","c"};
		
		
		
	} // end of main

} // end of class
