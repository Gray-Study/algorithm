package org.algorithm.아아;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 공통원소_구하기 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] mArr = new int[m];
        for (int i = 0; i < m; i++) {
            mArr[i] = sc.nextInt();
        }

        for (int i : solution(n, nArr, m, mArr)) System.out.print(i + " ");
    }

    static List<Integer> solution(int n, int[] nArr, int m, int[] mArr) {
        ArrayList<Integer> result = new ArrayList<>();
        int p1 = 0, p2 = 0;

        Arrays.sort(nArr);
        Arrays.sort(mArr);

        while (p1 < n && p2 < m) {
            if (nArr[p1] == mArr[p2]) {
                result.add(nArr[p1++]);
                p2++;
            } else if (nArr[p1] < mArr[p2]) p1++;
            else p2++;
        }

        return result;
    }
}
