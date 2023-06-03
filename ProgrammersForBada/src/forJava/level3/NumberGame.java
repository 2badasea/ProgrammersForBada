package forJava.level3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class NumberGame {

	public static void main(String[] args) {
		NumberGame ng = new NumberGame();
		
		int[] testA = {5,1,3,7}; int[] testB = {2,2,6,8};
		int[] test2A = {2,2,2,2}; int[] test2B = {1,1,1,1};
		System.out.println("첫 번째 방식 :"  + ng.solution(testA, testB));
		System.out.println("첫 번째 방식 :"+ ng.solution(test2A, test2B));
		System.out.println("===============");
		System.out.println("두 번째 방식: " + ng.solution2(testA, testB));
		System.out.println("두 번째 방식: " + ng.solution2(test2A, test2B));
		System.out.println("==============");
		System.out.println("세 번째 방식: " + ng.solution3(testA, testB));
		System.out.println("세 번째 방식: " + ng.solution3(test2A, test2B));
	}
	
	// 우선순위 큐를 활용하는 방법
	int solution(int[] A, int[] B) {
		int score = 0;
		
		PriorityQueue<Integer> aQ = new PriorityQueue<Integer>(Comparator.reverseOrder());
		PriorityQueue<Integer> bQ = new PriorityQueue<Integer>(Comparator.reverseOrder());
		
		for(int i = 0; i<A.length; i++) {
			aQ.offer(A[i]);
			bQ.offer(B[i]);
		}
		
		while(!aQ.isEmpty()) {
			int a = aQ.poll();
			int b = bQ.peek(); 
			
			if(a < b) {
				score++;
				bQ.poll();
			}
		}
		return score;
	}
	
	// 오름차순 정렬 후 비교
	int solution2(int[] A, int[] B) {
		int score = 0;
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		for(int i = A.length -1, j = B.length -1; i>=0; i--) {
			// 큰 수부터 비교 => b가 컸으면 점수를 올리고, b가 같거나 작았다면, index값 그대로 해서 다음 a값과 비교.
			// 작은 수부터 비교 => a는 지속적으로 커지는 데 반해 b는 낮은 숫자부터 정렬되어 있으므로 다음 index로 못 넘어감
			if(A[i] < B[j]) {
				score++;
				j--;
			}
		}
		return score;
	}
	
	// stack자료구조 활용방법 위 2번째 방법과 비슷한 원리
	int solution3(int[] A, int [] B) {
		int score = 0;
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		Stack<Integer> stackA = new Stack<>();
		Stack<Integer> stackB = new Stack<>();
		
		// stack에 큰 숫자부터 삽입
		for(int i = A.length -1; i>=0; i--) {
			stackA.push(A[i]);
			stackB.push(B[i]);
		}
		
		while(stackB.size() != 0) {
			if( stackA.peek() < stackB.peek()) {
				score++;
				stackB.pop();
				stackA.pop();
			}else {
				stackB.pop();
			}
		}
		return score;
	}
}
