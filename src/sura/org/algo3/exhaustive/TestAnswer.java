package sura.org.algo3.exhaustive;

import java.util.Arrays;
import java.util.HashMap;

public class TestAnswer {

    public static void main(String[] args) {
        TestAnswer t = new TestAnswer();
       int[] re = t.solution(new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5});

       System.out.println(Arrays.toString(re));
    }



    public int[] solution(int[] answers) {
        int[] answer = new int[3];

        int maxAnswer = 0;
        int arr_size = answers.length;


        for(int i = 1; i < 4; i ++) {
            Student st = new Student();
            int current_answer = 0;

            int[] stNumbers = st.getNumberArr(i);
            int stNumber_length = stNumbers.length;
            System.out.println("length : " + stNumber_length);

            for(int j = 0; j < arr_size; j++) {

                if(answers[j] == stNumbers[j%stNumber_length]) {
                    System.out.println(j%stNumber_length);
                    current_answer++;
                }


            }

            if(maxAnswer <= current_answer ) {

                if(maxAnswer < current_answer) {
                    answer = new int[3];
                }

                answer[i-1] = i;

                maxAnswer = current_answer;
            }

            System.out.println(Arrays.toString(answer));

        }

        answer = Arrays.stream(answer)
                .filter(x -> x!=0)
                .sorted()
                .toArray();

        return answer;
    }

    class Student {

        private int number;
        private HashMap<Integer, int[]> numberArr = new HashMap<>();

        public Student() {

            this.numberArr.put(1,new int[]{1, 2, 3, 4, 5});
            this.numberArr.put(2,new int[]{2, 1, 2, 3, 2, 4, 2, 5,});
            this.numberArr.put(3,new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5});

        }

        private int[] getNumberArr(int number) {

            return  numberArr.get(number);
        }


    }

}
