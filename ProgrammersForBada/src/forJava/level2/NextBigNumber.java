package forJava.level2;

/*
 * 다음 큰 숫자 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12911
 */
public class NextBigNumber {

	public int solution(int n) {
		int answer = 0;

		int before = cal(n);
		int after = 0;

		while (true) {
			n++;
			after = cal(n);
			if (before == after) {
				answer = n;
				break;
			}
		}
		return answer;
	}

	private int cal(int n) {
		String binary = Integer.toBinaryString(n);
		int count = 0;
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '1') {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int cnt = 75;
		int bitCnt = Integer.bitCount(cnt);
		String binary2 = Integer.toBinaryString(cnt);
		System.out.println("이진수 변환: " + binary2);
		System.out.println("정수 이진수의 1의 개수: " + bitCnt);
	}
}
/**
 * 조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같다. 조건 3.
 * n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수.
 */
