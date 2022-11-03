package org.algorithm.그레이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 중복_문자_제거 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		solution(str);
	}
	
	public static void solution(String str){
		String ans = "";
		for(int i=0; i<str.length(); i++) {
			if(str.indexOf(str.charAt(i))==i) {
				ans += str.charAt(i);
			}
		}
		System.out.println(ans);
	}
}
