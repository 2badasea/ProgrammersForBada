package forJava.level2;

/*
 * 숫자의 표현
 * https://school.programmers.co.kr/learn/courses/30/lessons/12924
 */
public class RepresentNumber {

	public int solution(int n) {
		int answer = 1;
		int max = (n / 2) + 1;

		int count = 1;
		while (count <= max) {
			int sum = count;
			for (int i = count + 1; i <= max; i++) {
				sum += i;
				if (sum == n) {
					answer++;
					break;
				} else if (sum > n) {
					break;
				}
			}
			count++;
		}
		return answer;
	}

	public static void main(String[] args) {
		RepresentNumber rn = new RepresentNumber();
		System.out.println(rn.solution(15)); // 4
		System.out.println(rn.solution(1)); // 1
		System.out.println(rn.solution(2)); // 1
		System.out.println(rn.solution(3)); // 2
		System.out.println(rn.solution(4)); // 1
		System.out.println(rn.solution(5)); // 2
	}

}
