package forJava.level2;

/*
 * 멀리 뛰기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12914
 */
public class FarJump {

	public long solution(int n) {
		
		// 규칙성이 존재
		if(n == 1) return 1;
		
		long[] ary = new long[n+1]; // 피보나치 수열과 같은 규칙이 있는 배열의 연산은 index를 감안하여 길게 잡는다. 
		ary[0] = 0;
		ary[1] = 1;
		ary[2] = 2;
		
		for(int i = 3; i<=n; i++) {
			ary[i]  =  (ary[i-1] + ary[i-2]) % 1234567;
		}
		
		return ary[n];
	}

	
	
	public static void main(String[] args) {
		// 멀리뛰기
		FarJump fj = new FarJump();
		System.out.println(fj.solution(4));   // 5
		System.out.println(fj.solution(3));   // 3
	}
}
