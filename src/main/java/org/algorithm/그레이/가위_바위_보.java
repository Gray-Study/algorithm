package org.algorithm.그레이;

import java.util.Scanner;

public class 가위_바위_보 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] numA = new int[num];
		int[] numB = new int[num];
		for(int i=0; i<num; i++) {
			numA[i] = sc.nextInt();
		}
		for(int i=0; i<num; i++) {
			numB[i] = sc.nextInt();
		}
		solution(num, numA, numB);
	}
	public static void solution(int n, int[] a, int[] b) {
		String ans="";
		for(int i=0; i<n; i++) {
			if(a[i]==b[i]) {
				ans+="D";
			}else if(a[i]==1 && b[i]==3) {
				ans+="A";
			}else if(a[i]==2 && b[i]==1) {
				ans+="A";
			}else if(a[i]==3 && b[i]==2) {
				ans+="A";
			}else {
				ans+="B";
			}
		}
		for(char x : ans.toCharArray()) {
			System.out.println(x);
		}
	}
}