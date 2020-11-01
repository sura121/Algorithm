package sura.org.codility;

import java.util.ArrayList;
import java.util.Arrays;

public class Binary {
    public static void main(String[] args) {

        Binary bi = new Binary();

        int maxNum = bi.makrBianry(1041);

        System.out.println(maxNum);

    }

    public int makrBianry(int n) {

        String bitStr = Integer.toBinaryString(n);

        char[] bitArr = bitStr.toCharArray();
        System.out.println(Arrays.toString(bitArr));
        ArrayList<Integer> findArr = new ArrayList<>();

        int idx = 0;
        boolean gapStart = false;
        int gapCount = 0;

        for(char str : bitArr) {
            idx++;

            if(str == '1' && gapStart) {
                gapStart = false;
                findArr.add(gapCount);
                gapCount = 0;
            }

            if(str == '1') {
                gapStart = true;
            } else {
                gapCount++;
            }

        }

        if( findArr.size() == 0 ) {
            return  0;
        }
        int maxNumber = findArr.stream().max(Integer::compareTo).orElse(Integer.MAX_VALUE);




        return maxNumber;
    }

}
