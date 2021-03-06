package sura.org.codility;

import java.util.Arrays;

public class ComplexTime3 {

    public static void main(String[] args) {

        ComplexTime3 ct3 = new ComplexTime3();

        int[] A= {3,1,2,4,3};

        ct3.solution(A);
    }

    /**
     *
     * @param A
     *
     * P = 1 , A[0] - (A[1]+A[2]+....A[N-1])
     */

    public int solution(int[] A) {

        int length = A.length;

        int[] setArray = new int[length-1];

        for(int p = 1; p < length; p++) {

            System.out.println("index p loop : " + p);

            /**
             * pSum , nSum
             * pSum 과 nSum n(0) n(2longN); loop 한번으로 처리가 가능한가...
             * p, n 시작점
             *
             * stack,
             *
             * total sum, p_sum 에 대해서 빼는 로직으로 loop 중복을 제거 한다...
             */

            int nSum = 0;
            int pSum = 0;

            for(int i = 0; i < length; i++){

                if(i < p) {
                    nSum +=A[i];
                } else {
                    pSum +=A[i];
                }

            }

            int saveSum = nSum - pSum;

            setArray[p-1] = Math.abs(saveSum);
        }

        Arrays.sort(setArray);

        System.out.println(Arrays.toString(setArray));

        return setArray[0];

    }
}
