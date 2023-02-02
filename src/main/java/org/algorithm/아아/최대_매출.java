package org.algorithm.아아;

import java.util.Scanner;

public class 최대_매출 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = solution(n, k, arr);

        System.out.println(result);
    }

    static int solution(int n, int k, int[] arr) {
        int result, sum = 0;

        for (int i = 0; i < k; i++)
            sum += arr[i];

        result = sum;
        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k];
            result = Math.max(result, sum);
        }

        return result;
    }
}
