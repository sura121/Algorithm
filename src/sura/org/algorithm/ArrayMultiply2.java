package sura.org.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMultiply2 {
	
	 public static void main(String[] args) {
	        int[] A = {1,4,2};
	        int[] B = {5,4,4};

	        int answer = 0;

	        int mt = (int)Math.pow(A.length,2);
	        int lengthSizie = A.length;

	        ArrayList<Integer> sumArr = new ArrayList<>();

	        /**
	         * A[0] 선택지 3
	         * A[1] 선택지 2
	         * A[2] 선택지 1
	         *
	         * 전체 경우의수 length * length
	         */
	        
	        Arrays.sort(A);
	        Arrays.sort(B);
	        
	        System.out.println(Arrays.toString(A));
	        System.out.println(Arrays.toString(B));
	        
	        int arraySize = A.length;
	        int sum = 0;
	        for(int i=0; i<arraySize; i++) {
	        	sum +=A[i] * B[(arraySize - i)-1];
	        	System.out.println(sum);
	        }
	        
	        
	        System.out.println(sum);
	     

	    }
}
