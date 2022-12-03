package org.algorithm.그레이;

import java.io.IOException;
import java.util.Scanner;

public class 점수계산 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] str = new String[num];
		for(int i = 0; i < num; i++) {
			str[i] = sc.next();
		}
		solution(num, str);	
	}
	public static void solution(int num, String[] str) {
		int[] score = new int[num];
		int plus = 1;
		for(int i=0; i<num; i++) {
			if (Integer.parseInt(str[i]) == 1) {
				if(plus == 0) plus = 1;
				score[i] += plus;
				plus++;
				
			}else {
				plus = 0;
				score[i] += plus;
			}
		}
		int total_score = 0;
		for(int s : score) {
			total_score += s;	
		}
		System.out.print(total_score);
	}
}
