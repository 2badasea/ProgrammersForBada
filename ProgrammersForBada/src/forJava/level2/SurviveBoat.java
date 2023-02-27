package forJava.level2;

import java.util.Arrays;

/*
 * 구명보트
 * https://school.programmers.co.kr/learn/courses/30/lessons/42885
 */
public class SurviveBoat {

	public int solution(int[] people, int limit) {
		int answer = 0;

		Arrays.sort(people);

		int compareIdx = people.length - 1;
		int idx = 0;
		for (int i = compareIdx; i >= idx; i--) {
			if (people[idx] + people[i] <= limit) {
				answer++;
				idx++;
			} else {
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		SurviveBoat sb = new SurviveBoat();
		int[] testAry = { 70, 50, 80, 50 };
		System.out.println(sb.solution(testAry, 100)); // 3
		int[] testAry2 = { 70, 80, 50 };
		System.out.println(sb.solution(testAry2, 100)); // 3
		int[] testAry3 = { 30, 40, 70, 70, 120, 130, 140 };
		System.out.println(sb.solution(testAry3, 150)); // 5
	}

}
