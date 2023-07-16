package forJava.level3;

// https://school.programmers.co.kr/learn/courses/30/lessons/12907
public class Change {

	public static void main(String[] args) {
		int n = 5;
		int[] money = {1,2,5};
		
		Change change = new Change();
		System.out.println("답: " + change.solution(n, money));
	}
	
	int solution(int n, int[] money) {
		int[][] dp = new int[money.length+1][n+1];
		int answer = 0;
		
		// dp[i][j]는 i개의 동전으로 j원을 만드는 경우의 수
		for(int i = 1; i<money.length+1; i++) {
			for(int j = 0; j<n+1; j++) {
				// 0원을 만드는 경우의 수 => 아무것도 내지 않는 경우. 의미없는 경우의 수
				if( j == 0) {
					dp[i][j] = 1;
				}else {
					if( j < money[i-1]) { 
						// 거스름돈보다 새로운 동전의 값이 더 큰 경우(차이값이 음수가 나오는 경우)
						dp[i][j] = dp[i-1][j];
					}else {
						// 새로운 동전을 사용하지 않은 경우의 수 + 새로운 동전을 사용한 경우의 수(3+1)
						dp[i][j] = (dp[i-1][j] + dp[i][j-money[i-1]] % 1000000007);
					}
				}
			}
		}
		return dp[money.length][n];
	}
}
