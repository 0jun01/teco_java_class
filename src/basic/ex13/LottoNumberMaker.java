package basic.ex13;

// 수입하다. 가지고 오다.
import java.util.Random;

public class LottoNumberMaker {

	// 멤버 변수
	private String version = "1.0.0";
	
	// main 함수
	public static void main(String[] args) {
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		
	} // end of main
	
	// 인스턴스에 속하지 않는 함수 만들기
	public static int makeNumber() {
		// static 함수안에 멤버 변수를 사용할 수 없다.
		// 메모리가 뜨는 순서 !! methodarea -> stack -> heap
		//System.out.println("ver : " + version);
		// 자바 도구 -- 표준 API
		// 난수 발생기 - 랜덤적인 값 생성
		Random random = new Random();
		int resultNumber = 1 + random.nextInt(45); // 0 ~~~~ 44까지 번호를 만들어줌 
		return resultNumber;
	} 
	
	// 인스턴스에 속하지 않는 함수 만들기
	public static int[] makeNumbers() {
		int[] numbers = new int[6];
		Random random = new Random();
		
		for(int i = 0 ; i < 6; i++) {
			int num = random.nextInt(45) + 1;
			
			
			//[0] 3.
			//[1] 3.
			numbers[i] = num;
		}
		return numbers;
	}
	
	
	public static int makeNumber2() {
		Random random = new Random();
		int resultNumber = random.nextInt(45);
		return resultNumber;
	}
}
