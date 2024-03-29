package org.algorithm.아아;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 등수_구하기 {

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
            int tmp = 0;

            for (int j = 0; j < n; j++) {
                if (j != i) {
                    if (arr[i] >= arr[j]) {
                        tmp++;
                    }
                }
            }

            System.out.print(n - tmp + " ");
        }
    }
}
