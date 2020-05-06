package sura.org.kakao;

import java.util.Arrays;

public class StringPress {
	
	
	 public static void main(String[] args) {
		 
		 StringPress sol = new StringPress();
		 
		 String s = "aabbaccc";
		 
		 sol.solution(s);
		
	 }
	
	 public int solution(String s) {
	        int answer = 0;
	        
	        int string_length = s.length();
	        
	        for(int i = 1; i <= string_length; i++) {
	        	
	        	String div_string = s.substring(i-1,i);
	        	
	        	System.out.println(div_string);
	        }
	        
	        
	        return answer;
	 }

}
