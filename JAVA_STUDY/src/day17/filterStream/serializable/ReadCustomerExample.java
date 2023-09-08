package day17.filterStream.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import util.Closer;

public class ReadCustomerExample {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\tjoeun\\git\\repository\\JAVA_STUDY\\file\\customer.ser");
		
		FileInputStream fis =null;
		ObjectInputStream ois =null;
		
		
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			Customer  cus1 = (Customer)ois.readObject();
			Customer  cus2 = (Customer)ois.readObject();
			@SuppressWarnings("unchecked")
			ArrayList<Customer> list =(ArrayList<Customer>)ois.readObject();
			System.out.println(cus1);
			System.out.println(cus2);
			System.out.println(list);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재 하지 않습니다.");
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}catch (ClassNotFoundException e) { // 해당객체의 대한 정보가 없기때문에 생길 수 있는 오류
		System.out.println(e.getMessage());
		}
		finally {
			if(ois!=null)Closer.close(ois);
			if(fis!=null)Closer.close(fis);
		}
		

	}

}
