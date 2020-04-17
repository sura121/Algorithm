package sura.org.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class Progress {

    public static void main(String[] args) {
    	Progress sol = new Progress();
    	
    	int[] progress = {99, 20, 30};
    	int[] speed = {1, 40, 30};
    	sol.solution(progress, speed);
    }


    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        /*
         * progress 작업 % + speends[index] 로 해당 작업 첫번째 날짜를 구한다.
         * 
         */
        
         ArrayList<Integer> complete = new ArrayList<>();
         int index = 0;
         
         for(int work : progresses) {
        	 Double decimalDay = (double) (100-work) / speeds[index];
        	 
        	 int day = (int) Math.ceil(decimalDay );

        	 complete.add(day);
        	 index ++;        
         }
         
         System.out.println(complete.toString());
         /*
          * 작업 걸린 날짜를 처리....
          * 
          */
         int maxDay = 0;
         int deployCount = 0;
         int aIndex = 0;
         int length = complete.size();
         for(int i = 0; i < length; i++) {
        	 
        	 int workDay=complete.get(i);
        	 if (i == 0) {
        		 maxDay = workDay;
        	 }
        	 
        	 if(maxDay >= workDay) {
        		 deployCount ++;
        		 
        	 } else {
        		 
        		 maxDay = workDay;
        		 
        		 if(deployCount >= 1) {
        			 deployCount=1;
        		 }
        		 
        		 aIndex++;
        	 }
        	 
        	 answer = Arrays.copyOf(answer, aIndex+1);
    		 answer[aIndex] = deployCount;
         }
         
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
