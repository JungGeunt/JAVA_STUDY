package day12.exception;

import java.lang.reflect.Member;



//멤버 클래스 (DATA를  저장하는 용도의 객체를 생성을 위한 클래스)
class member{
	String name;
	String phone;
	String addString;
	
	
	public member(String name, String phone, String addString) {
		super();
		this.name = name;
		this.phone = phone;
		this.addString = addString;
	}
	
}


//기능은 멤버 관리 클래스 
public class UserDefineException {

	public static void main(String[] args) {
		UserDefineException memberManager = new UserDefineException();
		try {
			memberManager.insert(new member("홍길동", "010-1223-3847" ," 서울시 마포구" ));
		} catch (DuplicatKeyException e) {
			System.out.println(e.toString());
		}
		
	}
	
	public void insert(member member) throws DuplicatKeyException{
		System.out.println("고객 정보를 저장 합니다");
		System.out.println(member.name = " 님의 정보");
		//디비에 홍길동 /010 -1223 -3827 정보가 있다고 간주
		if( "홍길동".equals(member.name)&&"010-1223-3847".equals(member.phone)){
			//이경우는 DB에 이미 정보가 있는 경우로 간주
			//예외를 발생시켜 insert 메서드 호출 한 곳으로 데이터가
			//중복됨을 알려줘야함
			
		//예외 강제로 발생
		throw new DuplicatKeyException("데이터가 중복됩니다."); 	
		}else {
			System.out.println("데이터베이스에 저장되었습니다.");
		}
		
	}
	

}

//사용자 정의 예외

class DuplicatKeyException extends Exception{
	public DuplicatKeyException(String message) {
		super(message);
	}
}



