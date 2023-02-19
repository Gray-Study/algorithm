package org.algorithm.그레이;

import java.util.Scanner;

public class 최대_매출 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(n, k, arr));
	}
	
	public static int solution(int n, int k, int[] arr) {
		int ans = 0, sum = 0;
		for(int i=0; i<k; i++) sum+=arr[i];
		ans = sum;
		for(int i=k; i<n; i++) {
			sum+=(arr[i]-arr[i-k]);
			ans = Math.max(ans, sum);
		}
		
		return ans;
	}
}
