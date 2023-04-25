package forJava.practice;

import java.util.Arrays;
import java.util.Stack;

public class ReviewClass {
	static String name = null;
	
	public static void main(String[] args) {
		Member bada = new Member("이바다");
		Member seulbi = new Member("이슬비");
		
		bada.today();
		seulbi.today();
	}

	public int makeMin(int[] aAry, int[] bAry) {

		// 누적된 값이 최소가 되려면, 가장 큰 수와 가장 큰 수를 곱하면 안 된다. => 최소와 최대를 곱하여 누적시킨다.
		// 우선 정렬을 하는 방식
		Arrays.sort(aAry);
		Arrays.sort(bAry);

		int min = 0;

		for (int i = 0; i < aAry.length; i++) {
			min += (aAry[i] * bAry[aAry.length - 1 - i]);
		}

		return min;
	}

	public int commonSolution(int[] ary) {
		// 유킬르드 호제법 => 두 수의 최소공배수: 두 수의 곱을 최대공약수로 나눈 것.
		int answer = 0;

		// 최대공약수를 구하는 메서드 정의.
		Arrays.sort(ary);
		answer = ary[0];

		for (int i = 1; i < ary.length; i++) {
			answer = answer * ary[i] / commonCal(answer, ary[i]);
		}
		return answer; 
	}

	private int commonCal(int x, int y) {
		int min = Math.min(x, y);
		int max = Math.max(y, x);

		// 큰수에서 작은수가 0으로 나누어 떨어지면 작은 수가 최대공약수
		// 떨어지지 않으면, 이전의 작은 수를 max, 그리고 나머지를 min으로 두고 반복한다. 0으로 나누어 떨어질 때까지.

		while (true) {
			if (max % min == 0) {
				System.out.println("최대 공약수: " + min);
				return min;
			} else {
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
		for (String n : ary) {
			intAry[count++] = Integer.parseInt(n);
		}

		Arrays.sort(intAry);

		String answer = intAry[0] + " " + intAry[intAry.length - 1];
		return answer;
	}

	private int useStack(String s) {
		// stack을 이용해서 풀어보기
		char[] ary = s.toCharArray();
		Stack<Character> stack = new Stack<>();

		for (char c : ary) {
			if (stack.size() > 0) {
				if (stack.peek() == c) {
					stack.pop();
				} else {
					stack.push(c);
				}
			} else {
				stack.push(c);
			}
		}

		return (stack.size() == 0) ? 1 : 0;
		// return stack.isEmpty() ? 1 : 0 표현으로도 가능.
	}
}

class Member{
	
	String name;  // 인스턴스 변수. static을 붙이면 인스턴스가 생길 때마다 필드값이 변경
	
	// 인스턴스 변수. 생성자를 통해 주입받지 않는 방식. 
	static int[] lotto = new int[6];
	
	{
		for(int i = 0; i<6; i++) {
			lotto[i] = (int)(Math.random() * 45 -1 + 1) + 1;
		}
	}
	Member(String name) {
		this.name = name; 
		
		System.out.println("이름: " + this.name);
		
		for(int i =0; i<lotto.length; i++) {
			System.out.println("lotto[" + (i+1) + "]=" + lotto[i] );
		}
	}
	
	void today() {
		System.out.println(this.name + " 화이팅");
	}
}