package org.algorithm.아아;

import java.io.*;

public class 특정_문자_뒤집기 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        char[] str = br.readLine().toCharArray();

        solution(str);
    }

    private static void solution(char[] str) throws IOException {
        int lt = 0, rt = str.length - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(str[lt])) lt++;
            else if (!Character.isAlphabetic(str[rt])) rt--;
            else {
                char tmp = str[lt];
                str[lt] = str[rt];
                str[rt] = tmp;
                lt++;
                rt--;
            }
        }

        bw.write(str);
        bw.flush();
    }
}
