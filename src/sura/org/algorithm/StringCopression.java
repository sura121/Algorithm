package sura.org.algorithm;

public class StringCopression {
    public static void main(String[] args) {
        StringCopression sol = new StringCopression();
        String s = "aabbaccc";
        sol.solution(s);
    }

    public int solution(String s) {
        int answer = 0;
        int length = s.length();
        String compressionStr = "";
        int size = length/2;

        for(int i=1; i<=size; i++) {

            String repitStr =s.substring(0,i);
            System.out.println("repitStr : "+repitStr);
            for(int j=i; j<=size; j=j+i) {

                String compareStr = s.substring(j,j+i);
                System.out.println("compare : "+compareStr);
            }
        }

        return answer;
    }
}
