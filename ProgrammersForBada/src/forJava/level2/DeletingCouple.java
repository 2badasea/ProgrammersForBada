package forJava.level2;
import java.util.*;

/*
 * 짝지어 제거하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12973
 */
public class DeletingCouple {

	public int solution(String s) {
		int answer = -1;
		
		Stack<String> stack = new Stack<>();
		String[] ary = s.split("");
		
		for(int i = 0; i<ary.length; i++) {
			stack.push(ary[i]);
			if(stack.size()>1) {
				if(stack.get(stack.size()-1).equals(stack.get(stack.size()-2))) {
					stack.pop(); stack.pop();
				}
			}
		}
		
		answer = (stack.size()==0) ? 1 : 0;

		return answer;
	}
	
	
	public static void main(String[] args) {
		DeletingCouple dc = new DeletingCouple();
		System.out.println(dc.solution("baabaa")); 
	}
}
