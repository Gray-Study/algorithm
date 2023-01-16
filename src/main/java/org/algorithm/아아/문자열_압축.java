package org.algorithm.아아;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 문자열_압축 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String solutions(String str) {
        String result = "";
        int count = 0;

        for (int i = 1; i < str.length(); i++) {
            char indexChar = str.charAt(i);
            char beforeIndexChar = str.charAt(i - 1);
            str += " ";

            if (indexChar == beforeIndexChar)
                count++;
            else {
                result += beforeIndexChar;

                if (count > 0) {
                    result += count + 1;
                    count = 0;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        String str = br.readLine();

        String result = solutions(str);

        System.out.println(result);
    }
}
