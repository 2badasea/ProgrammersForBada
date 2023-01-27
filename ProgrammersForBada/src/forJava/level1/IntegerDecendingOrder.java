package forJava.level1;

/*
 * 정수 내림차순으로 배치하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12933
 */
public class IntegerDecendingOrder {

	public long solution(long n) {
		String answer = "";

		String str = Long.toString(n);
		int[] ary = new int[str.length()];

		for (int i = 0; i < ary.length; i++) {
			String s = str.substring(i, i + 1);
			ary[i] = Integer.parseInt(s);
		}

		int temp = 0;
		for (int i = 0; i < ary.length - 1; i++) {
			for (int j = 0; j < ary.length - 1; j++) {
				if (ary[j] < ary[j + 1]) {
					temp = ary[j];
					ary[j] = ary[j + 1];
					ary[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < ary.length; i++) {
			answer += Integer.toString(ary[i]);
		}

		return Long.parseLong(answer);
	}

	public static void main(String[] args) {

		IntegerDecendingOrder ido = new IntegerDecendingOrder();
		System.out.println(ido.solution(118372));
	}
}
