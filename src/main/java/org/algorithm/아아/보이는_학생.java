package org.algorithm.아아;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 보이는_학생 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int solution(int n, int[] arr) {
        int result = 0;
        int tmp = 0;

        for (int i = 0; i < n; i++) {
            if (tmp < arr[i]) {
                tmp = arr[i];
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        int result = solution(n, arr);

        System.out.println(result);
    }
}
