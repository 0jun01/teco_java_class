package useful.ch05;

// 문법을 쓸때
// HOW , WHY ( 어떻게  , 왜?)
public class Worker extends Thread {

	private String name;

	public Worker(String name) {
		this.name = name;
	}

	// 약속된 부분 --> run() 메서드를 정의 하면 된다.
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("worker : " + name + " : " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
