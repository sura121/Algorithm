package sura.org.codility;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {
        CyclicRotation cl = new CyclicRotation();

        int[] a = {1,2,3,4};
        cl.Cycle(a,4);
    }

     public int[] Cycle(int[] A, int K) {

        int arrayLength = A.length;

        for(int i = 0; i < K; i++) {

            int idx = 0;
            int[] cloneArr = A.clone();

            for (int val: cloneArr)
            {
                int shift = ++idx;

                if(arrayLength == shift) {
                    idx = 0;
                    A[0] = val;
                    continue;
                }

                A[shift] = val;
            }

        }

         return A;
     }
}
