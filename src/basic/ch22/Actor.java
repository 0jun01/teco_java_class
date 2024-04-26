package basic.ch22;

public class Actor implements Romeo{
	// 인터페이스가 더 추상화가 높다 
	String name;
	public Actor(String name) {
		this.name = name;
	}
	@Override
	public void performsAsRomeo() {
		System.out.println(name + "가 쥴리엣 이라 말합니다.");
	}
}
