package org.algorithm.그레이;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 두_배열_합치기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int [] num1Arr = new int[num1];
		for(int i = 0; i < num1; i++) {
			num1Arr[i] = sc.nextInt();
		}
		
		int num2 = sc.nextInt();
		int [] num2Arr = new int[num2]; 
		for(int i = 0; i < num2; i++) {
			num2Arr[i] = sc.nextInt();
		}
		for (int n : solution(num1,num1Arr,num2,num2Arr)) {
			System.out.print(n + " ");
		}
	}
	
	public static ArrayList<Integer> solution(int num1, int[] num1Arr, int num2, int[] num2Arr) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int n1 : num1Arr) {
			list.add(n1);
		}
		for(int n2 : num2Arr) {
			list.add(n2);
		}
		
		Collections.sort(list);
		return list;
	}

}
