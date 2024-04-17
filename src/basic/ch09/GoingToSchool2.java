package basic.ch09;

import java.util.Scanner;

public class GoingToSchool2 {

	public static void main(String[] args) {

		// 설계된 클래스를 가지고 본인이 의도한 대로 실행에 흐름을 만들어 보자.
		
		// 스캐너를 활용해서 1번을 누르면 버스를 태워서 실행에 흐름 만들기
		// 2번을 누르면 지하철을 태우는 실행에 흐름을 만들어 보자.
		Bus bus1 = new Bus(100); // 선언만 했음
		Bus bus2= new Bus(100); // 선언만 했음
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(1);
		Student s1 = new Student("티모", 100_000);
		Student s2 = new Student("야스오", 100_000);
		
		// 만약 스캐너가 1번이라면 자기 맘대로! 동작 시키기
		Scanner sc = new Scanner(System.in);
		int enter = sc.nextInt();
		
		if(enter == 1) {
			s1.takeBus(bus2);
			s1.showInfo();
			bus2.showInfo();
			bus2.running();
			s1.fee(50000);
			bus2.outOfBus();
		} else if(enter == 2) {
			
			
		}
	} // end of main

} // end of class
