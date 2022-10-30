package org.algorithm.그레이;

import java.util.Scanner;

public class 특정_문자_뒤집기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		solution(str);

	}
	
	public static void solution(String str) {
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length()-1;
		while(lt < rt) {
			if(!Character.isAlphabetic(s[lt])) lt++;
			else if(!Character.isAlphabetic(s[rt])) rt--;
			else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		
		String ans = String.valueOf(s);
		System.out.println(ans);
		
	}

}
