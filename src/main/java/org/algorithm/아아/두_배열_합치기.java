package org.algorithm.아아;

import java.util.ArrayList;
import java.util.Scanner;

public class 두_배열_합치기 {

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

        ArrayList<Integer> result = solution(n, nArr, m, mArr);

        result.forEach(it -> System.out.print(it + " "));
    }

    static ArrayList<Integer> solution(int n, int[] nArr, int m, int[] mArr) {
        ArrayList<Integer> result = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (nArr[p1] < mArr[p2]) result.add(nArr[p1++]);
            else result.add(mArr[p2++]);
        }

        while (p1 < n) result.add(nArr[p1++]);
        while (p2 < m) result.add(mArr[p2++]);

        return result;
    }
}
