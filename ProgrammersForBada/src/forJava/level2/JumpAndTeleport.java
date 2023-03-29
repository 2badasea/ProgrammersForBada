package forJava.level2;

public class JumpAndTeleport {
	
    public int solution(int n) {
        int ans = 0;
        
        // 순간이동이 경우 지금까지 걸은 거리의 x2를 건전지 사용없이 이동
        // 목표 지점에 정확히 와야 한다 => 초과 x 
        // 순간이동에 제한이 없음.
        // 첫 점프는 무조건 1소모. => 순간이동 가능
        while(n != 0) {
        	if( n % 2 == 0) {
        		n= n/2;
        	}else {
        		n = n -1;
        		ans++;
        	}
        }

        return ans;
    }
	
	
	public static void main(String[] args) {
		JumpAndTeleport jav = new JumpAndTeleport();
		System.out.println(jav.solution(5));    // 2
		System.out.println(jav.solution(6));     // 2
		System.out.println(jav.solution(5000));     // 5
	}

}
