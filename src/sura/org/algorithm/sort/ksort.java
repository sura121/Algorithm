package sura.org.algorithm.sort;

import java.util.ArrayList;
import java.util.Collections;

public class ksort {

    public static void main(String[] args) {
        ksort t = new ksort();

        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};


        t.solution(array,commands);

    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        int length = commands.length;
        answer = new int[length];

        int arraylen = array.length;
        int index = 0;

        for(int[] setting : commands) {

            int start = setting[0]-1;
            int end = setting[1] - 1;
            ArrayList<Integer> arr = new ArrayList<>();

            for(int i = 0; i < arraylen; i++) {

                if(i >= start && i <= end) {
                    arr.add(array[i]);
                }

            }

            Collections.sort(arr);
            int arrIndex = setting[2]-1;

            answer[index] = arr.get(arrIndex);
            index++;

        }

        return answer;
    }
}
