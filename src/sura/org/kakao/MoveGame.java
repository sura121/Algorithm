package sura.org.kakao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class MoveGame {
	
	public static void main(String[] args) {
		
		MoveGame sol = new MoveGame();
		
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		sol.solution(board, moves);
		
	}
	
	public int solution(int[][] board , int[] moves) 
	{
		int answer = 0;
	
		int bordSize = board.length;
		
//		ArrayList<Integer> stack = new ArrayList<>(Arrays.asList());
		Stack<Integer> stack = new Stack<>();
		
		for(int y : moves) {
//			System.out.println("input value : " + y);
			for(int i = 0; i<bordSize; i++) {
				int yPos = y-1;
				
				int get = board[i][yPos];
				
				if(get != 0) {
					
					board[i][yPos]=0;
					
					boolean stackTask = true;
					
					while(!stackTask) {
						int stackValue = stack.peek();										
						
						if(get == stackValue) {
							System.out.println("pop?");
							stack.pop();
							answer++;							
							continue;
						}
						
						if(stack.empty()) {
							stackTask = false;
						}
						
						stackTask = false;						
					}	
					break;
				}
				
				
			}
		
			
			
		}
		
		System.out.print(answer);
		return answer;
	}

}
