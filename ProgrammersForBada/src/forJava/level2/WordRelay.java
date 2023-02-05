package forJava.level2;

/*
 * 영어 끝말잇기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12981
 */
public class WordRelay {

	public int[] solution(int n, String[] words) {
		int[] answer = { 0, 0 };

		// hash구조로 풀어야 하나? 끝말잇기 규칙을 어겼거나, 동일한 단어를 반복하게 되는 경우.
		StringBuilder sb = new StringBuilder();
		sb.append(words[0]);
		int count = 1;
		for (int i = 1; i < words.length; i++) {
			count++;
			if (isRelayCheck(words[i], words[i - 1]) && sb.indexOf(words[i]) == -1) {
				sb.append(words[i]);
			} else {
				int who = count % n == 0 ? n : count % n;
				int order = (count/n) + 1;
        		answer[0] = who;
                answer[1] = order;
				break;
			}
		}
		return answer;
	}

	boolean isRelayCheck(String nextStr, String preStr) {
		boolean b = true;
		if (preStr.charAt(preStr.length() - 1) != nextStr.charAt(0)) {
			b = false;
		}
		return b;
	}

	public static void main(String[] args) {
		WordRelay wr = new WordRelay();
		String[] testAry = { "hello", "one", "even", "never", "now", "world", "draw" };
//		int[] result = wr.solution(2, testAry);
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(i + ": " + result[i]); // 2,3ㄴ
//		}
		
		double b = (double)17/4;
		System.out.println( (int) Math.ceil(b));

	}

}
