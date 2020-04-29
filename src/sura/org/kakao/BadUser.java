package sura.org.kakao;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class BadUser {
	
	public static void main(String[] args) {
		BadUser sol = new BadUser();
		
		String[] user_id = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
		String[] banned_id = {"*rodo", "*rodo", "******"};
		sol.solution(user_id, banned_id);
	}
	
	public int solution(String[] user_id, String[] banned_id) {
        int answer = 0;
        
        /* 
         * 1. banned_id 제제아이디 * 위치파악 2차원 배열에 저장. 
         * 2. 문자열 자릿수로 1차 비교가 가능...
         * 3. 블락된 제제아이디가 중복이 생길수가 있다.
         */
        
       
        /*
         * 애초에 list를 쓰지말고 hashSet을 쓰는게 더 좋은듯
         * Set은 중복을 포함하지 않기때문
         */
        LinkedHashSet<List<Integer>> bandPostion = new LinkedHashSet<>();
       
        int index = 0;
        
        for (String ban : banned_id) {
        	
        	int str_length = ban.length();
        	
        	List<Integer> pattern_arr = new ArrayList<>();
        	
        	
        	for(int i = 0; i < str_length; i++) {
        		
        		String word = Character.toString(ban.charAt(i));
        		
        		if("*".equals(word)) {
        			pattern_arr.add(i);
        		}
        		
        	}
        	
        	/*
        	 * 배열을 비교해서 * 위치가 같으면 다시 비교 할 필요가 없음
        	 * 경우의 수 계산을 위한 위치가 같은 문자열만 찾으면됨 위의 조건 3번 해
        	 * List -> HashSet 변
        	 */
        	
    		bandPostion.add(pattern_arr);
    		index++;
        	
        }
        
        System.out.println("band Position Array : " + bandPostion.toString());
        ArrayList<String> result_arr = new ArrayList<>();
        
        StringBuilder str = new StringBuilder();
        
        for(List<Integer> num_arr : bandPostion) {
        	//[],[];
        	String[] clone_arr = user_id.clone();
        	
        	int clone_index = 0;
        	
        	for(String user_name : clone_arr) {
        		
        		boolean skip_value = false;
        		//stringbuilder init
        		str.setLength(0);
        		
        		str.append(user_name);
        		
        		for(int pos_num : num_arr) {
        			
//        			System.out.println("user length : " + user_name.length() + " position num : "  + pos_num);
        			if(user_name.length() <= pos_num ) {
//        				System.out.println("in??");
        				clone_index++;
        				skip_value = true;
        				break;
        			}
        			
        			str.setCharAt(pos_num, '*');	
        		}
        		
        		if(skip_value) {
        			continue;
        		}
//        		System.out.println("sIndex value : " + clone_index);
        		clone_arr[clone_index] = str.toString();
        		if(clone_arr[clone_index].contains("*")) {
        			result_arr.add(str.toString());
        		}
        		clone_index++;
        		
        	}
        	
        }
        
//    	System.out.println(result_arr.toString());
    	
    	/*
    	 * final step 
    	 * banned id 와 같은 문자열을 찾아서 count 
    	 * 경우의수로 계산....
    	 */
    	
    	ArrayList<Integer> count_arr = new ArrayList<>();
    	
    	for(String ban_name : banned_id) {
    		
    		int count = 0;
    		for(String result_name : result_arr) {
    			
//    			System.out.println("banned id : " + ban_name + " make ban name : " + result_name);
    			if( ban_name.equals(result_name) ) {
    				count++;
    			}
    			
    		}
    		
			if(count != 0) {
				count_arr.add(count);
			}
    	}
    	
    	System.out.println(count_arr.toString());
    	
    	Integer an = count_arr.stream()
    		.filter(x -> x > 0)
    		.sorted()
    		.reduce(1, (a,b)->a*b);
    	
    	answer = an;
        
        return answer;
    }

}
