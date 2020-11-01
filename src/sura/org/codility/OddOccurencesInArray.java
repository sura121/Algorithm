package sura.org.codility;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.*;
import java.util.stream.Collectors;

public class OddOccurencesInArray {

    public static void main(String[] args) {

        OddOccurencesInArray oi = new OddOccurencesInArray();

        int[] a = {9,3,9,3,9,7,9};

        int result =oi.solution(a);

        System.out.println(result);
    }

    public int solution(int[] A) {

        Map<Integer, Integer> cloneArr = new HashMap<>();

        for (int a: A) {
            CreateNumber(cloneArr,a);
        }

        for(Integer num : cloneArr.keySet()) {

            if(cloneArr.get(num) % 2 != 0 ) {
                return  num;
            }
        }

        return -1;
    }

    private void CreateNumber(Map<Integer, Integer> cop, int targetNum) {

        Integer target = cop.get(targetNum);

        if(target == null) {
            cop.put(targetNum,1);
        } else {
            cop.put(targetNum, target+1);
        }


    }
}
