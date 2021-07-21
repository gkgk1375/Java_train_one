package chap07;
//추상 메소드 오버라이드
public class Dog extends Animal {
	public Dog() { //생성자
		this.kind = "포유류";//각각 다른 kind
	}

	@Override
	public void sound() {//추상 메소드 재정의
		System.out.println("멍멍");
		
	}
	

}
