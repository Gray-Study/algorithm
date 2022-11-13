package org.algorithm.그레이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팰린드롬 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		solution(str);
	}
	
	public static void solution(String str){
		String ans = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) ans = "YES";
		System.out.println(ans);
		
	}
}
