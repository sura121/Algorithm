package sura.org.kakao;

import java.awt.Point;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Tuple {
	public static void main(String[] args) {
		Tuple sol = new Tuple();
		
		String s = "{{4,2,3},{3},{2,3,4,1},{2,3}}"; 
		sol.solution(s);
		
	}
	
	/*
	 * String -> Array 변환
	 * 2차원 배열에 대한 length 순서로 peak
	 */
	public int[]  solution(String s)
	{
		int[] answer = {};
		
		String newS = s.substring(1,s.length()-1);
//		System.out.println(newS);
 		String[] strArray = newS.split("},");
 		
 		int arraySize = strArray.length;
 		
 		for(int i = 0; i < arraySize; i++) {
 			strArray[i] = strArray[i].trim().replaceAll("\\{|\\}","");
 		}
 		
 		answer = new int[arraySize];
 		
 		Arrays.sort(strArray, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				
				return Integer.compare(o1.length(), o2.length());
			}
		});
 		
 		System.out.println("Sort Array Str : " + Arrays.toString(strArray));
 		
 		int sizeIndex = 0;
 		
 		for (String s2 : strArray) {
			String[] parseStr = s2.split(",");
			
			for (String s3 : parseStr) {
				
				int parseS3 = Integer.parseInt(s3);
				if(!IntStream.of(answer).anyMatch(x->x==parseS3)) {
					System.out.println("Size Index : " + sizeIndex + " value : " + parseS3);
					answer[sizeIndex]=Integer.parseInt(s3);
				}

			}
			sizeIndex++;
		}
 		
 		System.out.println(Arrays.toString(answer));
 	
		
		return answer;
	}
}