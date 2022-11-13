package org.algorithm.그레이;

import java.util.Scanner;

public class 보이는_학생 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] numArr = new int[num];
		for(int i=0; i< num; i++) {
			numArr[i] = sc.nextInt();
		}
		solution(num, numArr);
	}
	public static void solution(int n, int[] na) {
		
		int max = na[0];
		int ans = 1;
		for(int i=1; i<n; i++) {
			if(na[i]>max) {
				ans++;
				max = na[i];
			}
		}
		System.out.println(ans);
	}
}
