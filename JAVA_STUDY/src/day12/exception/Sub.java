package day12.exception;

import java.io.IOException;
import java.sql.SQLException;

public class Sub extends Super {

	
	//메서드 재정의 시에
	//부모가 throws 하지 않은 예외에 대해서 처리 할 수없음  
	@Override
	public void doIt() throws IOException { 
		System.out.println("Sub.doIt");
		try {
			super.doIt();
		} catch (IOException e) {     
			 throw new IOException(e.getMessage()); //부모가 가지고 있지 않은 예외를 처리 받을 수 없음. 
		}
		
	}
}
