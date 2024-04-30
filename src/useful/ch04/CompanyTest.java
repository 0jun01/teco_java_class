package useful.ch04;

public class CompanyTest {

	public static void main(String[] args) {
		// 생성 불가 private으로 제어지시자를 선언해서
		// Company company = new Company();

		// 고민! Company 객체를 어떻게 접근 할 수 있을까?

		// A클래스에서 활용
		Company company = Company.getInstance(); // static은 이름으로 호출 가능
		System.out.println(company);

		// B클래스에서 활용
		Company company2 = Company.getInstance();
		System.out.println(company2);
		// 객체가 한개만 생성된 것을 볼 수 있다.
	} // end of main

} // end of class
