package org.algorithm.그레이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소수 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		solution(num);
	}
	public static void solution(int n) {
		int cnt = 0;
		int[] arr = new int[n+1];
		for(int i=2; i<=n; i++) {
			if(arr[i] == 0) { //소수
				cnt++;
				for(int j=i; j<=n; j=j+i) {
					arr[j] = 1;
				}
			}
		}
		
		System.out.println(cnt);
	}
}
