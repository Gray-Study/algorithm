package org.algorithm.아아;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 뒤집은_소수 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        solution(n, arr);
    }

    static void solution(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            int reverseNum = reverseNum(arr[i]);

            if (isPrime(reverseNum))
                System.out.printf(reverseNum + " ");

        }
    }

    static int reverseNum(int num) {
        int reverseNum = 0;

        while (num > 0) {
            int t = num % 10;
            reverseNum = reverseNum * 10 + t;
            num = num / 10;
        }
        return reverseNum;
    }

    static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
