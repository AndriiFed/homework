package pack;

 public class FirstProgramm {
	 
    static int i = 100;
	 
	public static void main(String[] args){
		
		int i = 10;
		//foo();
		//System.out.println("Lesson #2");
		//System.out.println("Hello World!");
		//System.out.println("i = " + i);
		//age;
		// System.out.println("i = " + i);
		
		short shortVar = 0; // 2 bytes
		int integerVar = 0; // 4 byte
		long longValue = 0l; // bytes
		
		byte byteVar = 0; // 1 byte
		
		float floatVar = 0.0f; // 4 bytes  РАЗОБРАТЬСЯ КАК В ДВОИЧНОЙ СИСТЕМЕ ПРЕДСТАВЛЕНО в вики!!!
		double doubleVar = 0.0d; // 8 bytes
		
		// IEEE754
		
		char charVar = '0'; // 2 bytes, UNICODE, UTF-8, u+0023, u/0023
		
		boolean booleanVar = false; // ?
		
		
		Object obj = null;
		String str = "I`m a string"; // object too
		
		String[] arr = {"First", "Second"};
		String[] str2 = new String("Hello");		
		
		
		while (i >= 1 ) {
			System.out.println(isEven(i) + " i = " + i);
			i--;
		}
		
		/*
		for (int j = 10; j > 0; j--) {
			isEven(j);			
		}
		*/
		
		//i = 9;
		//isEven(i);
		
	}
	
	public static boolean isEven(int i) {
		/*
		if (i % 2 == 0) {
//			System.out.println("even, i = "+i);
			return true;
		} else {
//			System.out.println("odd, i = "+i);
			return false;
		}
		//System.out.println("i = " + i);
		*/
		return (i % 2 == 0);
	}
}


