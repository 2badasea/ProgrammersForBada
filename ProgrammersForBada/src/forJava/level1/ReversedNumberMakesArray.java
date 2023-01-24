package forJava.level1;

import java.util.*;

/*
 * 주어진 자연수 n을 뒤집어 배열을 생성  n = 12345 => {5, 4, 3, 2, 1}
 * https://school.programmers.co.kr/learn/courses/30/lessons/12932
 */
public class ReversedNumberMakesArray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// 방법은 크게 2가지. StringBuilder를 사용하는 방법. 
		System.out.println("자연수 n을 입력하세요");
		long n = scn.nextLong();
		int[] result = solution(n);
		System.out.println(result);
		for(int i = 0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	private static int[] solution(long n) {
		// S
		String s = String.valueOf(n);
		StringBuilder sb = new StringBuilder(s);
		sb = sb.reverse();
		
		String[] strAry = sb.toString().split("");
		
		int[] intAry = new int[strAry.length];
		for(int i = 0; i<intAry.length; i++) {
			intAry[i] = Integer.parseInt(strAry[i]); 
		}
		return intAry;
	}
	
}
