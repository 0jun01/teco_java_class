package basic.ch22;

public class ToyRobot extends HomeAppliances implements RemoteController,SoundEffect{

	int width;
	int height;
	String color;
	
	@Override
	public void turnOn() {
		System.out.println("장난감 로봇을 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("장난감 로봇을 끕니다.");
		
	}
	@Override
	public void soundOn() {
		System.out.println("취지직");
	}
	@Override
	public void soundOff() {
		System.out.println("뾰봉");
	}
	
}
