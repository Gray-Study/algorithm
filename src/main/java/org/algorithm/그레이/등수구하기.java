package org.algorithm.그레이;

import java.util.Scanner;

public class 등수구하기 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num  = sc.nextInt();
		int[] str = new int[num];
		for(int i = 0; i < num; i++) {
			str[i] = sc.nextInt();
		}
		
		for(int score : solution(num, str)) {
			System.out.print(score + " "); 
		}
	}
	
	public static int[] solution(int n, int[] s) {
		int[] scoreArr = new int[n];
		
		for(int i=0; i<n; i++) {
			int score = 1;
			for(int k=0; k<n; k++) {
				if(s[k] > s[i]) {
					score++;
				}
			}
			scoreArr[i] = score;
		}
		
		return scoreArr;
	}
}
