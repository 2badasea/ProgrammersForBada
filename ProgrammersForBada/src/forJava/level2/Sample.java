package forJava.level2;

import java.util.*;

public class Sample {
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// 자연수 n 입력 -> 낱개로 거꾸로 int[] 배열에 담기. 
		System.out.println("자연수 n 입력");
		int n = scn.nextInt();
		
		int[] answer = solution(n);
		for(int i = 0; i<answer.length; i++) {
			System.out.println("[" + i + "] =" + answer[i]);
		}
	}
	
	private static int[] solution(long n) {
		
		// 12345 입려 가정 -> "54321" -> 개별요소 for문으로 배열에 담기 
		// 자연수 n을 문자열로 바꾸는 방법. 1. String.valueOf(n)    2. Integer.toString(); 3. 문자열 + ""연산
		String s = n + ""; 
		int[] beforeAry = new int[s.length()];
		int cnt = 0;
		while(n>0) {   // 0 5 1234, 1 4  123, 2 3 12,  3 2  1.2 , 4 1 0.12
			beforeAry[cnt++] =  ((int)n%10);
			n = n/10;
		}
		return beforeAry;
	}
	
	
	
}
