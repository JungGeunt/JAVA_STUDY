package day12.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class AutoResourceMangerExample {

	public static void main(String[] args) {
		
		try (FileInputStream in = new FileInputStream("a.txt")){ //파일을 받아 처리해주는 메소드
			// 블럭 처리해주면 사용 후 자원처리 
			
			System.out.println("read data : " + in.read());
		} catch (NullPointerException | IOException ex) { //import되어야함 
			//System.out.println(in); //in 변수 참조 못함.
			System.out.println("예외 처리합니다.");
			System.out.println(ex.toString());
		}
		
		
		 //같은 내용 
		FileInputStream in2 =null;
		try {
			in2 = new FileInputStream ("a.txt");
					System.out.println("read data : " +in2.read());
		} catch (NullPointerException ex) {
			System.out.println("예외 처리합니다.");
			System.out.println(ex.toString());
		}catch (IOException ex) {
			System.out.println(in2); 			 //지역변수가 아니기 때문에 finally로 정리해줘야함 
			System.out.println("예외 처리합니다.");
			System.out.println(ex.toString());
		}finally {
			try {in2.close();} catch (IOException e) { //예외가 발생 할 수 있음으로 catch를 사용 

			}
		}
		
		
		
	}

}
