package starcraft.ver01;

import java.util.Scanner;

public class StarCraftTest2 {

	public static void main(String[] args) {

		// 상수는 대문자로 !!!
		final int ZEALOT = 1;
		final int MARINE = 2;
		final int ZERGLING = 3;
		final int GAME_END = 0;
		
		GateWay gateWay1 = new GateWay(1);
		GateWay gateWay2 = new GateWay(2);
		Barracks barracks1 = new Barracks(1);
		Barracks barracks2 = new Barracks(2);
		
		
		Zealot zealot1 = gateWay1.createZealot("질럿1");
		Zealot zealot2 = gateWay2.createZealot("질럿2");
		System.out.println(gateWay1.getGateWayNumber() + " : " + gateWay1.getCount());
		System.out.println(gateWay2.getGateWayNumber() + " : " + gateWay2.getCount());
		System.out.println("-------------------------");
		
		Marine marine1 = new Marine("마린1");
		Zergling zergling1 = new Zergling("저글링1");
		
		// for, while
		// for은 횟수가 정해져 있을 때
		// while문은 횟수가 안정해져 있을 때

		Scanner sc = new Scanner(System.in);
		int unitChoice = -1 ;
		
		do {
			
			System.out.println("유닛을 선택하세요");
			System.out.println("1.질럿\t 2.마린\t 3.저글링\t 0.게임종료");
			unitChoice = sc.nextInt();
			
			if (unitChoice == ZEALOT) {
				
			}	else if(unitChoice == MARINE) {
				
			}	else if(unitChoice == ZERGLING) {
				
			} else {
				System.out.println("프로글매을 종료 합니다.");
				unitChoice = GAME_END;
			}
			
		} while(unitChoice != GAME_END);

		
		// while <--, do while
		// while --> 조건식을 확인하고 코드를 수행
		// do while --> 무조건 한번은 수행을 하고 다시 조건을 확인하는 구문

	} // end of main

} // end of class
