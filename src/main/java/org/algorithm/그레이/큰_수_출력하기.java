package org.algorithm.그레이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class 큰_수_출력하기 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		int num = sc.nextInt();
		int[] numArr = new int[num];
		for(int i=0; i< num; i++) {
			numArr[i] = sc.nextInt();
		}
		
		solution(num, numArr);
	}
	
	public static void solution(int n, int[] na) {
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(na[0]);
		for(int i=1; i<n; i++) {
			if(na[i]>na[i-1]) {
				ans.add(na[i]);
			}
		}
		for(int x : ans) {
			System.out.print(x+" ");
		}
	}
}
