package chap06;

public class SingletonExample {

	public static void main(String[] args) {
		/*
		 * Singleton obj1 = new Singleton();
		 * Singleton obj2 = new Singleton(); //컴파일 에러
		 */
		Singleton obj1 = Singleton.getInstance(); 
		Singleton obj2 = Singleton.getInstance(); // 하나의 메모리로 여러 멤버가 같이사용
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		}else {
			System.out.println("다른 Singleton 객체 입니다.");
		}

	}

}
