package sura.org.kakao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class MoveGame {
	
	public static void main(String[] args) {
		
		MoveGame sol = new MoveGame();
		
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		int answer = sol.solution(board, moves);
		
		System.out.println("answer : " +  answer);
		
	}
	
	public int solution(int[][] board , int[] moves) 
	{
		int answer = 0;
		int bordSize = board.length;
		
		Stack<Integer> stack = new Stack<>();
		
		for(int y : moves) {
//			System.out.println("input value : " + y);
			for(int i = 0; i<bordSize; i++) {

				int yPos = y-1;
				int get = board[i][yPos];
				
				if(get != 0) {
					board[i][yPos]=0;
					
					boolean stackTask = true;
					System.out.println("stack value : "+stack.toString());
					System.out.println("===============================");
					while(stackTask==true) {
						/*
						 * XXX : empty stack 확인 필요 
						 */
						if(stack.empty()) {
							stack.push(get);
							stackTask = false;
							break;
						}
						
						int stackValue = stack.peek();										
						
						if(get == stackValue) {
							System.out.println("pop value : " + " "+stackValue + "get value : "+get);
							stack.pop();
							answer++;		
							stackTask = false;	
							break;
						} else {
							stack.push(get);
						}
							
						stackTask = false;	
						break;			
					}	
					break;
				}	
			}
		}
		answer = answer*2;
		return answer;
	}

}
