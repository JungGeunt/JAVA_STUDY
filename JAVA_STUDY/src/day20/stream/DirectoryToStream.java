package day20.stream;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class DirectoryToStream {

	public static void main(String[] args) {
		// list()메서드를 이용하여 스트림 생성하기
		
		try {
			System.out.println("list() 메서드 이용하여 스트림 생성하기");
			//src 디렉토리로 Path 객체 생성     	   //상대경로는 실행하는 부분부터 시작 
			Path path = Paths.get("src");  //프로젝트는 개발 툴에서는 최상위에서 동작. 따라서  src 는 현재 프로젝트 안에 src임 
			//src 경로의 모든 디렉토리와 파일 Stream 객체로 생성
			Stream<Path> sr1 = Files.list(path);
			sr1.forEach(p -> System.out.println(p.getFileName())); //p는 Path 객체
			
			System.out.println("find()메서드를 이용해서 스트림 생성하기");
			//src 디렉토리를 시작으로 특정 단계까지 디렉토리 싶이로 탐색  //10은 디렉토리를 들어갈수 있는 최대 수
			Stream<Path> sr2 = Files.find(path, 10, (p, BasicFileAttributes)-> {
				File file = p.toFile();
				// 디렉토리가 아니고, 파일 이름에 Stream이 포함된 파일명
				return !file.isDirectory() && file.getName().contains("Stream");
			});
			sr2.forEach(p-> System.out.println(p.getFileName()));
 		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
