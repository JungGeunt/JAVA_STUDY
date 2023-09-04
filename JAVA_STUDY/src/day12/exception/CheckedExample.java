package day12.exception;

// CheckedException의 경우에는 반드시 예외처리해야 함
//올바르게 설계 되어 있더라도 사용자가 잘못된 값을 입력하게 되면 예외가 발생 할 수있음.
//ex) IOException, FileNotFoundException ,SQLException



public class CheckedExample {

	
	public static void main(String[] args) {
		System.out.println("값을 입력받는 프로그램");
		
		byte[] data =new byte[100]; //한번에 100byte씩 읽겠다는 의미

		try {						//입출력 예외 처리 하지않아서 오류	 IOException
		System.in.read(data);   //read 키보드 입력값을 읽어냄 
		}catch (Exception ie) {
			ie.printStackTrace();
		}
		
		System.out.println("입력한 문자열은 : ");
		System.out.println(new String (data).trim()); //trim 문자열 시작과 끝부분에 불필요한 내용을 없앰
	}

}
