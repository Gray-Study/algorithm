package org.algorithm.아아;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 점수_계산 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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

    static int solution(int n, int[] arr) {
        int result = 0;
        int tmp = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                tmp++;
                result += tmp;
            } else {
                tmp = 0;
            }
        }

        return result;
    }
}
