package org.algorithm.아아;

import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

public class 임시반장_정하기 {

    static Scanner sc = new Scanner(System.in);

    static final int MAX_SCHOOL_YEAR = 5;

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] arr = new int[n][MAX_SCHOOL_YEAR];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < MAX_SCHOOL_YEAR; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = solution(n, arr);

        System.out.println(result);
    }

    static int solution(int n, int[][] arr) {
        int result = 0, max = MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int tmp = 0;

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < MAX_SCHOOL_YEAR; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        tmp++;
                        break;
                    }
                }
            }

            if (tmp > max) {
                max = tmp;
                result = i + 1;
            }
        }

        return result;
    }
}
