package pack.lessons;

 public class Lesson2Variables {
	 
    static int i = 100;
	 
	public static void main(String[] args){
		System.out.println("Andrey Fedosenko. Homework. Lesson2.");
		
		int i = 13;
		float fl = 0.13f;
		String str = "It`s my String";
		
		// Task #1
		System.out.println("- Task #1");
		System.out.println("Int i = "+ i);
		System.out.println("Float fl = " + fl);
		System.out.println("String str = " + str); 
		
		// Task #2-0
		//System.out.println("- Task #2-0");  // Commented due task 2-1
		//printStars();
		//printStars();
		//printStars();
		//printStars();
		//printStars();
	
		// Task #2-1
		System.out.println("- Task #2");
		for (i = 1; i <= 5; i++) {
			printStars();
		}
		
		// Task #3
		System.out.println("- Task #3");
		int year = 2001;
		int lastyear = 2016;
		int buf = 0;
		while (year <= lastyear) {
			buf = isLeapYear(year);
			if(0 == buf) System.out.println(year + " - is Wrong year!");
			else if (1 == buf) System.out.println(year + " - is Leap year!");
			else System.out.println(year + " - is not Leap year!");
			year++;
		}
		
		// Task #4
		System.out.println("- Task #4");
		i = 1;
		do {
			System.out.println("It seems that I'm here forever #" + i);
			if (5 == i) break;
			i++;
		} while (true);
		
		// Task #5 (Optional)
		String bin = "1100111001";
		System.out.println("- Task #5 (Optional)");
		int ans = convert(bin);
		if (ans >= 0 ) System.out.println("Binary " + bin + " equals Decimal " + ans);
	
	}
	
	public static void printStars() {
		System.out.println("*****");
	}
	
	public static int isLeapYear(int year) {
		if (0 >= year) {    // Foolproof
			return 0;
		} else if (((0 == year % 4) && (0 != year % 100)) || (0 == year % 400)) {    // Leap Year
			return 1;
		} else return 2;                                                             // non-Leap Year 
	}	

	public static int convert(String binary) {
		// binary = binary.trim(); // Trim spaces. Не учили еще.
		char tmp = ' ';
		int len = binary.length();
		int sum = 0;
		int stepen = 1;
		
		for (int j = 0; j <= len-1; j++) {
			tmp = binary.charAt(len-1-j);
			if ((tmp != '1') && (tmp != '0')) {       // Foolproof. Защита.
				System.out.println("It is not binary, Dude! - " + " your binary = " + binary);
				return -1;
			} else {
			
			// sum = sum + tmp * (2 ^ j);  // Ohh.. I was C & C++...
			if ('1' == tmp) {
					stepen = 1;
					for (int k = 0; k < j; k++) {  // В JAVA нет оператора возведения в степень??? Math.pow? Но мы не учили еще. Заменяем циклом.
						stepen = stepen * 2;
					}
					sum = sum + stepen;
					 //System.out.println("binary = " + binary + " j = " + j + " tmp = " + tmp + " stepen = " + stepen); // debug 
			} // end of if ()
			} // end of else 
		} // end od for()
		return sum;	
	} // end of convert
	
} // end of class Lesson2Variables

