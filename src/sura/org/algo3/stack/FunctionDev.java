package sura.org.algo3.stack;

import java.util.*;

public class FunctionDev {

    public static void main(String[] args) {

        FunctionDev fdev = new FunctionDev();

        int[] a = {93,30,55};
        int[] b = {1,30,5};

        //7,3,9

        fdev.newSol(a,b);

    }

    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        Queue<Integer> rest = new LinkedList<>();

        int idx = 0;
        for(int pr : progresses) {

            int div = 100-pr;
            int speed = speeds[idx];
            int mock = div / speed;

            if(div % speed != 0 ) {
                mock +=1;
            }

            rest.offer(mock);

            idx++;
        }


        int deployDay = 0;
        int prevDay = 0;
        int a_idx = 0;

        List<Integer> pr_answer = new ArrayList<>();

        while(!rest.isEmpty()) {

            int curDay = rest.poll();

            if(curDay > prevDay) {
                deployDay=1;
                prevDay = curDay;
                pr_answer.add(a_idx,deployDay);
            } else {
                a_idx--;
                int prev_val = pr_answer.get(a_idx);
                pr_answer.remove(a_idx);
                pr_answer.add(a_idx,prev_val+1);
            }


            a_idx++;
        }

        answer = pr_answer.stream().mapToInt(x->x).toArray();

        return answer;
    }

    public int[] newSol(int[] progresses, int[] speeds) {
        int[] dayOfend = new int[100];
        int day = -1;
        for(int i=0; i<progresses.length; i++) {

            System.out.println("index : " + i);
            while(progresses[i] + (day*speeds[i]) < 100) {
                System.out.println(progresses[i] + (day*speeds[i]));
                System.out.println(day);
                day++;
            }
            dayOfend[day]++;
        }

        System.out.println(Arrays.toString(dayOfend));
        return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
    }
}
