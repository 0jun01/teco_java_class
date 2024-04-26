package basic.ch22;

interface Animal {
	// 추상 메서드만 선언 가능
	// public abstract void eat();
	// 접근 제어 지시자 써도 되고 안써도 됨
	// public abstract void move();
	// interface는 기능 중심 설계
	
	// 축약 가능
	void eat(); // public abstract void eat(); 이랑 똑같음

	void move(); // 위 move랑 똑같음

}

// implements - 구현하다
class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("먹이를 먹다");

	}

	@Override
	public void move() {
		System.out.println("촐랑촐랑 다닌다");
	}

}

class Bird implements Animal {

	@Override
	public void eat() {
		System.out.println("모이를 먹다");
	}

	@Override
	public void move() {
		System.out.println("날아 다니다");
	}

}