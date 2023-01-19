package forJava.level2;

import java.util.*;

/*
 * 피보나치 수 완성
 * https://school.programmers.co.kr/learn/courses/30/lessons/12945
 */
public class Fibonacci {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * 왜 문제에서 1234567을 나누게 했는지. 
		 */
	}

	public int solution(int n) {
		int answer = 0;

		int[] ary = new int[n + 1];
		ary[0] = 0;
		ary[1] = 1;
		for (int i = 2; i < n + 1; i++) {
			ary[i] = (ary[i - 2] + ary[i - 1]) % 1234567;

		}

		answer = ary[n];

		return answer;
	}
}
