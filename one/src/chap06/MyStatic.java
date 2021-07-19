package chap06;

public class MyStatic {
	static int count = 0;//전역변수 선언 
	//static은 1번만 초기화를 하고 프로그램이 끝날때 까지 값을 유지함
	MyStatic(){ //생성자 만듦
		this.count++;
		System.out.println(this.count);
	}

	public static void main(String[] args) {
		MyStatic my1 = new MyStatic();
		MyStatic my2 = new MyStatic();
		MyStatic my3 = new MyStatic();
		MyStatic my4 = new MyStatic();

	}

}
