package sura.org.algorithm.sort;

import java.util.Arrays;
import java.util.Comparator;

public class largestNumber {

    public static void main(String[] args) {

        int[] sol = {6,10,2};

        largestNumber lg = new largestNumber();

        String an = lg.solution(sol);
        System.out.println(an);


    }

    public String solution(int[] numbers) {
        String answer = new String();

        String str_number[] = new String[numbers.length];

        for(int i=0; i<str_number.length; i++) {
            str_number[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str_number, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                System.out.println("처음수 : " + o2+o1);
                System.out.println("비교 : " + o2+o1);
                return (o2+o1).compareTo(o1+o2);
            }
        });

        if(str_number[0].startsWith("0")) {
            answer = "0";

        } else {
            for (String number: str_number) {
                answer += number;
            }
        }



        return answer;
    }



}
