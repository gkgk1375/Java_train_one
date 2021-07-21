package chap07;

public abstract class Animal {//추상 클래스 선언
	public String kind; //변수선언
	
	public void breathe() {//공통사항
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); //추상 메소드 선언 (서로 다른것을 선언)

}
