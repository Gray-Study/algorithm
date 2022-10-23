package org.algorithm.아아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 대소문자_변환 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        char[] chars = br.readLine().toCharArray();

        for (char c : chars) {
            solution(c);
        }
    }

    static void solution(char c) {
        if (c >= 65 && c <= 90) c += 32;
        else if (c >= 92 && c <= 122) c -= 32;
        System.out.print(c);
    }
}
