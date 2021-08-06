package chap18.four.two;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"D:\\KYH-DATA\\git_data\\Java_train_one\\two\\src\\chap18\\four\\one\\"
					+ "FileExample.java");
			int data;
			
			while ((data = fis.read() )!= -1) { //1바이트씩 읽고 콘솔에 출력
				System.out.write(data);
			}
			fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
