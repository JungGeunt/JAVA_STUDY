package day17.filterStream;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

import util.Closer;

public class DataReadApplication {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\tjoeun\\git\\repository\\JAVA_STUDY\\file\\customer.data");
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			String name = null;
			name =dis.readUTF();
			while(name!= null) {
				System.out.println(name);
				System.out.println(dis.readChar());
				System.out.println(dis.readUTF());
				System.out.println(dis.readInt());
				name=dis.readUTF();
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(fis!=null) Closer.close(fis);
			if(dis!=null) Closer.close(dis);
		}

	}

}
