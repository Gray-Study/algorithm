package org.algorithm.아아;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 유효한_팰린드롬 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String solution(String str) {
        String onlyAlphabet = str.toUpperCase().replaceAll("[^A-Z]", "");

        String reverseAlphabet = new StringBuilder(onlyAlphabet).reverse().toString();

        if (reverseAlphabet.equals(onlyAlphabet))
            return "YES";

        return "NO";
    }

    public static void main(String[] args) throws Exception {
        String str = br.readLine();

        String result = solution(str);

        System.out.println(result);
    }
}
