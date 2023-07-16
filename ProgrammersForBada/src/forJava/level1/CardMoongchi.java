package forJava.level1;

import java.util.Stack;

public class CardMoongchi {

	public static void main(String[] args) {
		String[] cards1 = {"i", "drink", "water"};
		String[] cards2 = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink", "water"};
		
		String[] cards11 = {"i", "water", "drink"};
		String[] cards22 = {"want", "to"};
		String[] goal2 = {"i", "want", "to", "drink", "water"};
		
		
		
		CardMoongchi cm = new CardMoongchi();
		System.out.println(cm.solution(cards1, cards2, goal));
		System.out.println(cm.solution(cards11, cards22, goal2));
	}
	
	public String solution(String[] cards1, String[] cards2, String[] goal) {
       
        Stack<String> card1Stack = new Stack<>();
        for(int i = cards1.length -1; i>=0; i--) {
        	card1Stack.push(cards1[i]);
        }
        
        Stack<String> card2Stack = new Stack<>();
        for(int i = cards2.length -1; i>=0; i--) {
        	card2Stack.push(cards2[i]);
        }
        
        boolean flag = true;
        
        for(String g : goal) {
			if (card1Stack.size() != 0) {
				if (g.equals(card1Stack.peek())) {
					card1Stack.pop();
					continue;
				}
			}
			if (card2Stack.size() != 0) {
				if (g.equals(card2Stack.peek())) {
					card2Stack.pop();
					continue;
				}
			}
        	flag =false;
        }
        return flag ? "Yes" : "No";
    }
}
