package org.algorithm.임태형;

import java.util.Scanner;

public class 문자찾기 {

    private static int solution(String str, char c) {
        int count = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == c) count++;
        }

        return  count;
    }

    private static int solution2(String str, char c) {
        int count = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for(char t : str.toCharArray()){
            if(t == c) count++;
        }

        return  count;
    }

    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        String str = text.next();

        char c = text.next().charAt(0);
        int count = solution(str,c);
        System.out.println(count);
    }
}