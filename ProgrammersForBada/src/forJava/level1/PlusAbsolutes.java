package forJava.level1;

/*
 * 음양 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/76501
 */
public class PlusAbsolutes {

	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		int bool = 0;
		for (int i = 0; i < absolutes.length; i++) {
			bool = (signs[i] == true) ? 1 : -1;
			answer += (bool * absolutes[i]);
		}

		return answer;
	}

	public static void main(String[] args) {
		PlusAbsolutes pa = new PlusAbsolutes();
		int[] intAry = { 4, 7, 12 };
		boolean[] boolAry = { true, false, true };
		System.out.println(pa.solution(intAry, boolAry)); // 9
	}

}
