package org.algorithm.아아;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 숫자만_추출 {

    static int ASCII_ZERO = 48;
    static int ASCII_NINE = 57;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int solution(String str) {
        int number = 0;

        for (char c : str.toCharArray()) {
            if (isNumber(c)) number = number * 10 + (c - ASCII_ZERO);
        }

        return number;
    }

    static boolean isNumber(char c) {
        return c >= ASCII_ZERO && c <= ASCII_NINE;
    }

    public static void main(String[] args) throws Exception {
        String str = br.readLine();

        int result = solution(str);

        System.out.println(result);
    }
}
