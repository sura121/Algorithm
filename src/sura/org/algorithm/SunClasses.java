package sura.org.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 순열? 경우의수?....
 */
public class SunClasses {
    public static void main(String[] args) {

        int answer = 0;

        String[][] clothes =
            {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "face"},
                {"smoky_makeup", "face"}
             };

        HashMap<String, Integer> clothesMap = new HashMap<>();

        for(String[] clothe : clothes) {
            clothesMap.compute(clothe[1],(k,v)-> v==null ? 1 : v+1);
        }

        for(Map.Entry<String, Integer> calc : clothesMap.entrySet()) {

            if(answer==0) {
                answer = calc.getValue()+1;
                continue;
            }
            answer = answer * (calc.getValue()+1);
        }

        answer = answer-1;

        System.out.println(answer);

    }

    public int solution(String[][] clothes) {
        int answer = 0;
        return answer;
    }
}
