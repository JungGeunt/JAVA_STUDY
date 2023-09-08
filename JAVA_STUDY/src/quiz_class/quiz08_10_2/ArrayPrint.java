package quiz_class.quiz08_10_2;

public class ArrayPrint {
	
	protected ArrayPrint() {
		
	}
	
	
	
	 protected static void PrintArray(String[] arr) {
		for(int i = 0; i <arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
	
	 protected static void PrintArray(int[] arr) {
		for(int i = 0; i <arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
	
	 protected  static void PrintArray(char[] arr) {
		for(int i = 0; i <arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}

}
