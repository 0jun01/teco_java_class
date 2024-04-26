package basic.ch22;

public class Refrigerator extends HomeAppliances implements RemoteController, SoundEffect{

	
	
	@Override
	public void turnOn() {
		System.out.println("냉장고를 작동합니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("냉장고를 끕니다.");
	}

	@Override
	public void soundOn() {
		System.out.println("띵");
	}

	@Override
	public void soundOff() {
		System.out.println("땅땅");
	}


}
