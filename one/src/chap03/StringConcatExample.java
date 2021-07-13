package chap03;

public class StringConcatExample {

	public static void main(String[] args) {
		
		String str1 = "JDK" + 6.0;
		String str2 = str1 + "특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		//문자열 문자열 숫자를 만나면 무조건 결합
		String str4 = 3 + 3.0 + "JDK";
		//결함을 할때 숫자 숫자 문자열을 만나면 숫자 연산후 결함
		System.out.println(str3);
		System.out.println(str4);
	}

}
