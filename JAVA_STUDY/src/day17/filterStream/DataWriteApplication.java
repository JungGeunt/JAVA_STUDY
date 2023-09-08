package day17.filterStream;

import java.io.*;

import util.Closer;

public class DataWriteApplication {

	public static void main(String[] args) {
		
		//파일 객체
		File file = new File("C:\\Users\\tjoeun\\git\\repository\\JAVA_STUDY\\file\\customer.data");
		
		// 노드 스트림
		FileOutputStream fos =null;
		//필터 스트림 -Data
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			//DataInput/OutputStream은 데이터를 순서대로 추가.... 불러대로 순서대로 불러야함.
			dos.writeUTF("홍길동"); dos.writeChar('M');  //유니코드 한글을 받아들이기 위해 
			dos.writeUTF("hkd@test.com"); dos.writeInt(30);
			dos.writeUTF("홍길남"); dos.writeChar('F');
			dos.writeUTF("hkn@test.com"); dos.writeInt(25);
			System.out.println("File saved!");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(dos!=null) Closer.close(dos);
			if(dos!=null) Closer.close(fos);
		}
//		File file2 = new File("C:\\Users\\tjoeun\\git\\repository\\JAVA_STUDY\\file\\customer.data");
//		
//		FileInputStream fis = null;
//		
//		DataInputStream dis = null;
//		try {
//			fis= new FileInputStream(file2);
//			dis = new DataInputStream(fis);
//			byte[] bb = new byte [1000];
//			int readCount =dis.read(bb);
//			while(readCount != -1){
//				String data = new String(bb, 0 , readCount);
//				System.out.print(data);
//				readCount = fis.read(bb);
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			Closer.close();
//		}
		
		
		
		
	}

}
