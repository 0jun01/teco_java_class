package basic.exercise.toy;

import java.util.Random;

// 클래스 - 인형뽑기
// 상품들이 존재 가능
// 사자인형, 곰인형, 에어팟
// 요구 조건
// 배열을 활용해서 객체들을 담아 주세요
public class ToyMachine {

	String productName;
	int price;
	int count;

	public void showInfo() {
		System.out.println("상품 이름 : " + productName);
	}

	public void drawProduct() {
		Random random = new Random();
		int resultNumber = 1 + random.nextInt(5);
		if (count <= 0) {
			System.out.println(productName + " 제품은 다 뽑혔습니다.");
			count = 0;
		}
		count -= 1;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
