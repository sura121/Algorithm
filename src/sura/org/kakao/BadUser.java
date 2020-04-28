package sura.org.kakao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.print.attribute.IntegerSyntax;

public class BadUser {
	
	public static void main(String[] args) {
		BadUser sol = new BadUser();
		
		String[] user_id = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
		String[] banned_id = {"fr*d*", "abc1**"};
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
        
        ArrayList<Integer> result_arr = new ArrayList<>();
        
        for (String user : user_id) {
        	
        	int inner_index = 0;
        	
			for(List<Integer> num : bandPostion) {
				
				StringBuilder builder = new StringBuilder(user);
//				StringBuffer builder = new StringBuffer(user);
//				builder.setCharAt(index, ch);
				
				num.stream()
				.forEach(x -> System.out.print(builder.setCharAt(x, '*')));
				
//				System.out.println(result_list.toString());
				
			}
		}
//        System.out.println("System value : " + bandPostion.toString());
        
        return answer;
    }

}
