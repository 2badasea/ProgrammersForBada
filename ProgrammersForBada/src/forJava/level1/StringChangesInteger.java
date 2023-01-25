package forJava.level1;

/*
 * 문자열을 정수로 바꾸기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12925
 */
public class StringChangesInteger {

	public static void main(String[] args) {

		String s = "-1234";
		StringChangesInteger str = new StringChangesInteger();
		int result = str.solution(s);
		System.out.println("result : " + result);
	}

	private int solution(String s) {
		// 아스키 코드를 감안해서 푼다.
		boolean Sign = true;
		int result = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '-') {
				Sign = false;
			} else if (ch != '+') {
				result = result * 10 + (ch - '0');
			}
		}
		return (Sign ? 1 : -1 )* result;
	}
}
