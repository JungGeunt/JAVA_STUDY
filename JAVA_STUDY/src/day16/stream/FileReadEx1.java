package day16.stream;

import java.io.File;
import java.io.FileReader;

public class FileReadEx1 {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\tjoeun\\git\\repository\\JAVA_STUDY\\file\\w.txt");
		
		FileReader in = null; //파일을 읽는 스트림
				
		try {
			in = new FileReader(f); //Char 기반 스트림 2바이트 씩 읽기 때문에 오류가 나지않음 
			while(true) { // 텍스트의 길이를 알 수 없기 때문에
				int data =in.read();  //데이터를 인트 변수에 넣어줌 read는 한문자 씩 읽어 줌
										// 이때 한문자를 유니코드로 읽어오기 때문에 인트로 변환시켜넣어줌
				//System.out.printf("%X" , data); x는 16진수 
				System.out.print((char)data);	
				if(data== -1) { //read() 더이상 출력 할 것이 없으면 -1 를 반환 하기 때문에
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {in.close();} catch (Exception e) {}
		}	
		

	}

}
