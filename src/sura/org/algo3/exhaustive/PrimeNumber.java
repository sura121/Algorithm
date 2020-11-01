package sura.org.algo3.exhaustive;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    public static void main(String[] args) {

        PrimeNumber pr = new PrimeNumber();

        pr.solution("17");

    }

    public int solution(String number) {

        int answer = 0;

        List<Integer> combine_number = new ArrayList<>();

        numberPrime(number);

        return answer;
    }

    private int[] numberPrime(String number) {

        int[] numbers = {};

        String[] split_number = number.split("");

        int split_arr_size = split_number.length;

        for (int i = 0; i < split_arr_size; i++) {

            numberPrime(number);
        }

        return numbers;
    }

    /*
            1,3,5,7,9
     */
}
