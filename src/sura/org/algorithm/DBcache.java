package sura.org.algorithm;

import java.util.ArrayList;
import java.util.List;

public class DBcache {

    public static void main(String[] args) {
        DBcache sol = new DBcache();

        String[] cities =  {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

         int answer = sol.solution(3,cities);

         System.out.println(answer);
    }

    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        int cacheArraySize = cacheSize -1;
        System.out.println("Array Size : " + cacheArraySize);
        List<String> cacheArray = new ArrayList<>(cacheArraySize);
        ;

        for (String city :cities) {

            int arrSize = cacheArray.size();

            if(arrSize == 0) {

                answer+=5;
                cacheArray.add(city);
                continue;

            } else if (arrSize <= cacheSize) {
                cacheArray.add(city);
                answer+=5;
            } else {
                DBcache com = new DBcache();
                answer +=com.compareCity(cities,city);
                cacheArray.remove(0);
                cacheArray.add(city);
            }

            System.out.println(cacheArray);
        }


        return answer;
    }

    private int compareCity(String[] cities, String city)
    {
        int result = 0;

        if(cities.equals(city)){
            result =1;
        }else {
            result =5;
        };

        return result;
    }


}
