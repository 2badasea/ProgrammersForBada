package forJava.level1;

/*
 * 두 정수 사이의 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/12912
 */
public class SumofTwoInteger {
	
	 public long solution(int a, int b) {
	        long answer = 0;
	        
	        int min = a;
	        int max = b;
	        if(min > b) {
	        	min = b;
	        	max = a;
	        }
	        
	        while(min<max) {
	        	answer += min;
	        	min ++;
	        }
	        answer += max;
	        
	        
	        return answer;
	    }
	 
	public static void main(String[] args) {
		SumofTwoInteger st = new SumofTwoInteger();
		System.out.println(st.solution(3, 5));  // 12
		System.out.println(st.solution(3, 3));  // 3
	}
}

/**
 * class Solution {

    public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}
*/
