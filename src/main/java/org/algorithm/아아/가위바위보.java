package org.algorithm.아아;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 가위바위보 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());
        String[] aText = br.readLine().split(" ");
        String[] bText = br.readLine().split(" ");

        int[] arrA = init(n, aText);
        int[] arrB = init(n, bText);

        solution(n, arrA, arrB);
    }

    static void solution(int n, int[] arrA, int[] arrB) {
        for (int i = 0; i < n; i++) {
            switch (arrA[i] - arrB[i]) {
                case 0 -> System.out.println("D");
                case 1, -2 -> System.out.println("A");
                default -> System.out.println("B");
            }
        }
    }

    static int[] init(int n, String[] str) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        return arr;
    }
}
