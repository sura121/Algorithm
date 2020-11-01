package sura.org.codility;

public class FrogJmp {

    public static void main(String[] args) {

        FrogJmp fj = new FrogJmp();

        int a = fj.solution(1,5, 2);

        System.out.println(a);
    }

    public int solution(int x, int y , int d) {

        int countJmp = 0;

        int jumpDistance = y-x;

        countJmp = jumpDistance/d;

        if(x%d != 0 ) {
            countJmp = countJmp+1;
        }

        return countJmp;

    }
}
