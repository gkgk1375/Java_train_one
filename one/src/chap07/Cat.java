package chap07;

public class Cat extends Animal {
	public Cat() {// 생성자
		this.kind = "포유류"; //Animal 클래스에서 kind 상속을 받아 사용가능, 각각다른 kind
	}

	@Override
	public void sound() { //추상 메소드 재정의
		System.out.println("야옹");
		
	}

}
