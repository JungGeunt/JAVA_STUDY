package day17.filterStream.serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import util.Closer;

public class WriteCustomerExample {

	public static void main(String[] args) {
	 Customer cust1 = new Customer("홍길동", 'M', "hkd@test.com", 30);
	 Customer cust2 = new Customer("홍길남", 'F', "hkn@test.com", 25);
	 
	 File file = new File("C:\\Users\\tjoeun\\git\\repository\\JAVA_STUDY\\file\\customer.ser");
	 FileOutputStream fos = null; //바이트로 저장 되어야 되기 때문에
	 ObjectOutputStream oos = null;
	 
	 try {
		 //객체 생성
		 fos = new FileOutputStream(file);
		 oos = new ObjectOutputStream(fos);
		 
		 oos.writeObject(cust1);
		 oos.writeObject(cust2);
		 
		 ArrayList<Customer> list = new ArrayList<>();
		 list.add(cust1);
		 list.add(cust2);
		 oos.writeObject(list);
		 System.out.println("Customer 데이터가 저장되었습니다.");
		 //엔티티 객체를 직접 파일 시스템에 저장 할 수 있다. 컬렉션 객체에 저장되어 있는 경우
		 //컬렉션 객체를 직렬화 할 수있다.
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}finally {
		if(oos!=null)Closer.close(oos);
		if(oos!=null)Closer.close(fos);
	}

	}

}
