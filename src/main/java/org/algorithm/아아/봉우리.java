package org.algorithm.아아;

import java.util.Scanner;

public class 봉우리 {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] arr = initArray(n);

        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = solution(arr);

        System.out.println(result);
    }

    static int solution(int[][] arr) {
        int tmp = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                if (validate(arr, i, j)) tmp++;
            }
        }

        return tmp;
    }

    static boolean validate(int[][] arr, int i, int j) {
        return (arr[i][j] > arr[i - 1][j]
                && arr[i][j] > arr[i][j - 1]
                && arr[i][j] > arr[i + 1][j]
                && arr[i][j] > arr[i][j + 1]);
    }

    static int[][] initArray(int n) {
        int[][] arr = new int[n + 2][n + 2];

        for (int i = 0; i < n; i++) {
            arr[0][i] = 0;
            arr[i][0] = 0;
            arr[n - 1][i] = 0;
            arr[i][n - 1] = 0;
        }

        return arr;
    }
}
