package sura.org.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SunClasses {
    public static void main(String[] args) {

        int answer = 0;
        int hap = 0;
        int gop = 0;

        String[][] clothes =
            {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
             };

        HashMap<String, ArrayList<String>> clothesMap = new HashMap<>();

        for(String[] cloth : clothes) {

            if(clothesMap.containsKey(cloth[1])) {
                ArrayList<String> categoryList = clothesMap.get(cloth[1]);
                categoryList.add(cloth[0]);
                clothesMap.put(cloth[1],categoryList);
            } else {
                ArrayList<String> classfy = new ArrayList<>();
                classfy.add(cloth[0]);
                clothesMap.put(cloth[1],classfy);
            }
        }

        for(Map.Entry<String, ArrayList<String>> entry : clothesMap.entrySet()) {
            System.out.println(Arrays.asList(entry));
            hap = hap + entry.getValue().size();

            if(gop > 0 ) {
                gop = gop * entry.getValue().size();
            } else {
                gop = entry.getValue().size();
            }

        }

        answer = hap + gop;

    }

    public int solution(String[][] clothes) {
        int answer = 0;
        return answer;
    }
}
