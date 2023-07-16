package forJava.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FeatureDevelopment {

	public static void main(String[] args) {
		FeatureDevelopment fd = new FeatureDevelopment();

		int[] test1Pro = { 93, 30, 55 };
		int[] test1Spe = { 1, 30, 5 };
		System.out.println(fd.solution(test1Pro, test1Spe));

		int[] test2Pro = { 95, 90, 99, 99, 80, 99 };
		int[] test2Spe = { 1, 1, 1, 1, 1, 1 };
		System.out.println(fd.solution(test2Pro, test2Spe));
	}

	public int[] solution(int[] progresses, int[] speeds) {
		Queue<Integer> q = new LinkedList<>();

		for (int i = 0; i < speeds.length; i++) {
			q.offer((100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] == 0 ? 0 : 1));
		}

		int count = 1; // 현재 카운트를 위해 1로 초기화
		int now = q.poll(); // 첫 번째 항목을 추출
		List<Integer> list = new ArrayList<>();

		while (!q.isEmpty()) {
			int next = q.poll();
			if (now >= next) { // 현재 남은 작업일 수가 더 많은 경우
				count++;
			} else {
				list.add(count);
				now = next;
				count = 1;
			}
		}
		list.add(count);
		int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
		return answer;
	}
}