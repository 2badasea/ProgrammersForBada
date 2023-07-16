package forJava.level1;

public class FoodFighter {

	public static void main(String[] args) {
		int[] test1 = {1, 3, 4, 6};
		int[] test2 = {1, 7, 1, 2}; 
		
		FoodFighter ff = new FoodFighter();
		System.out.println(ff.solution(test1));  // "1223330333221"
		System.out.println(ff.solution(test2));  // "111303111"
	}
	
	
	public String solution(int[] food) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        int num = 1;
        int cnt = 0;
        for(int in : food) {
        	if(in == 1) {
        		continue;
        	}
        	if(in % 2 ==0) {
        		for(int i = 0; i<in; i++) {
        			sb.append(String.valueOf(num));
        		}
        	}else {
        		for(int i = 0; i< in-1; i++) {
        			sb.append(String.valueOf(num));
        		}
        	}
        	
        	num++;
        }
        
        
        
        return answer;
    }

}
