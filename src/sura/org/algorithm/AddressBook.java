package sura.org.algorithm;

import java.util.*;

public class AddressBook {

    public static void main(String[] args) {
        String[] address = 	{"123", "456", "789"};

        HashMap<Integer,String> addMap = new HashMap<>();
        HashMap<Integer,String> cloneMap = new HashMap<>();

        int originIndex = 0;

        for(String phoneNumber : address) {
            addMap.put(originIndex, phoneNumber);
            originIndex++;
        }

        for(Map.Entry<Integer,String> entry : addMap.entrySet()) {
            cloneMap.put(entry.getKey(), entry.getValue());
        }

        Iterator<Integer> iteratormap = addMap.keySet().iterator();

        int index = 0;
        boolean answer = true;

        while (iteratormap.hasNext()) {
           Integer key = iteratormap.next();
           String msg = addMap.get(key);

           for (Map.Entry<Integer,String > cloneEntry : cloneMap.entrySet()) {

               if(cloneEntry.getKey() != index && msg.startsWith(cloneEntry.getValue())) {
                    System.out.println(cloneEntry.getValue() + "======" + msg);
                    answer = false;
                    break;
               }

            }

           index++;

        }

        System.out.println(answer);
    }

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        return answer;
    }
}


