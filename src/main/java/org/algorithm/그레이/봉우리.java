package org.algorithm.그레이;

import java.util.Scanner;

public class 봉우리 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int [][] arrNum = new int[num+2][num+2];
		//자연수 크기만큼 배열에 저장 
		for(int i = 1; i<num+1; i++) {
			for(int j = 1; j<num+1; j++) {
				arrNum[i][j] = sc.nextInt();			
			}
		}
		
		//격자의 가장 자리 0으로 초기화 
		for(int i = 0; i<num+2; i++) {
			for(int j = 0; j<num+2; j++) {
				if(i==0) {
					arrNum[i][j] = 0;
					arrNum[j][i] = 0;
				}
				if(i == num+1) {
					arrNum[i][j] = 0;
					arrNum[j][i] = 0;
				}
			}
		}
		
		System.out.println(solution(num, arrNum));
	}
	public static int solution(int num, int[][] arrNum) {
		//봉우리 갯수 저장
		int cnt = 0;
		for(int i = 1; i<num+1; i++) {
			for(int j = 1; j<num+1; j++) {
				if(
					(arrNum[i][j] > arrNum[i-1][j]) && //상 
					(arrNum[i][j] > arrNum[i][j-1]) && //좌
					(arrNum[i][j] > arrNum[i][j+1]) && //우
					(arrNum[i][j] > arrNum[i+1][j])) { //하 
					cnt++;
				}
			}
		}
		
		return cnt;
	}

}
