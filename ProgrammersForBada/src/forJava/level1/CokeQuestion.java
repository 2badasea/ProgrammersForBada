package forJava.level1;

public class CokeQuestion {

	public long solution(int a, int b, int n) {
		long answer = 0;
		int temp = 0;
		while(n >= a) {
			answer +=  (n/a)*b;
			temp =  (n%a);
			n = (n/a)*b +temp;
		}
		return answer;
	}

	public static void main(String[] args) {
		CokeQuestion cq = new CokeQuestion();
		System.out.println(cq.solution(2, 1, 20)); // 19
		System.out.println(cq.solution(3, 1, 20));  // 9
	}

}
