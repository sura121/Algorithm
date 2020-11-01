package sura.org.codility;

import java.util.*;
import java.util.stream.Collectors;

public class PermMissingEle {

    public static void main(String[] args) {


        PermMissingEle pm = new PermMissingEle();

        int[] A = {1};
        int solNum = pm.solution(A);

        /**
         * 1,2,3,4
         * 1,2,3,5
         */

        System.out.println(solNum);
    }

    public int solution(int[] A) {

//        Set<Integer> set = Arrays.stream(A).boxed().collect(Collectors.toSet());
        Arrays.sort(A);
        int length = A.length;
        int number = 1;

        for(int i = 0; i < length; i++) {

            if(number != A[i]) {
                return number;
            }

            number++;
        }

        System.out.println(Arrays.toString(A));
//        Iterator<Integer> iterator = set.iterator();
//        int index = 1;
//
//        while(iterator.hasNext()) {
//
//            int number =  iterator.next();
//            System.out.println("Asd :" + number);
//            if(index != number) {
//                return index;
//            }
//
//            index++;
//        }

//        int length = A.length;
//        System.out.println(length);
//        for( int  i = 1 ; i <= length+1; i++) {
//            int index = i;
//
//            boolean containNumber = Arrays.stream(A)
//                    .anyMatch(x -> x == index);
//
//
//            if(!containNumber) {
//                return index;
//            }
//
//
//
//        }


        return number;
    }
}
