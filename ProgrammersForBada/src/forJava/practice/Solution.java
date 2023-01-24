package forJava.practice;
import java.util.*;


public class Solution {
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		String name = "Leebada";
		StringBuilder sb = new StringBuilder(name);
		sb.replace(0, 2, "Kim"); // 끝 인덱스의 앞까지 교체된다. [0][1]만 교체. 
		sb.toString();
		System.out.println("sb: " + sb);  // Kimebada 로 출력된다.
	}
	
	public static int makeHamburger(int[] ingredients) {
		int answer = 0; 
		
		// stack 자료구조를 생성.
		Stack<Integer> stack = new Stack<>();
		for(int ingre : ingredients) {
			stack.push(ingre);
			if( stack.size() >= 4 
					&& stack.get(stack.size()-1) == 1 
					&& stack.get(stack.size()-2) == 3
					&& stack.get(stack.size()-3) == 2
					&& stack.get(stack.size()-4) == 1
				) {
				stack.pop(); stack.pop(); stack.pop(); stack.pop();
				answer++;
			}
		}
		
		return answer;
	}
	
	
}


