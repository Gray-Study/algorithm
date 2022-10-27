package org.algorithm.그레이;

import java.util.Arrays;
import java.util.Scanner;

public class 문장_속_단어 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String[] words = str.split("\\s");
		solution(words);
	}
	
	public static void solution(String[] wds) {
		int max = 0;
		String bigStr = "";
		for(String wd : wds) {
			if(wd.length()>max) {
				max = wd.length();
				bigStr = wd;
			}
		}
		System.out.println(bigStr);
	}
}
