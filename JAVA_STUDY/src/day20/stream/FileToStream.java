package day20.stream;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileToStream {

	public static void main(String[] args) {
		
		try {
			//paths.get() 메서드 사용
			Path path = Paths.get("src/day20/stream/StrToStream.java");
			Stream<String> stream = 
					Files.lines(path,Charset.defaultCharset());  //Charset(추상 클래스)은 인코딩법 지정하는 
			stream.forEach(s-> System.out.println(s));           //Files path경로에  데이터를  lines읽어주는 
			stream.close(); //스트림 종료 							 //defaultCharset() 내가 설정한 인코딩법
			System.out.println();
			
			//BufferedReader의 lines()메서드 이용 (반환 타입 : Stream<String>) 
			File file = path.toFile();
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			br.lines().forEach(s -> System.out.println(s)); 
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
