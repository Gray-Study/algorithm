package org.algorithm.그레이;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 공통원소_구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int[] num1Arr = new int[num1];
		for(int i = 0; i < num1; i++) {
			num1Arr[i] = sc.nextInt();
		}
		
		int num2 = sc.nextInt();
		int[] num2Arr = new int[num2];
		for(int i = 0; i < num2; i++) {
			num2Arr[i] = sc.nextInt();
		}
		
		for (int n : solution(num1, num1Arr, num2, num2Arr)) {
			System.out.print(n + " ");
		}
	}
	
	public static ArrayList<Integer> solution(int num1, int[] num1Arr, int num2, int[] num2Arr) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Arrays.sort(num1Arr);
		Arrays.sort(num2Arr);
		
		int p1 = 0, p2 = 0;
		
		while(p1 < num1 && p2 < num2) {
			if(num1Arr[p1] == num2Arr[p2]) {
				list.add(num1Arr[p1++]);
				p2++;
			}else if(num1Arr[p1] < num2Arr[p2]) {
				p1++;
			}else {
				p2++;
			}
		}
		
		return list;
	}

}
