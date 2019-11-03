package sura.org.algorithm;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {

        int [][] answer = {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}};
        Solution sol = new Solution();
        int result = sol.solution(answer);

    }

    public int solution(int[][] baseball) {

        int numberFindBaseball = 1;

        for(int[] el : baseball ) {

            System.out.println(numberFindBaseball);
            System.out.println("======================");

            System.out.println("strike :"+ el[1]+" , ball : "+el[2]);

            int[] selectNum = Stream.of(String.valueOf(el[0]).split("")).mapToInt(Integer::parseInt).toArray();

            if(el[1] > 0) {
                System.out.println("Strike Check");
                strikeCheck(selectNum, el[1]);
            }

            if(el[2] > 0) {
                System.out.println("Ball check");
                ballCheck(selectNum,el[2]);

            }

            System.out.println(Arrays.toString(el));
            System.out.println("======================");

            numberFindBaseball++;

        }

        int answer = 0;
        return answer;
    }

    /**
     * Strike check logic
     * @param checkNumber
     * @param strikeNum
     * @return
     */
    private int strikeCheck(int[] checkNumber, int strikeNum) {

        switch (strikeNum) {
            case 1:
                System.out.println(checkNumber[0]);
                break;
            case 2:
                break;
            case 3:
                break;

        }

        return 0;
    }

    /**
     * Ball check logic
     * @param checkNumber
     * @param ballNum
     * @return
     */
    private int ballCheck(int[] checkNumber, int ballNum) {

        switch (ballNum) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }

        return 0;
    }
}

