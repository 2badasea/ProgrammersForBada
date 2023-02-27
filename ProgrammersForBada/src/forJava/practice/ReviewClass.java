package forJava.practice;

import java.util.Arrays;

public class ReviewClass {

	public int[] solution(int brown, int yellow) {
		int[] answer = new int[2];

		int sum = brown + yellow;
		int x = 0;

		for (int y = 1; y <= sum; y++) {
			x = sum / y;
			if (y > x) {
				continue;
			}

			if ((x - 2) * (y - 2) == yellow) {
				System.out.println("x, y: " + x + ", " + y);
				return answer = new int[] { x, y };
			}
		}
		
		System.out.println("여기 까지 오나?");
		return new int[] { -1 };
	}

	public static void main(String[] args) {
		ReviewClass rc = new ReviewClass();
		System.out.println(rc.solution(10, 2)); // [4,3]
		System.out.println(rc.solution(8, 1)); // [3,3]
		System.out.println(rc.solution(24, 24)); // [8,6]

	}

}
