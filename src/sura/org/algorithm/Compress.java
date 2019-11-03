package sura.org.algorithm;

import java.util.HashMap;

public class Compress {

    public static void main(String[] args) {

        HashMap<Character,Integer> list = new HashMap<>();

        for(int i = 0; i < 26; i++) {

            int numberAlpa = 65 + i;
            char alphabet = (char)numberAlpa;

            list.put(alphabet,i+1);
        }

        String msg = "KAKAO";

        char[] words = msg.toCharArray();

        for(int i=0; i < msg.length(); i++){

            if(list.get(words[i])!=null) {

            }
        }
//        for(char word : words) {
//
//            Integer number = list.get(word);
//
//            if(number != null) {
//                System.out.println(number);
//                break;
//            }
//
//            index++;
//        }

    }

    public int[] solution(String msg) {
        int[] answer = {};
        return answer;
    }
}
