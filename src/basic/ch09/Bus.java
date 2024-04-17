package basic.ch09;

public class Bus {
	// 기본 생성자 생성
	int busNumber;
	int passengerCount; // 승객 수
	int money; // 수익금
	String exit;
	String run;
	int fine;
	
	// 강제성 
	public Bus(int number) {
		// (생성자는) 객체 생성시에 제일 먼저 실행 되는 부분
		busNumber = number;
	}
	public void running() {
		run = "버스안에서 뛰어다니고 있습니다.";
		System.out.println(run);
	}
	// 승객을 태운다.
	public void take(int pay) {
		//money = money + pay;
		money += pay;
		//passengerCount = passengerCount + 1;
		passengerCount++;
	}
	
	
	
	public void outOfBus() {
		exit ="기분이 상해서 버스를 내렸습니다";
		System.out.println(exit);
	}
	
	// 현재 상황을 보여주는 기능을 만들어 보자.
	public void showInfo() {
		System.out.println("버스 번호 : " + busNumber);
		System.out.println("버스 승객수 : " + passengerCount);
		System.out.println("버스 수익금 : " + money);
	}
	
	
	
}
