package chap18.four.three;

import java.io.FileInputStream; //IoStream을 이용하면 어떠한 형식의 파일도 복사 가능함.
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) throws Exception {
		String originalFileName ="c:/imgsource/한글이비다.hwp";
		String targetFileNmae = "c:/imgtarget/한글이비다.hwp";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileNmae);
		
		int readByteNo;
		byte[ ] readBytes = new byte[100];
		while( ( readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다.");
		

	}

}
