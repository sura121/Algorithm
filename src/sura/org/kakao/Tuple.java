package sura.org.kakao;

import java.util.ArrayList;

public class Tuple {
	public static void main(String[] args) {
		Tuple sol = new Tuple();
		
		String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}"; 
		sol.solution(s);
		
	}
	
	/*
	 * String -> Array 변환
	 * 2차원 배열에 대한 length 순서로 peak
	 */
	public int[]  solution(String s)
	{
		int[] answer = {};
			
 		String[] strArray = s.split(",");
 		
 		for(String s1 : strArray) {
 			System.out.println(s1);
 		}
		
		return answer;
	}
}
