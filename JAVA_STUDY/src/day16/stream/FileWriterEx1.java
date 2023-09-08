package day16.stream;

import java.io.File;
import java.io.FileWriter;

public class FileWriterEx1 {

	public static void main(String[] args) {
		 
		File f = new File("C:\\Users\\tjoeun\\git\\repository\\JAVA_STUDY\\file\\w.txt");

		
		// new FileWriter(File f, boolean append)
		//File F : 쓰고자하는 파일 객체의 정보
		//append :true 일때 파일에 추가하면서 쓰는 기능 (기본값 :false)
		
	 FileWriter out = null; //객체 선언
	 try {
		// FileWriter 객체 생성
		 out =new FileWriter(f, true);  //append가 false이면 추가 x , true이면 추가
		 out.append("테스트를 위한 메세지 !!!!!\n");
		 out.append("테스트를 위한 메세지 2!!!! \n");
		 out.append("테스트를 위한 메세지 3!!!! \n");
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		if(out != null) 
			try {out.close();} catch (Exception e2) {}
	}
		
	}

}
