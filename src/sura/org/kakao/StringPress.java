package sura.org.kakao;

import java.util.ArrayList;
import java.util.stream.Collectors;


public class StringPress {
	
	
	 public static void main(String[] args) {
		 
		 StringPress sol = new StringPress();
		 
		 String s = "ababcdcdababcdcd";
		 
		 sol.solution(s);
		
	 }
	
	 public int solution(String s) {
	        int answer = 0;
	        
	        ArrayList<String> result_array = new ArrayList<>();
	        
	        int string_length = s.length();
	        int loop_size = string_length/2;
	        
	        for(int i = 1; i <=loop_size ; i++) {
	        	
	        	String result_string = "";
	        	
	        	String compare_string = "";
	        	
	        	int string_count = 1;
	        	
	        	for(int j = i; j<= string_length; j+=i) {
	        		
	        		String current_string = s.substring(j-i,j);
		        	
		        	if ( j == i ) {
		        		result_string += current_string;
		        		compare_string = current_string;
		        		continue;
		        	}
		        	
		        	System.out.println(i+"번째 "+"compare String : "+compare_string+" current_string : "+current_string);
		        	
		        	if(compare_string.equals(current_string)) {
		        		
		        		String compare_change_string = compare_string;
		        		
		        		if(string_count > 1) {
		        			compare_change_string = string_count + compare_string;
		        		}
		        		
		        		string_count++;
		        		
		        		
		        		
		        		System.out.println("compare_change_string : "+ compare_change_string);
		        		String change_string = string_count+compare_string;
		        		System.out.println(change_string);
		        		result_string = result_string.replace(compare_change_string, change_string);
		        		
		        	} else {
		        		
		        		string_count = 1;
		        		result_string +=current_string;
		        		
		        	}
		        	
		        	compare_string = current_string;

	        	}
	        	
	        	result_array.add(result_string);
	        	
	        }
	        
	        result_array.stream().sorted().collect(Collectors.toList());
	        
	        System.out.println(result_array.toString());
	        
	        
	        return answer;
	 }

}
