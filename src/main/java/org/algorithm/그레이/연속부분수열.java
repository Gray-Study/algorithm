package org.algorithm.그레이;

import java.util.Scanner;

public class 연속부분수열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(n, m, arr));
	}
	
	public static int solution(int n, int m, int[] arr) {
		int cnt=0;
		
		for(int i=0; i<n; i++) {
			int sum=0;
			for(int j=i; j<n; j++) {
				sum += arr[j];
				if(sum > m) {
					break;
				}else if(sum == m) {
					cnt++;
				}
			}
		}
		return cnt;
	}

}
