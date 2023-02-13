package org.algorithm.아아;

import java.util.Scanner;

public class 연속_부분수열 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = solution(n, m, arr);

        System.out.println(result);
    }

    static int solution(int n, int m, int[] arr) {
        int count = 0, lt = 0, tmp = 0;

        for (int rt = 0; rt < n; rt++) {
            tmp += arr[rt];
            if (tmp == m) count++;

            while (tmp >= m) {
                tmp -= arr[lt++];
                if (tmp == m) count++;
            }
        }

        return count;
    }
}
