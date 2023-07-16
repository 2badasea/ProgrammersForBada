package forJava.level1;

import java.util.*;

public class MakeStrangeWord {

	public static void main(String[] args) {
		MakeStrangeWord msw = new MakeStrangeWord();
		System.out.println( msw.solution("try hello world")); 
	}
	
    public String solution(String s) {
        // 단어를 기준으로 홀/짝을 구분
    	StringBuilder sb = new StringBuilder();
    	
    	String[] ary =  s.split("");
    	boolean flag = true;
    	
    	for(String c : ary) {
    		if(c.equals(" ")) {
    			flag =true; 
    			sb.append(" ");
    			continue;
    		}
    		if(flag) {
    			sb.append( c.toUpperCase());
    			flag =!flag;
    		}else {
    			sb.append(c.toLowerCase());
    			flag = !flag;
    		}
    	}
        return sb.toString();
    }
}
