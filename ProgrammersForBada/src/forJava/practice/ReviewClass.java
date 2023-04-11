package forJava.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class ReviewClass {

	public static void main(String[] args) {
		ReviewClass rc = new ReviewClass();
		
		System.out.println(rc.contest(32, 4,7));  // 3
	}
	
	// 예상 대진표
	public int contest(int n, int a, int b) {
		int answer = 0;
		
		// 작은수와 큰 수를 정한 다음, while문을 돌린다. 
		int min = a;  
		int max= b;
		if(a > b) max = a; min = b;
		
		// min과 max로만 다루기 시작 이때 n이 의미하는 
		int limit = (int)Math.sqrt(n + 1);
		System.out.println("limit값: " + limit);
		while(++answer < limit) {
			
			if( (min % 2) == 1 && (max-min) == 1) {
				break;
			}else {
				min = cal(min);
				max= cal(max);
				continue;
			}
		}
		return answer;
	}
	
	public int cal(int num) {
		if(num % 2 == 0) {
			num /= 2;
		}else {
			num /=  (num + 1)/2;
		}
		return num;
	}
	
	
	public void makeSquare(int n, int m) {
		// 가로가 n, 세로가 m인 직사각형 형태를 출력
		// 이중 for문이 아니 StringBuilder 클래스 이용
		StringBuilder sb = new StringBuilder();
		for(int i= 0; i<n; i++) {
			sb.append("*");
		}
		for(int j = 0; j<m; j++) {
			System.out.println(sb);
		}
	}
	
	
	
	public int[] carpet(int brown, int yellow) {
		int width = brown + yellow;
		int[] answer = new int[2];
		
		
		// y는 1이 될 수 없다. 
		int x = 0; 
		int y = 2;
		
		
		while(true) {
			x = width/y;
			if(y> 2 && (x * y) == width && ((x-2)*(y-2)) == yellow) {
				break ;
			}
			y++;
		}
		
		answer[0] = x;
		answer[1] = y;
		System.out.println("x값: " + x + ", y값: " + y);
		return answer;
	}
	
	public int makeMin(int[] aAry, int[] bAry) {
		
		// 누적된 값이 최소가 되려면, 가장 큰 수와 가장 큰 수를 곱하면 안 된다. => 최소와 최대를 곱하여 누적시킨다.
		// 우선 정렬을 하는 방식
		Arrays.sort(aAry); 
		Arrays.sort(bAry);
		
		int min = 0; 
		
		for(int i =0; i<aAry.length; i++) {
			min += (aAry[i] * bAry[aAry.length -1 -i]);
		}
		
		return min;
	}
	
	
	public int commonSolution(int[] ary) {
		// 유킬르드 호제법 => 두 수의 최소공배수: 두 수의 곱을 최대공약수로 나눈 것. 
		int answer = 0;
		
		// 최대공약수를 구하는 메서드 정의.
		Arrays.sort(ary);
		answer = ary[0];
		
		for(int i = 1; i<ary.length; i++) {
			answer =  answer * ary[i] / commonCal(answer, ary[i]); 
		}
		return answer;
	}
	
	private int commonCal(int x, int y) {
		int min = Math.min(x, y);
		int max = Math.max(y, x);
		
		
		// 큰수에서 작은수가 0으로 나누어 떨어지면 작은 수가 최대공약수
		// 떨어지지 않으면, 이전의 작은 수를 max, 그리고 나머지를 min으로 두고 반복한다. 0으로 나누어 떨어질 때까지. 
		
		while(true) {
			if(max % min == 0) {
				System.out.println("최대 공약수: " + min);
				return min;
			}else {
				int r = max % min;
				max = min;
				min = r;
			}
		}
	}
	
	private String maxAndMin(String s) {
		// 1. 첫 번째 방식 => 배열의 형식으로 만든다음, Arrays.sort() 메서드 사용하기
		String[] ary = s.split(" ");
		int[] intAry = new int[ary.length];
		int count = 0;
		for(String n : ary) {
			intAry[count++] = Integer.parseInt(n);
		}
		
		Arrays.sort(intAry);
		
		String answer = intAry[0] + " " + intAry[intAry.length-1];
		return answer;
	}
	
	
	private int useStack(String s) {
		// stack을 이용해서 풀어보기
		char[] ary = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		
		for(char c : ary) {
			if(stack.size() > 0) {
				if(stack.peek() == c) {
					stack.pop();
				} else {
					stack.push(c);
				}
			} else {
				stack.push(c);
			}
		}
		
		return ( stack.size() == 0) ? 1 : 0;
		// return stack.isEmpty() ? 1 : 0  표현으로도 가능.
	}
	
	
}