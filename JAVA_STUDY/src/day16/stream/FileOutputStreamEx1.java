package day16.stream;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileOutputStreamEx1 {

	public static void main(String[] args) {
		// 문자열을 입력 받아서 해당 문자열을 파일로 내보내기
		
		//입력
		Scanner scan = new Scanner(System.in);
		System.out.print("파일명을 입력하세요 : ");
		String name = scan.next();
		
		//빈 객체 선언
		OutputStream fos = null;
		
		try {
			//fileOutputStream(파일을 쓸 경로) // 역슬러쉬문자는 이스케이프 문자이기 때문에 두번씩 사용 //절대 경로 방식 -저장위치를 처음부터 다적는방식
			fos= new FileOutputStream("C:\\Users\\tjoeun\\git\\repository\\JAVA_STUDY\\file\\" +name + ".txt");
			System.out.print("문장 입력 : ");
			scan.nextLine(); // 버퍼 정리 ->15번 줄에 scan.next();를 입력할때 엔터가 입력되있을 수도 있어서
			String str = scan.nextLine();
			
			byte[] bs = str.getBytes(); //입력문자를 바이트 배열로 변환 시켜준것 
			
			fos.write(bs); //**  OutputStream 주 메서드
			System.out.println("파일이 정상적으로 저장되었습니다.");
			
			
		} catch (Exception ie) {
			ie.printStackTrace();
		}finally {
			try {
				fos.close();
				scan.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		

	}

}
