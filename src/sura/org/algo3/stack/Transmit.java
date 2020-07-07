package sura.org.algo3.stack;

import java.util.*;

public class Transmit {

    public static void main(String[] args) {

        Transmit tr = new Transmit();

        tr.solution(new int[]{6,9,5,7,4});
    }

    public int[] solution(int[] heights) {
        int[] answer = {};

        int height_size = 0;

        Stack<Integer> tops = new Stack<>();

        for(int height : heights) {
            tops.add(height);
        }

        height_size = tops.size();

        int i = height_size;
        int idx = height_size-1;

        answer = new int[i];

        while (i != 1) {

            int pop_height = tops.pop();

            for(int j = i; j>0; j--) {

                if( heights[j-1] > pop_height ) {

                    System.out.println(pop_height);
                    answer[idx] = j;

                    break;
                } else {
                    answer[idx] = 0;
                }
            }

            idx--;
            i--;

        }


        System.out.println(Arrays.toString(answer));

        return answer;
    }

}
