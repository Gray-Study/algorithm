package org.algorithm.그레이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치_수열 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		solution(num);

	}
	
	public static void solution(int n) {
		int[] arr = new int[n];
		arr[0] = 1;
		arr[1] = 1;
		for(int i=2; i<n; i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		for(int a : arr) {
			System.out.print(a+" ");
		}
	}

}
