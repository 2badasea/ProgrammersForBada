package forJava.level1;

/*
 * 없는 숫자 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/86051
 */
public class AddNotExistingNumber {

	public int solution(int[] numbers) {
		int answer = 0;

		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i;
		}

		for (int s : numbers) {
			answer += s;
		}

		return sum - answer;
	}

	public static void main(String[] args) {
		AddNotExistingNumber an = new AddNotExistingNumber();
		int[] testAry = { 1, 2, 3, 4, 6, 7, 8, 0 };
		int[] testAry2 = { 5, 8, 4, 0, 6, 7, 9 };
		System.out.println(an.solution(testAry)); // 14
		System.out.println(an.solution(testAry2)); // 6
	}

}
