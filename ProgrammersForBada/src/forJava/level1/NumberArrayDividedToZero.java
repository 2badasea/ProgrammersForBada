package forJava.level1;

import java.util.Arrays;

/*
 * 나누어 떨어지는 숫자 배열
 * https://school.programmers.co.kr/learn/courses/30/lessons/12910
 */
public class NumberArrayDividedToZero {

	public int[] solution(int[] arr, int divisor) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				// 각 구성요소의 값이 나누어 떨어지면 바로 대상 값을 대입시킨다. ㄴ
				arr[count] = arr[i];
				count++;
			}
		}
		int[] answer = new int[count];
		for (int i = 0; i < count; i++) {
			answer[i] = arr[i];
		}

		if (count == 0) {
			return new int[] { -1 };
		} else {
			Arrays.sort(answer);
			return answer;
		}
	}

	public static void main(String[] args) {
		NumberArrayDividedToZero na = new NumberArrayDividedToZero();
		int[] testAry = { 5, 9, 7, 10 };
		System.out.println(na.solution(testAry, 5)); // [5,10]
	}

}
