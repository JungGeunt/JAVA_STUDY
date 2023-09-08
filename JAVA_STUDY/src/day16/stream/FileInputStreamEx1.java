package day16.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamEx1 {

	public static void main(String[] args) {
	
		InputStream fis =null;
		
		try {
			//FIleinputStream (읽을 파일의 경로)
			fis = new FileInputStream("C:\\Users\\tjoeun\\git\\repository\\JAVA_STUDY\\file\\a.txt");
			byte[] buffer = new byte[1000];
			String	content = "";
			while(true) {//파일의 길이를 모르기때문에 무한반복문을 사용
//				int data =fis.read(); //data가 문제가있는 것이 아니라 처리가 문제가 있는 것 
//				System.out.println((char)data); // read() 1바이트씩 읽기 ..char 2바이트 씩읽음
				
			 int data = fis.read(buffer);  // 저장공간에 파일을 읽을 수 있도록 저장함 //배열의 크기인 1000byte씩 읽음
			 System.out.println(data); 	 //data-> 바이트 갯수
			 if(data!=-1) content = new String(buffer , 0 ,data);
			 else break; 
//				if(data== -1)//data가 -1인 경우는 더이상 데이터가 없는경우
//					break;
				System.out.println(content);
			}
		} catch (FileNotFoundException e) {
			System.out.println("해당 경로의 파일을 찾을 수 없습니다.");
		}catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다.ㅣ");
		
		}finally {
			try {
				fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
