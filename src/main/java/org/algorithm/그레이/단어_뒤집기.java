package org.algorithm.그레이;

import java.util.ArrayList;
import java.util.Scanner;

public class 단어_뒤집기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] str = new String[num];
		for(int i = 0; i < num; i++) {
			str[i] = sc.next();
		}
		solution(num, str);	
	}
	
	public static void solution(int num, String[] str) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> reArr = new ArrayList<>();
		
		for(int i = 0; i < num; i++) {
			String reverse = "";
			for(int j = str[i].length()-1; j>=0; j--) {
				reverse = reverse + str[i].charAt(j);
			}
			reArr.add(reverse);
		}
		
		for(String x : reArr) {
			System.out.println(x);
		}
	}

}
