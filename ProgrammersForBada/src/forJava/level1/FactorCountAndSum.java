package forJava.level1;

/*
 * 약수의 개수와 덧셈
 * https://school.programmers.co.kr/learn/courses/30/lessons/77884
 */
public class FactorCountAndSum {
	
    public int solution(int left, int right) {
        int answer = 0;
        
        
        for(int i = left; i<= right; i++) {
        	
        	int count = 0;
        	for(int j = 1; j<= i/2; j++) {
        		if( i%j == 0) {
        			count++;
        		}
        	}
        	// 마지막에 자기 자신 + 
        	count++;
        	
        	if( count %2 == 0) {
        		answer += i;
        	}else {
        		answer -= i;
        	}
        }
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		FactorCountAndSum fc = new FactorCountAndSum();
		System.out.println(fc.solution(13, 17));  // 43
		System.out.println(fc.solution(24, 27));  // 52
	}

}
