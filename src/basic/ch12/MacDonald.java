package basic.ch12;

public class MacDonald {

	private int id;
	public static int waitNum;
	
	public MacDonald(int id) {
		this.id = id;
		waitNum = 1;
	}
	
	public void waitNumber() {
		if(waitNum> 5) {
			System.out.println("더이상 주문이 불가능 합니다.");
			return;
		}
		System.out.println("번호는 : " + waitNum +"번 입니다." );
		waitNum++;
	}
	
}
