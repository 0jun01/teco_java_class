package basic.ch12;

// 번호 뽑아 주는 기계
public class NumberPrinter {
	
	private int id; // 멤버 변수
	// static 변수는 Method Area 영역에 올라간다 waitNumber 먼저 올라감
	// 즉 static waitNumber 변수는 NumberPrinter 인스턴스화 되기전에 사용 가능 하다.
	public static int waitNumber;   // static 변수 --> method Area
	
	// static은 서로 다른 기기를 공유 
	// static은 Method area에 저장
	public NumberPrinter(int id) { 
		this.id = id;
		waitNumber = 1;
	}
	
	// 기능 -- 번호표를 출력 한다.
	public void printWaitNumber() {
		
		System.out.println(id + " 번에 기기의 대기 순번은 " + waitNumber );
		waitNumber++;
	}
	
	
}
