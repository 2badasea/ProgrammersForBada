package forJava.level2;

/*
 * JadenCase 문자열 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12951
 */
public class JadenCaseString {

	public String solution(String s) {
		String answer = "";
		String[] ary = s.toLowerCase().split(" ");

		for (int i = 0; i < ary.length; i++) {
			String str = ary[i];
			if (str.length() == 0) {
				answer += " ";
			} else {
				if (str.length() == 1) {
					answer += str.substring(0, 1).toUpperCase();
				} else if (str.length() > 1) {
					answer += str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
				}
				answer += " ";
			}
		}
		// 입력 받은 문자열의 맨 마지막이 " " 라면 바로 answer 반환
		if (s.substring(s.length() - 1, s.length()).equals(" ")) {
			return answer;
		}

		return answer.substring(0, answer.length() - 1);
	}

	public static void main(String[] args) {
		JadenCaseString jcs = new JadenCaseString();
		System.out.println(jcs.solution(" b   a   ddf   047   das  sdfe  rr aew"));
	}

}
