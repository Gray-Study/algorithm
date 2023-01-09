package org.algorithm.아아;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 중복문자제거 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static void solution(String str) {
        int length = str.length();

        for (int i = 0; i < length; i++) {
            if (str.indexOf(str.charAt(i)) == i)
                System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) throws Exception {
        String str = br.readLine();

        solution(str);
    }
}
