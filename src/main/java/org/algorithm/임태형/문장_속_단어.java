package org.algorithm.임태형;

import java.util.*;


public class 문장_속_단어 {

    private static String solution(String str) {
        String[] array = str.split(" ");
        String result = "";
        result= Arrays.stream(array).sorted(Comparator.comparing(String::length).reversed()).findFirst().get();
        return result;
    }

    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        String str = text.nextLine();

        System.out.println(solution(str));
    }
}
