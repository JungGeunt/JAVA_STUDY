package quiz;

public class Quiz_13 {

	public static void main(String[] args) {
		//1. 2중 for문을 이용하여 다음을 구현하세요. (아래로 표현)
		//2. 실행 결과에 보이는 모든 숫자는 상위for문과, 하위for문에서 사용한 변수로 출력하여야 합니다
		
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				int gop= i*j;
				System.out.println(i + "x" + j + "=" + gop);
			}
				System.out.println();
		}
	}

}
