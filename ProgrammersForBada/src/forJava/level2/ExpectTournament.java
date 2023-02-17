package forJava.level2;

/*
 * 예상 대진표
 * https://school.programmers.co.kr/learn/courses/30/lessons/12985
 */
public class ExpectTournament {

	public int solution(int n, int a, int b) {
		int answer = 0;
		// n은 제곱근 => n/=2 형태로 반복 => 종료 조건문 n의 값이 1이 되었을 때까지
		int small = a;
		int big = b;
		if (b < small) {
			small = b;
			big = a;
		}

		while (n >= 1) {
			answer++;
			for (int i = 1; i <= n; i++) {
				if (i == small && (small + 1) == big && (small % 2) == 1) {
					return answer;
				}
			}
			small = (small + 1) / 2;
			big = (big + 1) / 2;
			n /= 2;
		}
		;
		return answer;
	}

	public static void main(String[] args) {
		ExpectTournament et = new ExpectTournament();
		System.out.println(et.solution(8, 4, 7)); // 3
	}

}
