package org.algorithm.임태형;

import java.util.*;

public class 특정_문자_뒤집기 {
    private static String solution(String str) {

        String answer;
        char[] s = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;
        while(lt<rt){
            if(String.valueOf(str.charAt(lt)).matches("[^a-zA-Z]")) lt++;
            else if(String.valueOf(str.charAt(rt)).matches("[^a-zA-Z]")) rt--;
            else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;

            }
        }
        answer = String.valueOf(s);
        return  answer;
    }

    public static void main(String[] args) {

        Scanner text = new Scanner(System.in);
        String str = text.next();

        System.out.println(solution(str));
    }
}
