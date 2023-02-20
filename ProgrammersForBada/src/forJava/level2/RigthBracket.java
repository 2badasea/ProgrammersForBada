package forJava.level2;

import java.util.Stack;

/*
 * 올바른 괄호 (정답률 75% ) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12909
 */
public class RigthBracket {

	boolean solution(String s) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push('(');
			} else {
				if (stack.isEmpty()) {
					return false;
				} else {
					stack.pop();
				}
			}
		}
		return stack.isEmpty() ? true : false;
	}

	public static void main(String[] args) {
		RigthBracket rb = new RigthBracket();
		System.out.println(rb.solution("()()")); // true
		System.out.println(rb.solution("(()(")); // false
		System.out.println(rb.solution("(())()")); // true

	}

}
