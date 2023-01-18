package forJava.level2;

public class Sample {
	public static void main(String[] args) {
		String first = "a1234"; // false
		String second = "1234"; // true
		
		System.out.println("첫 번쨰: " + isNumberString(first));
		System.out.println("두 번째: " + isNumberString(second));
	}
	
	static boolean isNumberString(String s) {
		// 정규식을 활용해본다. 
		if( s.length() == 4 || s.length() == 6) {
			return s.matches("(^[0-9]*$)");
		}
		return false;
	}
}
