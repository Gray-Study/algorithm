package org.algorithm.그레이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class 뒤집은_소수 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        solution(n,arr);
        System.out.println();
    }

    private static void solution(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            StringBuilder tmp = new StringBuilder(""+num);

            String s = tmp.reverse().toString();
            int tmpNum = Integer.parseInt(s);

            if(isPrime(tmpNum)) {
            	System.out.print(tmpNum+" ");
                
            }    
        }
    }
    
    private static boolean isPrime(int tmpNum) {
    	if(tmpNum==1) {
    		return false;

    	}
    	for(int i=2; i<tmpNum;i++) {
    		if(tmpNum%i == 0) {
    			return false;
    		}
    	}
    	return true;
    }
}
