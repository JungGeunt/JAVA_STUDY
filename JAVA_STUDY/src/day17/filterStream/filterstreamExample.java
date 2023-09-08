package day17.filterStream;

import java.io.*;	//입출력 관련 일정내용 모두 선택
	
	
	
public class filterstreamExample {

	public static void main(String[] args) {
		
		FileReader input =null;
		FileWriter output =null;
		BufferedReader bufInput =null;
		BufferedWriter bufOutput = null;
		
		try {
			String infile ="C:\\Users\\tjoeun\\git\\repository\\JAVA_STUDY\\file\\w.txt";
			String outfile = "C:\\Users\\tjoeun\\git\\repository\\JAVA_STUDY\\file\\w_out.txt";
			
			//필터 스트림은 대상이 노드 스트림을 대상
			input = new FileReader(infile);
			output = new FileWriter(outfile);
			
			//필터스트림...
			bufInput = new BufferedReader(input);
			bufOutput = new BufferedWriter(output);
		
			String line;
			line = bufInput.readLine(); //문자열에 "\n"을 만난때까지  입력 .없으면 null 반환  //한줄을 출력해줌
			System.out.println(line);	//테스트를 위한 메세지 !!!!!
			
			
			while(line != null) {
				bufOutput.write(line, 0 , line.length());
				bufOutput.newLine(); //줄바꿈 + "\n" 을 입력한 것과 같음
				line =bufInput.readLine();
			}
			System.out.println(infile + ">>" + outfile);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(bufInput != null)
			try {bufInput.close();} catch (Exception e2) {}
			if(bufOutput != null)
			try {bufOutput.close();} catch (Exception e2) {}   //close 되지않으면 파일이 생성 되지 않음
		}
	}

}
