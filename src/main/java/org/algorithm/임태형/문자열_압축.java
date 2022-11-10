package org.algorithm.임태형;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class 문자열_압축 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String str = br.readLine();

        bw.write(solution(str));
        bw.flush();
    }

    private static String solution(String str){
        StringBuilder sb = new StringBuilder();
        str = str+" ";
        int cnt = 1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i) == str.charAt(i+1)){
                cnt++;
            }
            else{
                sb.append(str.charAt(i));
                if(cnt != 1){
                    sb.append(String.valueOf(cnt));
                }
                cnt = 1;
            }
        }
        return sb.toString();
    }
}
