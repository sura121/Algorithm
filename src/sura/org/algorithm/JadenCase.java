package sura.org.algorithm;

import java.util.Arrays;

public class JadenCase {
	
	
	public static void main(String[] args) {
		JadenCase sol = new JadenCase();
		
		String s="3people unFollowed me";
		String answer = sol.solution(s);
		System.out.println(answer);
	}
	
	public String solution(String s) {
	      String answer = "";
	      
	      String[] sArray = s.split(" ");
	      
	      System.out.println(Arrays.toString(sArray));
	      JadenCase jc = new JadenCase();	  
	      
	      
	      int i = 0;
	      int length = sArray.length;
	      for(String word : sArray) {
	    	  String firstWord = word.substring(0);
	    	  if(!jc.charCheck(firstWord)) {
	    		  
	    		  StringBuilder uppercase = new StringBuilder(word.toLowerCase());
	    		  uppercase.setCharAt(0, Character.toUpperCase(word.charAt(0)));
	    		  
	    		  if(i==length) {
	    			  answer += uppercase.toString()+" ";	  
	    		  } else {
	    			  answer += uppercase.toString();
	    		  }
	    		  
	    	  } else {	    		
	    		  
	    		  if(i==length) {
	    			  answer += word.toLowerCase()+" ";	  
	    		  } else {
	    			  answer += word.toLowerCase();
	    		  }
	    		  
	    	  }
	    	
	    	  i++;
	      }
	      
	      return answer;
	}
	
	
	private boolean charCheck(String n)
	{
		try {
			Double.parseDouble(n);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

}
