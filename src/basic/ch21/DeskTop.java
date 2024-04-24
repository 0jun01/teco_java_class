package basic.ch21;

public class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("디스플레이");
	}

	@Override
	public void typing() {
		System.out.println("타이핑을 합니다.");
	}

}
