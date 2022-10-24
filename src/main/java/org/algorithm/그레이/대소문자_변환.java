package org.algorithm.그레이;

import java.util.Scanner;

public class 대소문자_변환 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		System.out.print(solution(text));
	}
	
	public static String solution(String str) {
		String ans = "";
		for(char s : str.toCharArray()) {
			if( s >= 'A' && s <= 'Z') {
				s+=32;
			}else if (s >='a' && s <= 'z'){
				s-=32;
			}
			ans += s;
		}
		return ans;
	}

}
