package day17.filterStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import util.Closer;

public class StringInputExample {

	public static void main(String[] args) {
		//한줄씩 입력 받아서 내용을 저장
		File file =new File("C:\\Users\\tjoeun\\git\\repository\\JAVA_STUDY\\file\\stringline.txt");
		InputStreamReader isr =null; // 키보드 입력 값 처리
		BufferedReader br = null;
		FileOutputStream fos =null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null; 
		
		String inpuString;
		System.out.println("저장 할 내용을 입력후 Ctrl+ z를 눌러주세요"); //콘솔 정상 종료 버튼 
															 //ctrl c 브레이크 버튼
		//노드 스트림은 다른 노드 스트림을 받을 수 있음.
		try {
			isr = new InputStreamReader(System.in); //byte ->char 메서드
			br= new BufferedReader(isr);
			
			fos = new FileOutputStream(file); //파일을 저장하기 위해 //노드 스트림 byte
			osw = new OutputStreamWriter(fos);//문자로 처리하기 위해 // byte ->char
			bw = new BufferedWriter(osw);//
			
			while ((inpuString=br.readLine())!= null ) {
				bw.write(inpuString + "\n");
				//bw.newLine(); 역슬러시 대신
				
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(br!=null)Closer.close(br);
			if(br!= null)Closer.close(bw);
		}
		
		

	}

}
