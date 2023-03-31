package forJava.practice;

import java.util.Scanner;

public class ReviewClass {

	public static void main(String[] args) {
		// 어떤 정수 n에 대하여 n이하의 소수를 모두 출력
		// 1. 1을 제외하고, 소수는 소수로도 나누어떨어지지 않는다는 사실을 활용. 
		// 2. 소수만 담은 배열 생성 => 이 배열의 요소들로만 나누어 떨어지는지 판단. 
		Scanner scn = new Scanner(System.in);
		System.out.println("정수 n 입력");
		int n = scn.nextInt();
		int[] tempAry = new int[n];
		
		tempAry[0] = 2;
		tempAry[1] = 3;
		
		int cnt = 2;
		for(int i = 4; i<=n; i++) {
			if(check(i, tempAry, cnt)) {
				continue;
			}else {
				tempAry[cnt++] = i;
			}
		}
		
		System.out.println("정답");
		for(int i = 0; i<cnt; i++) {
			System.out.println(tempAry[i]);
		}
	
	}
	
	static boolean check(int i, int[] tempAry, int cnt) {
		System.out.println("i: " + i );
		for(int j =0; j<cnt; j++) {
			if( i % tempAry[j] == 0) {
				return true;
			}
		}
		return false;
	}
	
	
	
}
