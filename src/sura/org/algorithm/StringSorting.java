package sura.org.algorithm;


import java.util.Arrays;

public class StringSorting {

    public static void main(String[] args) {
        StringSorting sol = new StringSorting();
        String test = "-1 -2 -3 -4";
        sol.solution(test);
    }

    public String solution(String s) {
        String answer = "";
        StringSorting a = new StringSorting();

        String tAnswer = a.stringSort(s);

        System.out.println(tAnswer);

        return answer;
    }

    private String stringSort(String s)
    {
        String[] splitArray = s.split(" ");
        int[] splitIntArray = Arrays.stream(splitArray).mapToInt(Integer::parseInt).toArray();

        int minimum = 0;
        int maximum = 0;
        int index = 0;

        for (int num : splitIntArray) {

            if(index == 0){
                minimum = num;
                maximum = num;

                /*
                  제일 처음 initialize 변수 초기화 이후에는 index값을 올릴 필요가 없음 불필요 코드 x
                 */
                index++;
                continue;
            }

            if(num < minimum) {
                minimum = num;
            }

            if(num > maximum) {
                maximum = num;
            }
        }

        String answer = "";
        answer=minimum+" "+maximum;


        return answer;
    }

}
