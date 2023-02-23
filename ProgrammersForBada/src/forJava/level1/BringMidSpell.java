package forJava.level1;

/*
 * 가운데 글자 가져오기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12903
 */
public class BringMidSpell {

	public String solution(String s) {
		String answer = "";
		int length = s.length();
		
		int index = (length % 2 == 0) ? (length/2) - 1 : (length / 2);

		if (length  % 2 == 0) {
			answer = s.substring(index, index + 2);
		} else {
			answer = s.substring(index, index + 1);
		}
		return answer;
	}

	public static void main(String[] args) {
		BringMidSpell bm = new BringMidSpell();
		String test1 = "abcde";
		String test2 = "qwer";
		System.out.println(bm.solution(test1)); // c
		System.out.println(bm.solution(test2)); // we
	}

}
