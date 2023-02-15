package forJava.level2;

/*
 * 카펫
 * https://school.programmers.co.kr/learn/courses/30/lessons/42842
 */
public class Carpet {

	public int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
		int sum = brown + yellow;
		int x = 0;

		for (int y = 1; y <= sum; y++) {
			x = sum / y;
			// 세로 길이가 x보다 크면 continue문으로 다음 루프로 바로 이동.
			if (y > x) {
				continue;
			}
			if ((x - 2) * (y - 2) == yellow) {

				answer[0] = x;
				answer[1] = y;
				break;
			}
		}
		System.out.println("x: " + answer[0] + ", y: " + answer[1]);
		return answer;
	}

	public static void main(String[] args) {
		Carpet carpet = new Carpet();
		System.out.println(carpet.solution(24, 24));
		System.out.println(carpet.solution(10, 2));
		System.out.println(carpet.solution(8, 1));
	}

}
