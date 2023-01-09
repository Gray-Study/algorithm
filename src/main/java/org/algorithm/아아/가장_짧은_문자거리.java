package org.algorithm.아아;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 가장_짧은_문자거리 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        String[] split = br.readLine().split(" ");

        String s = split[0];
        char c = split[1].charAt(0);

        int[] textDistanceArray = getTextDistanceArray(s, c);

        print(textDistanceArray);
    }

    private static int[] getTextDistanceArray(String str, char c) {
        int[] textDistanceArray = exploreFrontText(str, c);
        return exploreBackText(str, c, textDistanceArray);
    }

    private static int[] exploreFrontText(String str, char c) {
        int[] textDistanceArray = new int[str.length()];

        int tmp = 1000;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                tmp = 0;
                textDistanceArray[i] = tmp;
            } else {
                tmp++;
                textDistanceArray[i] = tmp;
            }
        }

        return textDistanceArray;
    }

    private static int[] exploreBackText(String str, char c, int[] textDistanceArray) {
        int tmp = 1000;

        for (int i = str.length() - 1; 0 <= i; i--) {
            if (str.charAt(i) == c) {
                tmp = 0;
                textDistanceArray[i] = tmp;
            } else {
                tmp++;
                textDistanceArray[i] = Math.min(tmp, textDistanceArray[i]);
            }
        }

        return textDistanceArray;
    }

    static void print(int[] result) {
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
