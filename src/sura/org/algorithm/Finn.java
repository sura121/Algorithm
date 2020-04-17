package sura.org.algorithm;

public class Finn {
	
	public static void main(String[] args) {
		
		Finn sol = new Finn();
		
		int n = 15;
		
		sol.solution(n);
	
	}
	
	 public int solution(int n) {
	      int answer = 0;
	      
	      /*
	       * 1 + 2 + 3 + 4 + 5 = 15
	       * 4 + 5 + 6 = 15
	       * 7 + 8 = 15
		   * 15 = 15
	       */
	      
	      /*
	       * 1으로 나눈 수
	       * 2로 나눈  
	       * 3
	       */
	      int count = 0;
    	  int firstNum = (n/2)+1;
	     
    	  System.out.println("first Number : " + firstNum);
		  for(int j = firstNum; 1 < j; j--) {
			  System.out.println("start Number : " + j);
			  int sum = 0;
			 for(int i=j; 1<=i; i--) {
				 System.out.println("loop value : "+i);
				 sum +=i;
	    		  
	    		  if(sum == n) {
	    			  System.out.println(sum);
	    			  count++;
	    			  break;
	    		  }
	    		  
	    		  if(sum > n) {
	    			  break;
	    		  }
			 }	
    	  } 

	      System.out.println("answer :" + count);
	      return answer;
	  }

}
