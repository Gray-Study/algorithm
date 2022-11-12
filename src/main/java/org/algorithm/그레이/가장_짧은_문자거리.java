package org.algorithm.그레이;

import java.util.Scanner;

public class 가장_짧은_문자거리 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		
		solution(str, c);

	}
	
	public static void solution(String str, char c){
		int[] ans = new int[str.length()];
		int p = 1000;
		for(int i =0; i<str.length(); i++) {
			if(str.charAt(i) == c) {
				p=0;
				ans[i]=p;
			}
			else {
				p++;
				ans[i]=p;
			}
		}
		p = 1000;
		for(int i = str.length()-1; i>=0; i--) {
			if(str.charAt(i) == c) {
				p=0;
			}
			else {
				p++;
				ans[i]=Math.min(ans[i], p);
			}
		}
		
		for(int a : ans) {
			System.out.print(a+" ");
		}
	}
}
