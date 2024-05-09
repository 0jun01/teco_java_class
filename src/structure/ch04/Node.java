package structure.ch04;

public class Node {

	private String data; // 하나의 문자열을 저장하는 데이터
	// 자기 참조 관계 ( self reference )
	// 정의: 자기 참조는 객체가 자신과 같은 타입의 다른 객체를
	// 가리키는 경우를 말합니다.
	// 용도: 연결 리스트, 트리 구조에 많이 활용
	public Node next;

	// 기본생성자
	public Node() {
		data = null;
		next = null; // 자기 참조
	}

	public Node(String data) {
		this.data = data;
		next = null;
	}

	public Node(String data, Node link) {
		this.data = data;
		this.next = link;
	}

	public String getData() {
		return data;
	}

}