package forJava.level1;

// https://school.programmers.co.kr/learn/courses/30/lessons/82612
// 부족한 금액 계산하기
public class CalInsufficientAmount {

	public long solution(int price, int money, int count) {
		// money  - ( price * count)값이 누적
		long sum = 0;
		
		for(int i = 1; i<=count; i++) {
			sum += (price * i);
		}
		
		return (sum > money) ? (sum - money) : 0;
	}



	public static void main(String[] args) {
		CalInsufficientAmount ci = new CalInsufficientAmount();
		System.out.println(ci.solution(3, 20, 4));
	}

}
