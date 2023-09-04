package day12.exception;

public class ThrowsExample2 {

private static String[] greeting = {"안녕", "Hi" , "니하오"}; 
	
	public static void doIt(int index)  {
		try {
			System.out.println(greeting[index]);  
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("잘 못된 인덱스입니다");
			e.printStackTrace();   ///예외가 발생했을때 발생하는 모든 내용을 보여주는 메서드
		}
		
	}
	
	public static void main(String[] args) {
		
		int i = (int)(Math.random()*4);
			doIt(i);
		
			
	}

}

