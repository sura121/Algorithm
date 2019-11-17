package sura.org.algorithm;

import java.util.*;

public class Streaming {

    public static void main(String[] args) {

        String[] ge = {"classic","pop","classic","classic","pop"};
        int[] play = {500,600,150,800,2500};


        Streaming str = new Streaming();
        str.solution(ge, play);

    }

    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        HashMap<String,Integer> genresList = new HashMap<>();
        ArrayList<Integer> indexArr = new ArrayList<>();
        HashMap<String,Integer[]> genresIndex = new HashMap<>();

        int index = 0;

        //genre
        for(String gen : genres) {
            int a = plays[index];

            if(genresList.containsKey(gen)) {
                int prevInt = genresList.get(gen);

                prevInt +=a;

                genresList.put(gen,prevInt);

            } else {
                genresList.put(gen, a);
            }

            index++;
        }

        //sort descending
        LinkedHashMap<String,Integer> sortMap = new LinkedHashMap<>();
        genresList.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x->sortMap.put(x.getKey(), x.getValue()));

        System.out.println(Arrays.asList(sortMap));

        //genre array save
        ArrayList<String> genreSort = new ArrayList<>();

        sortMap.forEach((x,v) -> {
            genreSort.add(x);
        });

        /**
         * TODO:중첩 반복문을 안쓰고 해결 할 수 있는 방법을 확인
         * 제일 많이들은 장르에 대해서 첫번째 value get : for 문
         * 해당 index로 횟수가 있는 배열 비교 : for 문
         * 반복문 3번 시간복잡도 .... O(n^3)
         */
        for(String gene : genreSort) {

        }

        return answer;
    }
}
