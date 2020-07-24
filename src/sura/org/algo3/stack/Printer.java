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
