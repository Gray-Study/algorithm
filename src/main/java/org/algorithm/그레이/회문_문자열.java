package org.algorithm.그레이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 회문_문자열 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		solution(str);
	}
	
	public static void solution(String str){
		str = str.toUpperCase();
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length()-1;
		
		String result = "";
		for(int i=0; i<str.length(); i++){
			if(s[lt+i] == s[rt-i]) {
				result = "YES";
			}else {
				result = "NO";
			}
		}
		System.out.println(result);
	}
	
}
