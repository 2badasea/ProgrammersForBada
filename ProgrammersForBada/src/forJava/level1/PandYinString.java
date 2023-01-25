package forJava.level1;

import java.util.*;

/*
 * 문자열 내 p와 y의 개수.
 * https://school.programmers.co.kr/learn/courses/30/lessons/12916
 */
public class PandYinString {

	public static void main(String[] args) {
		
	}
	
    boolean solution(String s) {
		// 소문자로 변경.
		s = s.toUpperCase();
		return s.chars().filter(e -> 'P' == e).count() == s.chars().filter(e -> 'Y' == e).count();
	}
}
