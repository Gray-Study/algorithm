package org.algorithm.그레이;

import java.util.Scanner;

public class 격차판_최대합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int [][] arrNum = new int[num][num];
		for(int i = 0; i<num; i++) {
			for(int j = 0; j<num; j++) {
				arrNum[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(solution(num, arrNum));

	}
	
	public static int solution(int num, int[][] arrNum) {
		int[] rowSum = new int[num];
		int[] columnSum = new int[num];
		int toRightCrossSum = 0;
		int toLeftCrossSum = 0;
		int maxSum = 0;
		for(int i=0; i<num; i++) {
			for(int j = 0; j<num; j++) {
				rowSum[i] += arrNum[i][j];
				columnSum[i] += arrNum[j][i];
				if(i==j) {
					toRightCrossSum += arrNum[i][j];
				}
				if(j+i == num-1) {
					toLeftCrossSum += arrNum[i][j];
				}
			}
			if(rowSum[i]>maxSum) {
				maxSum = rowSum[i];
			}else if(columnSum[i]>maxSum) {
				maxSum = columnSum[i];
			}
		}
		if(toRightCrossSum > maxSum) {
			maxSum = toRightCrossSum;
		}else if(toLeftCrossSum > maxSum) {
			maxSum = toLeftCrossSum;
		}
		return maxSum;
	}

}
