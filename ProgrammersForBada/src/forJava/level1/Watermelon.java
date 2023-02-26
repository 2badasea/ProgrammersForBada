package forJava.level1;

/*
 * 수박수박수박수박수박수? 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12922
 */
public class Watermelon {

	public String solution(int n) {
		String answer = "";

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				answer += "수";
			} else {
				answer += "박";
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Watermelon wm = new Watermelon();
		System.out.println(wm.solution(3));
		System.out.println(wm.solution(4));

	}

}
