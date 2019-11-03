package sura.org.algorithm;

public class Gameconvention {

    public static void main(String[] args) {

        Gameconvention gv = new Gameconvention();
        gv.solution(8,4,7);

    }

    public int solution(int n, int a, int b)
    {
        int answer = 1;

        boolean fightResult = false;
        int nextNumberA = a;
        int nextNumberB = b;

        while(!fightResult) {


            nextNumberA = nextRoundNumber(nextNumberA);
            System.out.println("A 선수 다음 라운드 번호 : "+ nextNumberA);
            nextNumberB = nextRoundNumber(nextNumberB);
            System.out.println("B 선수 다음 라운드 번호 : "+ nextNumberB);

            fightResult = abFight(nextNumberA, nextNumberB);
            answer++;
        }

        System.out.println(answer);

        return answer;
    }

    /**
     * 다음 라운드 번호
     * @param number
     * @return
     */
    private int nextRoundNumber(int number)
    {
        int nextNumber = 0;

        if(number % 2 != 0) {
            nextNumber = (number+1) / 2;
        } else {
            nextNumber = number / 2;
        }

        return nextNumber;
    }

    /**
     * 다음 라운드에 매칭이되는지 확인 로직
     * @param a
     * @param b
     * @return
     */
    private boolean abFight(int a, int b)
    {
        if(a == (b+1) || b == (a+1)) {
            return true;
        }

        return  false;
    }


}
