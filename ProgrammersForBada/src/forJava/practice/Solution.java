package forJava.practice;

public class Solution {
	// 문자열 다루기 기본.
	public boolean solution(String s) {
		// 정규식 활용하기
		if( s.length() == 4 || s.length()==6 ) {
			if(s.matches("(^[0-9]*$)")) {
				return true;
			} else {
				return false;
			}
				
		} else {
			return false;
		}
	}
	
	
	

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution("3255"));
		System.out.println(sol.solution("325523564"));
		System.out.println(sol.solution("0123"));
	}

}
