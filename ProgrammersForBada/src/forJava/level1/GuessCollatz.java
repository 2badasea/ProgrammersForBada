package forJava.level1;

/*
 * 콜라츠 추측
 * https://school.programmers.co.kr/learn/courses/30/lessons/12943
 */
public class GuessCollatz {

	public int solution(int num) {
		long n = num;
		int answer = 0;
		
		if(n == 1) return 0;
		
		for(answer = 1; answer<=500; answer++) {
			if(n % 2 == 0 && n != 0) {
				n =  n/2;
			} else {
				n = (n * 3) + 1;
			}
			
			if(n == 1) {
				return answer;
			}
		}
		
		if(n != 1) {
			answer = -1;
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		GuessCollatz gc = new GuessCollatz();
		System.out.println(gc.solution(6));
		System.out.println(gc.solution(16));
		System.out.println(gc.solution(626331));
	}
}
