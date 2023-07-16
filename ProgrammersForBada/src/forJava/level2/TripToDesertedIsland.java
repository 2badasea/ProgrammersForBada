package forJava.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TripToDesertedIsland {

	public static void main(String[] args) {
		String[] maps1 = { "X591X", "X1X5X", "X231X", "1XXX1" };
		String[] maps2 = { "XXX", "XXX", "XXX" };

		TripToDesertedIsland ti = new TripToDesertedIsland();
		System.out.println("maps1 결과: " + ti.solution(maps1));
		System.out.println("maps2 결과: " + ti.solution(maps2));
	}

	public int[] solution(String[] maps) {
		int[] dx = { 0, 0 , -1, 1};  // 상하'좌우' 이동을 위한 x좌표 변화량
		int[] dy = {-1, 1, 0,0};	// '상하'좌우 이동을 위한 y좌표 변화량 
		
		int n = maps.length;   // 지도의 행 길이
		int m = maps[0].length();  // 지도의 열 길이 
		
		int[][] grid = new int[n][m]; // 지도를 저장하기 위한 2차원 배열 x가 아닌 값을 담는다.
		boolean[][] visited = new boolean[n][m];  // 방문 여부를 저장하기 위한 2차원 배열 boolean의 기본값은 false;
		
		List<Integer> result = new ArrayList<Integer>(); // 결과를 저장하기 위한 리스트
		
		// 지도의 정보를 숫자로 변환하여 grid배열에 저장 => 지도를 숫자(int)형태로만 변환
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				if(maps[i].charAt(j) == 'X') {
					grid[i][j] = -1; // 바다는 -1로 표시
				}else {
					grid[i][j] = Character.getNumericValue(maps[i].charAt(j)); // 무인도의 숫자를 저장
				}
			}
		}
		
		// 각 무인도에서 최대 며칠동안 머물 수 있는지 계산
		for(int i = 0; i<n; i++) {
			for(int j= 0; j<m; j++) {
				if(grid[i][j] > 0 && !visited[i][j]) {  // 바다가 아니고 && 방문한적이 없던 경우(false) 
					int days = bfs(i, j, grid, visited, dx, dy); // BFS를 통해 무인도에서 최대 며칠동안 머물 수 있는지 계산
					result.add(days);
				}
			}
		}
		
		if(result.isEmpty()) {
			result.add(-1); // 지낼 수 있는 무인도가 없는 경우 -1을 추가 
		}
		
		// 결과를 오름차순으로 정렬하여 배열로 변환하여 반환
		return result.stream().mapToInt(Integer::intValue).toArray();
	}
	
	private int bfs(int x, int y, int[][] grid, boolean[][] visited, int[] dx, int[] dy) {
		int n = grid.length;
		int m = grid[0].length;
		
		Queue<int []> queue = new LinkedList<>();
		queue.offer(new int[] {x, y});
		visited[x][y] = true; // 방문하게 됐으므로 해당 좌표 true로 변환
		int days = grid[x][y]; // 현재 무인도에서의 며칠 동안 머물 수 있는지를 저장하는 변수 
		
		while(!queue.isEmpty()) {
			int[] curr = queue.poll(); // 큐의 맴 앞의 요소를 제거하고 해당 요소를 반환하는 역할. 
			int currX = curr[0];
			int currY = curr[1];
			
			for(int i = 0; i<4; i++) {
				// 현재 위치 기준으로 상하좌우에 위치한 요소의 위치값이 nx, ny
				int nx = currX + dx[i];  
				int ny = currY + dy[i];
				
				// 인접한 무인도가 있는지 판단하는 조건문
				if(nx >=0 && nx < n && ny >=0 && ny<m && !visited[nx][ny] && grid[nx][ny] > 0) {
					queue.offer(new int[] {nx, ny});
					visited[nx][ny] = true;
					days += grid[nx][ny]; // 인접한 무인도의 식량을 더해줌
				}
				
			}
		}
		return days;
	}
	
}
