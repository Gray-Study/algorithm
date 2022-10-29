package org.algorithm.아아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문장_속_단어 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] str = br.readLine().split(" ");
        int tmp = 0;

        for (int i = 1; i < str.length; i++) {
            if (str[tmp].length() < str[i].length()) tmp = i;
        }
        System.out.println(str[tmp]);
    }
}
