package forJava.practice;

public class ReviewClass {

	public static void main(String[] args) {
		ReviewClass rc = new ReviewClass();
		
		int test2 = 15;  // 23
		System.out.println(rc.solution(test2));
		System.out.println(rc.solution2(test2));
		
		// 2진수 연산을 해주는 식
		System.out.println(rc.solution3(test2));
	}
	
	// 이진수로 변환해주는 함수 만들어보기
	private String solution3(int test) {
		
		String result = "";
		while(test > 0) {
			result = (test % 2) + result; 
			test = test/2;
		}
		return result;
	}
	
	// Integer.toBinayString() 메서드 활용ㄴ
	public int solution(int test) {
		int before = cal(test);
		int after = 0; 
		
		while(true) {
			test++;
			if( before == cal(test)) {
				after = test;
				break;
			}
		}
		return test;
	}
	
	private int cal(int test) {
		String bit = Integer.toBinaryString(test);
		int count = 0;
		for(int i = 0; i<bit.length(); i++) {
			if( bit.charAt(i) == '1') {
				count++;
			}
		}
		return count;
	}
	
	// Integer.bitCount 활용
	private int solution2(int test) {
		int before = Integer.bitCount(test);
		int after = 0;
		while(true) {
			test++;
			if(before == Integer.bitCount(test)) {
				after = before;
				break;
			}
		}
		return test;
	}
	
}