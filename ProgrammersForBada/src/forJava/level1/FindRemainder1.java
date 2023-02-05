package forJava.level1;


/*
 * 나머지가 1이 되는 수 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/87389
 */
public class FindRemainder1 {
		
	public int solution(int n) {
        int count = 2;
        while(true) {
        	if((n % count) == 1) {
        		break;
        	}
        	count++;
        }
        return count;
    }
	
	
	
	public static void main(String[] args) {
		FindRemainder1 fr = new FindRemainder1();
		System.out.println(fr.solution(10)); // 3
		System.out.println(fr.solution(12)); // 11
	}
}
