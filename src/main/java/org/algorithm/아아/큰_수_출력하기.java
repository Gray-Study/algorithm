package org.algorithm.아아;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 큰_수_출력하기 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String solution(int n, int[] arr) {
        String result = arr[0] + " ";

        for (int i = 1; i < n; i++) {
            int num = arr[i];
            int beforeNum = arr[i - 1];
            if (num > beforeNum) result += num + " ";
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

        String result = solution(n, arr);

        System.out.println(result);
    }
}
