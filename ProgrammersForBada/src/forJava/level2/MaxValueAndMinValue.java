package forJava.level2;

import java.util.Arrays;

/*
 * 최댓값과 최솟값
 * https://school.programmers.co.kr/learn/courses/30/lessons/12939
 * 
 */
public class MaxValueAndMinValue {

	public String solution(String s) {
		
		String[] strAry = s.split(" ");
		int[] intAry = new int[strAry.length];
		int i = 0;
		for(String str : strAry) {
			intAry[i] = Integer.parseInt(str);
			i++;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(Arrays.stream(intAry).min().getAsInt());
		sb.append(" ");
		sb.append(Arrays.stream(intAry).max().getAsInt());
		
		return sb.toString();
	}

	public static void main(String[] args) {
		MaxValueAndMinValue sol = new MaxValueAndMinValue();
		System.out.println(sol.solution("1 2 3 4"));
		System.out.println(sol.solution("-1 -2 -3 -4"));
		System.out.println(sol.solution("-1 -1"));
	}
}
