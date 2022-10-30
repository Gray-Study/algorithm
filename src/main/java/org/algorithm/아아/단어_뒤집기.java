package org.algorithm.아아;

import java.io.*;

public class 단어_뒤집기 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] str = init();

        solution(str);

        bw.flush();
    }

    private static String[] init() throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = br.readLine();
        }

        return str;
    }

    private static void solution(String[] str) throws IOException {
        for (String s : str) {
            int sLength = s.length() - 1;

            for (int j = sLength; j != -1; j--) {
                bw.write(s.charAt(j));
            }

            bw.write("\n");
        }
    }
}
