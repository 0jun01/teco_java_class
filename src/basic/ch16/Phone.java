package basic.ch16;

public class Phone {

	private String phoneNumber;
	private String name;
	
	public Phone (String number, String name) {
		this.phoneNumber = number;
		this.name = name;
	}
	
	public String getNumber() {
		return phoneNumber;
	}
	public void setNumber(String number) {
		this.phoneNumber = number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
