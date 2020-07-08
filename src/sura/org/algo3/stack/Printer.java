package sura.org.algo3.stack;

import java.util.*;

class Document {

    int location;
    int priot;
    boolean finding;

    Document (int location, int priot) {
        this.location = location;
        this.priot = priot;
        this.finding = false;
    }

}

public class Printer {

    private static List<Document> doc;

    public static void main(String[] args) {

        Printer pr = new Printer();

        int an = pr.solution(new int[]{2, 1, 3, 2},0);

        System.out.println(an);
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;

        doc = new ArrayList<>();

        int idx = 0;

        for(int num : priorities) {
            Document ob = new Document(idx,num);

            if(idx == location) {
                ob.finding = true;
            }

            doc.add(ob);

            idx++;
        }

        while (!doc.isEmpty()) {
            Document target = doc.get(0);

            if(GreatestFind(target)) {
                answer++;
                if(target.finding) {
                    break;
                } else {
                    doc.remove(target);
                }

            } else {
                doc.remove(target);
                doc.add(target);
            }

        }
//
//        int cur_number = 0;
//        int prev_number = 0;
//
//        List<Integer> work_arr = new ArrayList<>();
//        Stack<Integer> st = new Stack<>();
//
//        for (int num : priorities) {
//            st.add(num);
//        }
//
//        int idx = 0;
//
//        /**
//         * stack
//         * [9,1,1,1]
//         * A, B, C, D
//         * 2 1 3 2
//         * 0
//         * 0,1
//         * 2,0,1
//         * 2,3,0,1
//         */
//
//        while(!st.isEmpty()) {
//
//            cur_number = st.pop();
//
//            if(idx == 0 ){
//                work_arr.add(idx);
//                prev_number = cur_number;
//                idx++;
//                continue;
//            }
//
//            if(cur_number >=prev_number) {
//                work_arr.add(0,idx);
//            } else {
//                work_arr.add(idx);
//            }
//
//            idx++;
//
//        }
//
//
//        System.out.println(work_arr.toString());

        return answer;
    }

    public static boolean GreatestFind(Document doc_obj) {

        for(Document doc : doc) {
            if( doc.priot > doc_obj.priot) {
                return  false;
            }
        }
        return true;
    }
}
