package forJava.practice;

public class ReviewClass2 {

	public static void main(String[] args) {
		// 정수 제곱근 판별
		ReviewClass2 rc2 = new ReviewClass2();
		int n1 = 121;
		int n2 = 3;
		
		rc2.solution(n1);
		rc2.solution(n2);
		System.out.println("===========");
		rc2.solution2(n1);
		rc2.solution2(n2);
	}
	
	// Math클래스의  sqrt(), pow() 메서드 활용
	void solution(int n) {
		long answer = 0;
		// Math.sqrt(n) -> 제곱근 
		// 양의 정수 제곱근을 가지면   1을 더한 값의 제곱을 리턴
		// 양의 정수 제곱근을 가지지 않으면 -1을 리턴
		double sqrt = Math.sqrt(n);
		long checkVal = (long) Math.pow(sqrt, 2);
		if(n ==  checkVal) {
			answer =   (long)Math.pow(sqrt + 1, 2);
		}else {
			answer = -1;
		}
		System.out.println("답: " + answer);
	}
	
	void solution2(int n) {
		long answer = 0;
		
		long num = (long)Math.sqrt(n);
		if( (num * num) == n) {
			answer = (num + 1)*(num+1);
		}else {
			answer = -1;
		}
		
		System.out.println("답: " + answer);
	}
}
