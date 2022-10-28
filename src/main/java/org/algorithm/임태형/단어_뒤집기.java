package org.algorithm.임태형;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 단어_뒤집기 {

    private static String solution(String str) {
        StringBuffer sb = new StringBuffer();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        Scanner text = new Scanner(System.in);
        int count = text.nextInt();
        if(count>=3 && count<=20){
            for(int i=0;i<count;i++) {
                list.add(text.next());
            }
            list.stream().forEach(s-> System.out.println(solution(s.toString())));
        }
        else{
            System.out.println("숫자를 다시 입력해 주세여. (3<=숫자<=20)");
        }
    }
}
