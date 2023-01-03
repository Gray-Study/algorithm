package org.algorithm.아아;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 회문문자열 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String solution(String str) {
        char[] chars = str.toUpperCase().toCharArray();
        int lastIndex = str.length() - 1;

        for (int i = 0; i <= lastIndex; i++) {
            if (chars[i] != chars[lastIndex-i]) return "NO";
        }

        return "YES";
    }

    public static void main(String[] args) throws Exception {
        String str = br.readLine();

        String result = solution(str);

        System.out.println(result);
    }
}
