package org.algorithm.임태형;

import java.io.*;
import java.util.Scanner;

public class 가장_짧은_문자거리 {

    public static void main(String[] args) throws IOException {

        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char s = kb.next().charAt(0);
        solution(str,s);
        for (int i : solution(str,s)){
            System.out.print(i+" ");
        }
    }
    private static int[] solution(String str,char s){

        int[]  answer =  new int[str.length()];
        int position = -1000;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==s){
                answer[i] =0;
                position = i+1;
            }
            else{
                int min1 = i-position;
                int min2 = 0;
                if(str.indexOf(s,position)==-1) {
                    min2 = 1000;
                }
                else{
                    min2 =str.indexOf(s,position)-i;
                }
                if(min1<min2){
                    answer[i]= i-position+1;
                }
                else {
                    answer[i]= min2;
                }
            }
        }
        return answer;
    }
}
