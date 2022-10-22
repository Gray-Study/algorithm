package org.algorithm.아아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자찾기 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String text = br.readLine().toUpperCase();
        String n = br.readLine().toUpperCase();

        solution(text, n);
    }

    static void solution(String text, String n) throws IOException {
        String[] strings = text.split("");
        int tmp = 0;

        for (String s : strings) {
            if (s.equals(n)) tmp++;
        }

        System.out.println(tmp);
    }
}
