package forJava.level2;

import java.util.Arrays;

/*
 * N개의 최소공배수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12953
 */
public class LeastCommonMultiple {

	public int solution(int[] arr) {
		int answer = 0;
		// 최소공배수는 두 수의 곱에서 최대공약수로 나눈 것과 같다는 성질
		Arrays.sort(arr);
		answer = arr[0];
		for (int i = 1; i < arr.length; i++) {
			answer = answer * arr[i] / cal(answer, arr[i]);
		}

		return answer;
	}

	int cal(int a, int b) {
		// 두 수의 최대공약수를 리턴
		int x = Math.max(a, b);
		int y = Math.min(a, b);

		while (x % y != 0) {
			int r = x % y;
			x = y;
			y = r;
		}
		return y;
	}

	public static void main(String[] args) {
		LeastCommonMultiple lcm = new LeastCommonMultiple();
		int[] test = { 2, 6, 8, 14 };
		System.out.println(lcm.solution(test));
	}
}
