package basic.exercise.toy;

import java.util.Random;

public class BearDoll extends ToyMachine{

	public BearDoll() {
		productName = "곰인형";
		price = 1000;
		count = 3;
	}
	@Override
	public void drawProduct() {
		Random random = new Random();
		int resultNumber = 1 + random.nextInt(4);
		if (count <= 0) {
			System.out.println("곰인형 재고가 떨어졌습니다.");
			return;
		} 
		else if (resultNumber == 2) {
			System.out.println("곰인형을 뽑으셨습니다.");
			count--;
		} 
		
	}
}
