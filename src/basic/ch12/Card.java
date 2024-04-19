package basic.ch12;

public class Card {

	
	// 멤버 변수
	String cardName;
	static int basicNum = 979000;
	private int cardNum;
	
	
	// 생성자
	public Card(String cardName) {
		this.cardName = cardName;
		cardNum = basicNum;
		basicNum++;
	}
	// 멤버 함수
	
	// get,set 작성
	public String getCardName() {
		return cardName;
	}
	
	public void setCardName(String name) {
		cardName = name;
	}
	
	public int getCardNum() {
		return cardNum;
	}
	
	public void setCardNum(int cardNum){
		this.cardNum = cardNum;
	}
	
	
	//코드 테스트(메인 함수)
	public static void main(String[] args) {
		Card card1 = new Card("일의 카드 번호는 : ");
		System.out.println(card1.getCardName() + card1.getCardNum());
		Card card2 = new Card("이의 카드 번호는 : ");
		System.out.println(card2.getCardName() + card2.getCardNum());
		
	} // end of main
	
}  // end of class
