package sura.org.algo3;

public class LineAlgo {
	
	public static void main(String[] args) {
		LineAlgo sol = new LineAlgo();
		
		sol.solution(3, 5);
	}
	
	public int[] solution(int n, long k) {
	      int[] answer = {};
	      
	      int totalCase = 1;
	      
	      /*
	       * 모든 경우의수 
	       */
	      for(int i =n; 1 <=i; i--) {
	    	  totalCase = totalCase*i;
	      }
	      System.out.println(totalCase);
	      return answer;
	}
	
	
	/*
	 * 1,2,3
	 * 1,3,2
	 * 2,1,3
	 */

}
