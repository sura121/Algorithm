package sura.org.algorithm;

import java.util.Arrays;

public class LandEat {

    public static void main(String[] args) {

        int[][] oo = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        LandEat ld = new LandEat();
        int answer = ld.solution(oo);
        System.out.println(answer);

    }

    private int solution(int[][] land) {
        int answer = 0;

        int index = 0;
        int prevIndex = 0;
        int maxNumber = 0;

        for(int[] l : land) {

            int[] cloneArr = l.clone();

            Arrays.sort(l);
            maxNumber = l[l.length-1];

            if(index > 0 ){
                if(prevIndex == Arrays.binarySearch(cloneArr,maxNumber)){
                        maxNumber = l[l.length-2];
                        prevIndex = Arrays.binarySearch(cloneArr,maxNumber);
                }

            } else {
                prevIndex = Arrays.binarySearch(cloneArr,maxNumber);
            }

            index++;
            answer+=maxNumber;
        }

        return answer;
    }


}
