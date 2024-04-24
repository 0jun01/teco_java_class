package basic.exercise.toy;

import java.util.Random;

public class Airpods extends ToyMachine {

	String origin;

	public Airpods() {
		productName = "에어팟";
		price = 250_000;
		count = 1;
		origin = "애플";
	}

	@Override
	public void drawProduct() {
		Random random = new Random();
		int resultNumber = 1 + random.nextInt(50);
		if (resultNumber == 1) {
			System.out.println(price + "짜리 에어팟을 뽑으셨습니다.");
			count--;
		} else if (count == 1) {
		} else {
			System.out.println("에어팟을 못 뽑았어........");
		}

	}
}
