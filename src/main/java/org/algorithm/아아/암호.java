package org.algorithm.아아;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 암호 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String solution(int n, String str) {
        String result = "";
        str = str.replaceAll("#", "1").replaceAll("\\*", "0");

        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7);
            int num = Integer.parseInt(tmp, 2);
            result += (char) num;
            str = str.substring(7);
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        String result = solution(n, str);

        System.out.println(result);
    }
}
