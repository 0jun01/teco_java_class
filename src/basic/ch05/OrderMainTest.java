package basic.ch05;

public class OrderMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order orderList = new Order();
		orderList.restaurantName = "지존 식당";
		orderList.menu ="냉면";
		orderList.orderCount =3;
		orderList.totalPrice= 16500;
		
		System.out.println(orderList.restaurantName);
		System.out.println(orderList.menu);
		System.out.println(orderList.orderCount);
		System.out.println(orderList.totalPrice);
	}

}
