package day16.file;

import java.io.File;
import java.io.FileReader;

public class FileExample {
	
	static String env_path = "C:\\Program Files\\Common Files\\Oracle\\Java\\javapath;C:\\Windows\\system32;C:\\Windows;C:\\Windows\\System32\\Wbem;C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\;C:\\Windows\\System32\\OpenSSH\\;C:\\Program Files\\Java\\jdk-17\\bin;C:\\Program Files\\Bandizip\\;C:\\Program Files\\Git\\cmd;C:\\Users\\tjoeun\\AppData\\Local\\Microsoft\\WindowsApps;";

	public static void main(String[] args) {
		File f = new File("D:/filetest/a.txt");
		File dir = new File ("./"); //상대 경ㅇ로
		
		//1. exists :파일 혹은 디레터리의 존재 여부 확인
		System.out.println("exist? " +f.exists());
		System.out.println("exist? " +dir.exists());

		
		//2. isDirectory : 디렉터리인지 여부 확인 (파일이라면 false)
		System.out.println("isDirectory? " + f.isDirectory());
		System.out.println("isDirectory? " + dir.exists());
		
		//3. isAbsolute :해당 결로가 절대 경로인지 확인
		//파일이나 디렉토리를 지정할 떄 , 루트(최상위 경로)부터 모든 경로를 다 기술하는 경우 "절대경로"
		//->절대 경로는 어디서든 같은 값을 가지고 있습니다.
		// 		 단 , 절대 경로는 경로의 길이 값이 길어질 수 있어요 . 이 때문에 불편 할 수 있음.
		//파일이나 디렉토리를 지정할떄 , 현재 작업위치를 기준으로 경로 정보를 기술하는 경우, "상대 경로 "
		//-> 작업 위치에 따라서 변경이 됩니다.
		//		절대 경로와 달리 상대적인 경로 이기 때문에 간단하게 경로를 기술하는 것이 가능 함.
		System.out.println("isAbsolute? " +f.isAbsolute());
		System.out.println("isAbsolute? " +dir.isAbsolute());
		
		// 4.canExecute ,canRead, canWrite: 권한 확인
		System.out.println("canExecute ? " + f.canExecute());
		System.out.println("canRead ? " + f.canExecute());
		System.out.println("canWrite ? " + f.canExecute());
		System.out.println("canExecute ? " + dir.canExecute());
		System.out.println("canRead ? " + dir.canExecute());
		System.out.println("canWrite ? " + dir.canExecute());
		
		//5. getAbsloutePath :절대 경로 반환(상대 경로의 절대경로를 찾아줌)
		System.out.println("./의 실제 위치 (절대 경로) : " + dir.getAbsolutePath());
	
		
		//6.부모 폴더를 문자열로 반환
		System.out.println(f.getParent());
		
		//7. 부모 폴더를 file 객체로 반환
		File f_parent = f.getParentFile();
		System.out.println(f_parent);
		
		//8.static 한 것들   -구분값
		System.out.println(File.separator);  					 // "\"  경로분리 구분값으로 사용하는 것 /경로와 경로사이에
		System.out.println(File.separatorChar);					 // "\"  구분값을 사용하는 것의 문자 
		System.out.println(File.pathSeparator);					 // ";"  경로가 달라질때 사용하는 것
		System.out.println(File.pathSeparatorChar);				 // ";"  경로가 달라질떄 사용하는 것의 문자 
		
		
		//환경 변수
		String [] path = env_path.split(File.pathSeparator); // 지정한 구분자를 이용하여 문자를 자르고 배열로 리턴하는 함수입니다.
		for (String p : path) {							     // pathSeparator를 사용해서 ';'이 문자를 사용해서 자르고 배열로 리턴 
			System.out.println(p);
		}
		
		//파일 생성 /수정 /삭제
		File test = new File ("D:\\filetest3\\temp\\abc");
		// mkdir : 해당 경로의 폴더를 생성 (디렉토리 생성)
		//mkdirs() : 존재하지 않은 부모 폴더까지 모두 포함하여 폴더를 생성
		if(!test.exists()) {
			//test.mkdir();   // 중간에 경로가 없으면 만들지 못함. "D:\\filetest3\\temp디렉토리에 abc를 만들려고하는 메서드
			test.mkdirs();
		}
		
		//createNewFile  파일이 없으면 새로 생성
		test = new File("D:\\filetest3\\a.txt");
		try {
			test.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일 생성중 에러가 발생하면 나옴!!");
		}
		
		//delete : 파일이나 폴더를 삭제한다. 폴더는 비어 있지 않으면 삭제 할 수 없다.
		test = new File ("D:\\filetest3\\temp\\abc");
		test.delete();
		
		//renameTo : 파일이나 폴더의 이름 및 경로를 변경합니다.
		test = new File ("D:\\filetest3\\temp");
		File dst = new File("D:\\filetest3\\temp2");
		test.renameTo(dst);
		
		
		File test3= new File ("D:\\filetest4\\");
		if(!test3.exists()) {
			test3.mkdirs();
		}
		
		File file = new File("D:/filetest4/서시.txt");
		System.out.println(file.isDirectory()); // 파일
		
		File mm = new File("D:\\filetest5\\testFile\\temp\\");
		if(!mm.exists());{
			mm.mkdirs();
		}
		System.out.println(mm.exists());
		
		File mm2 = new File("D:\\filetest5\\testFile\\temp\\서시.txt");
		
		file.renameTo(mm2);
		
		File file2 = new File("D:\\filetest5\\testFile\\temp\\서시.txt");
		if(!file2.exists()) {
			file2.mkdirs();
		}
		
		FileReader in = null;
		
		try {
			in = new FileReader(file2); 
			while(true) {
				int data =in.read();
				System.out.print((char)data);	
				if(data== -1) {
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
