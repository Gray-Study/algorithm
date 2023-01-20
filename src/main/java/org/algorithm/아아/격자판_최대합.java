package org.algorithm.아아;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 격자판_최대합 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());
        String[][] str = new String[n][n];

        for (int i = 0; i < n; i++) {
            str[i] = br.readLine().split(" ");
        }

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(str[i][j]);
            }
        }

        int answer = solution(n, arr);

        System.out.println(answer);
    }

    static int solution(int n, int[][] arr) {
        int answer = 0;

        answer = rowsAndColumnsSum(n, arr, answer);

        answer = diagonalsSum(n, arr, answer);

        return answer;
    }

    private static int diagonalsSum(int n, int[][] arr, int answer) {
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - 1 - i];
        }

        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    private static int rowsAndColumnsSum(int n, int[][] arr, int answer) {
        for (int i = 0; i < n; i++) {
            int sum1 = 0, sum2 = 0;

            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }

            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        return answer;
    }
}
