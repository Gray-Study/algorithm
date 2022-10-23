package org.algorithm.그레이;

import java.util.Scanner;

public class 문자찾기 {
	
	public static void main(String[] args) {
		Scanner text = new Scanner(System.in);
		String str = text.next();
		
		char c = text.next().charAt(0);
		int count = solution(str,c);
		System.out.println(count);	
	}

	public static int solution(String str, char t) {
		int cnt = 0;
		
		str=str.toUpperCase();
		t=Character.toUpperCase(t);
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==t) cnt++;
		}
		
		return cnt;
	}
}
