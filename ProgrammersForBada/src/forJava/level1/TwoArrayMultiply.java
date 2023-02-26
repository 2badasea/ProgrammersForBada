package forJava.level1;

/*
 * 내적
 * https://school.programmers.co.kr/learn/courses/30/lessons/70128
 */
public class TwoArrayMultiply {
	
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i = 0; i<a.length; i++) {
        	int multi = a[i] * b[i];
        	answer += multi;
        }
        
        return answer;
    }
    
    
	public static void main(String[] args) {

	}

}
