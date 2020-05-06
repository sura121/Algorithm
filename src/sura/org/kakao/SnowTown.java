package sura.org.kakao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SnowTown {
	
	
	public static void main(String[] args) {
		
		SnowTown sol = new SnowTown();
		
		long k = 10;
		long[] room_number = {1,3,4,1,3,1};
		sol.solution(k, room_number);
	}
	
	public long[] solution(long k, long[] room_number) {
	        long[] answer = {};
	        
	        /*
	         * 1. map에 전체 방의 갯수를 채워
	         * 2. key , value를 이용해 빈방 1 , 나간방 0 으로 체움
	         * 3. 해당 방을 배정 시작.
	         */
	        
	        HashMap<Long,Integer> total_room = new HashMap<>();
	        
	        for(long i = 1; i <= k; i++) {
	        	total_room.put(i,0);
	        }
	        
	        answer = new long[room_number.length];
	        
	        int index = 0;
	        
	        for (long l : room_number) {
	        	
	        	System.out.println("key Value : " + index);
				
	        	if( total_room.get(l) == 0 ) {	        		  
	        		
	        		total_room.put(l,(int) l+1);
	        		
	        		answer[index] = l;
	        		
	        		index++;
	        		
	        		continue;
	        		
	        	}
	        	
	        	/*
	        	 * 남은방의 최소값을 찾아야됨
	        	 */
	        	
	        	Long re_room = null;
	        	
	        	/*
	        	 * TODO : 노드 탐색을 위한 HashMap 탐색을 어떻게 해야될지 생각이 필요하다..
	        	 */
	        	for(long t = total_room.get(l); t<=k; t++) {
	        		
	        		if ( total_room.get(t) == 0) {
	        			re_room = t;
	        			total_room.put(t,0);
	        			break;
	        		}
	        	}
	        	
//	        	Long re = total_room.entrySet().stream()
//	        			.filter(s -> s.getKey() > l && s.getValue() == 1)
//	        			.min(Map.Entry.comparingByKey())
//	        			.get()
//	        			.getKey();
//	        	
//	        	total_room.put(re, 0);
//	        	
	        	answer[index] = re_room;	
	        	
	        	index++;
	        	
			}
	        
	        System.out.println("first batch room array : " + total_room.toString());
	        System.out.println("value of answer : " + Arrays.toString(answer));
	        
	        return answer;
	}

}
