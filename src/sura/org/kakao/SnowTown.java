package sura.org.kakao;

import java.util.Arrays;
import java.util.HashMap;

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
	        	total_room.put(i,1);
	        }
	        
	        answer = new long[(int) k];
	        
	        int index = 0;
	        
	        for (long l : room_number) {
				
	        	if( total_room.get(l) == 1 ) {
	        	
	        		answer[index] = total_room.get(l);
	        		
	        		total_room.put(l, 0);
	        	
	        		continue;
	        		
	        	}
	        	
	        	
			}
	        
	        System.out.println("first batch room array : " + total_room.toString());
	        System.out.println("value of answer : " + Arrays.toString(answer));
	        
	        return answer;
	}

}
