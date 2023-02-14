package forJava.level2;

import java.util.Arrays;

/*
 * 최솟값 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12941
 */
public class MakeMinValue {

	public int solution(int[] A, int[] B) {
		int answer = 0;
		
		Arrays.sort(A);
		Arrays.sort(B);
		for(int i = 0; i<A.length; i++) {
			answer += ( A[i] * B[B.length-1-i] );
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] a = {1,4,2};
		int[] b = {5,4,4};
		MakeMinValue mmv = new MakeMinValue();
		System.out.println(mmv.solution(a, b));
	}

}
