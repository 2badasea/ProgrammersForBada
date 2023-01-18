package forJava.level1;
import java.util.Scanner;
import java.util.Stack;

/*
 * 햄버거 만들기 
 * https://school.programmers.co.kr/learn/courses/30/lessons/133502
 */
public class makeHamburger {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int retry;
		do {
			System.out.println("생성할 재료의 개수");
			int items = scn.nextInt(); 
			// 정수 배열 생성. 
			int[] ingredient = new int[items];
			for(int i = 0; i<ingredient.length; i++) {
				System.out.print("ingredient[" + (i+1) + "] = ");
				ingredient[i] = scn.nextInt(); 
				System.out.println();
			}
			int result = makeHamburger(ingredient);
			System.out.println("생성한 햄버거의 갯수: " + result);
			
			System.out.println("다시 생성? 1. 네   0. 아니오");
			retry = scn.nextInt();
		}while(retry != 0);
		scn.close();
	}
	
	static int makeHamburger(int[] ingredient) {
		String ingre = "";
		System.out.println("사이즈: " + ingredient.length);
		for(int i = 0; i<ingredient.length; i++) {
			ingre += String.valueOf(ingredient[i]);
		}
		System.out.println("현재 구성: " + ingre);
		int sum = 0; 
		System.out.println("에러?");
		Stack<Integer> stack = new Stack<>();
		// 향상된 for문으로도 가능 => ex) for(int in : ingredient) stack.push(in); 
		for(int i = 0; i<ingredient.length; i++) {
			stack.push(ingredient[i]);
			if(stack.size() > 3 
					&& stack.get(stack.size()-1) == 1
					&& stack.get(stack.size()-2) == 3
					&& stack.get(stack.size()-3) == 2
					&& stack.get(stack.size()-4) == 1) {
				stack.pop(); stack.pop(); stack.pop(); stack.pop();
				sum ++;
			}
				
		}
		System.out.println("최종 스택 사이즈: " + stack.size());
		return sum;
	}
}

// 햄버거 재료가 조리된 순서대로 넘어온다
// 순서에 맞게 쌓인 햄버거를 옮겨서 포장 ( 빵-야채-고기-빵)
// 빵1 야채2, 고기3
// 재료의 정보를 나타내난 정수 배열 ingredient => 상수가 포장하는 햄버거의 개수를 return