package org.algorithm.그레이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 암호 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt( br.readLine());
		String str = br.readLine();
		solution(num, str);
		
	}
	
	public static void solution(int n, String s) {
		String ans="";
		for(int i=0; i<n; i++) {
			String tmp = s.substring(0,7).replace('#','1').replace('*','0');
			int num = Integer.parseInt(tmp, 2);
			ans+=(char)num;
			s = s.substring(7);
		}
		System.out.println(ans);
		
	}
}
