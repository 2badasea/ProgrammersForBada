package forJava.practice;

import java.util.Scanner;
import java.util.Stack;

public class ReviewClass {
	/*
	 *	프로그래머스 - 햄버거 만들기
	 *	빵, 야채, 고기, 빵 순으로 재료가 조합이 될 때마다 햄버거가 만들어진다. ( 1, 2, 3, 1) 
	 *	정수 배열 ingredients가 주어졌을 때, 포장하는 햄버거의 총 갯수를 구하기. 
	 */
	public static void main(String[] args) {
		int[] ingredients = { 2, 1, 1, 2, 3, 1, 2,3, 1};
		int sum = makeBurgers(ingredients);
		System.out.println("햄버거 총 개수: " + sum);
	}	
	
	static int makeBurgers(int[] ingredients) {
		int burgers = 0;
		StringBuilder sb = new StringBuilder();
		for(int in : ingredients) {
			sb.append(String.valueOf(in));
			if( sb.indexOf("1231") != -1) {
				burgers++;
				System.out.println(sb);
				sb.delete(sb.indexOf("1231"), sb.indexOf("1231") + 4);
				System.out.println(sb);
			}
		}
		return burgers;
	}
}
