package sura.org.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordChain {

    public static void main(String[] args) {

        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

        WordChain wd = new WordChain();

        int[] answer = wd.solution(3, words);

        System.out.println(Arrays.toString(answer));

    }

    public int[] solution(int n, String[] words) {

        int[] answer = new int[2];

        int word = wordVerfication(words);
        int dupli = duplicationCheck(words);

        if(word == 0 && dupli == 0 ){
            answer[0] = 0;
            answer[1] = 0;
            return  answer;
        }

        if(word != 0 ) {
            answer = checkSolution(word, n);
        }

        if(dupli != 0) {
           answer = checkSolution(dupli, n);
        }

        return answer;
    }

    /**
     * 끝말잇기 글자 검사
     * @param words
     * @return
     */
    private int wordVerfication(String[] words) {

        int incorrectNumber = 0;

        for(int i = 0; i<words.length; i++) {

            String lastWord = words[i].substring(words[i].length()-1);
            String firstWord = "";
            if(words.length > i+1) {
                firstWord = words[i+1].substring(0,1);
            }

            System.out.println("============"+(i+1)+"번째==========");
            System.out.println("last word : " + lastWord);
            System.out.println("first word : " + firstWord);

            if(lastWord == firstWord) {
                incorrectNumber = i+1;
                break;
            }

        }

        return incorrectNumber;
    }

    /**
     * Hash Map 이용하여 duplicate 검사 O(n)
     * @param words
     * @return
     */
    private int duplicationCheck(String[] words) {

        Set<String> wordFind = new HashSet<String>();

        int number = 1;
        for(String i : words) {
            if(wordFind.contains(i)) {
                System.out.println(number);
                return number;
            }
            wordFind.add(i);
            number++;
        }

        return  0;
    }

    /**
     * array result
     * @param sortNumber
     * @param n
     * @return
     */
    private int[] checkSolution(int sortNumber, int n) {

        int[] sol = new int[2];

        int numberUser =  sortNumber % n==0 ? n : sortNumber % n;
        int numberOrder = Math.round(sortNumber / n);
        System.out.println(numberUser+" , "+numberOrder);
        sol[0] = numberUser;
        sol[1] = numberOrder;

        return sol;
    }
}
