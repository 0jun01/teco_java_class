package basic.exercise.toy;

import java.util.Random;

public class LionDoll extends ToyMachine {

	public LionDoll() {
		productName = "사자인형";
		price = 1000;
		count = 0;
	}

	@Override
	public void drawProduct() {
		Random random = new Random();
		int resultNumber = 1 + random.nextInt(4);
		if (resultNumber == 3) {
			System.out.println("사자인형을 뽑으셨습니다.");
			count--;
		}
	}
}
