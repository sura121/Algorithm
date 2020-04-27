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
	      
	      int[][] calcSpace = new int[totalCase][n];
	      
	      /*
	       * XXX: 고민할 많은듯....
	       * 모든 탐색을 통해 배열을 만드는 것보다 k 번째의 배열값을 추측하는게 더 빠를듯...
	       * 0번 index 값이 무슨값이 되는지 파악이 중
	       */
	      for(int j=0; j<totalCase; j++) {
	    	  
	      }
	      return answer;
	  }
	
	/*
	 * 1,2,3
	 * 1,3,2
	 * 2,1,3
	 */

}
