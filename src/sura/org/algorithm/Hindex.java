package sura.org.algorithm;

import java.util.*;

public class Hindex {

    public static void main(String[] args) {
        Hindex sol = new Hindex();

        int[] a = {3, 0, 6, 1, 5};

        int as = sol.solution(a);

        System.out.println(as);
    }

    public int solution(int[] citations) {
        int answer = 0;

        Integer[] cities = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(citations);
        System.out.println(Arrays.toString(citations));
        Arrays.sort(cities,Collections.reverseOrder());

        System.out.println(Arrays.toString(cities));

        int index = 1;

        for(Integer citi : cities) {

            if(citi <= index){
                answer = index;
                break;
            }

            index++;

        }

        return answer;
    }

}
