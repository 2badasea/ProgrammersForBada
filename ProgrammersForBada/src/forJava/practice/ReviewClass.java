package forJava.practice;

import java.util.Stack;

public class ReviewClass {
	/*
	 *	프로그래머스 - 햄버거 만들기
	 *	빵, 야채, 고기, 빵 순으로 재료가 조합이 될 때마다 햄버거가 만들어진다. ( 1, 2, 3, 1) 
	 *	정수 배열 ingredients가 주어졌을 때, 포장하는 햄버거의 총 갯수를 구하기. 
	 */
	public static void main(String[] args) {
		int[] ingredients = { 1,2,3,1,1,1,2,3,1,4,3,1,2,3,1};
		int sum = makeBurgers(ingredients);
		System.out.println("햄버거 총 개수: " + sum);
	}	
	
	static int makeBurgers(int[] ingredients) {
		int burgers = 0;
		
		// tryBurger 메서드 활용해서 풀어볼 것. 
		Stack<Integer> stack = new Stack<>();
		
		// for문 반복으로 stack에 재료 투하
		for(int in : ingredients) {
			stack.push(in);
			if(in == 1 && tryBurger(stack)) {
				burgers++;
			}
		}
		return burgers;
	}
	
	static boolean tryBurger(Stack<Integer> stack) {
		// stack의 사이즈가 4미만이면 리턴
		if(stack.size() < 4) {
			return false;
		}
		
		// 임시 stack, 비교 배열 생성
		Stack<Integer> tempStack = new Stack<Integer>();
		Integer[] ary = {1,3,2,1};
		int thigIng = 0;
		for(int s : ary) {
			thigIng = stack.pop();
			if( s == thigIng) {
				tempStack.push(thigIng);
			} else {
				stack.push(thigIng);
				break;
			}
		}
		
		if(tempStack.size() == 4) {
			return true;
		} else {
			while(!tempStack.isEmpty()) {
				stack.push(tempStack.pop()); 
			}
			return false;
		}
	}
}
