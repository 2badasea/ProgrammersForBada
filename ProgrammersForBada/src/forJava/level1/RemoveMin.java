package forJava.level1;

/*
 * 제일 작은 수 제거하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12935
 */
public class RemoveMin {

	public int[] solution(int[] arr) {
		int[] answer = {};

		answer = new int[arr.length-1];
		if (answer.length == 0) {
			return new int[] { -1 };
		}
		
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) min = arr[i];
		}
		
		int cnt = 0;
		for (int i = 0; i < answer.length; i++) {
			if (arr[i] == min) {
				cnt = 1;
			}
			answer[i] = arr[i + cnt];
		}

		return answer;
	}

	public static void main(String[] args) {
		RemoveMin rm = new RemoveMin();
		int[] testAry = { 3, 7, 9, 1, 3, 2, 11 };
		int[] testAry2 = { 10 };
		System.out.println(rm.solution(testAry));
		System.out.println(rm.solution(testAry2));
	}

}
