package org.algorithm.그레이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자만_추출 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		solution(str);
	}
	
	public static void solution(String str){
		String strNum = str.replaceAll("[^0-9]", "");
		int intNum = Integer.parseInt(strNum);
		System.out.println(intNum);
	}
}
