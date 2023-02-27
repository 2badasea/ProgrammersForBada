package forJava.level1;

import java.util.Arrays;

/*
 * 문자열 내림차순으로 배치하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12917
 */
public class ArrangeStringDescending {

	public String solution(String s) {
		String answer = "";
		
		String[] str = s.split("");
		// 
		Arrays.sort(str);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<str.length; i++) {
			sb.append(str[i]);
		}
		
		sb.reverse();
		System.out.println(sb);
		
		return sb.toString();
	}

	public static void main(String[] args) {
		ArrangeStringDescending as = new ArrangeStringDescending();
		System.out.println(as.solution("Zbcdefg"));
	}

}
