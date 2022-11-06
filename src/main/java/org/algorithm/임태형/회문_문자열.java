package org.algorithm.임태형;

import java.io.*;

public class 회문_문자열 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String str = br.readLine();

        bw.write(solution(str));
        bw.flush();
    }

    private static String solution(String str){

        str = str.toUpperCase();
        String result = "YES";

        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                result = "NO";
            }
        }

        return result;
    }
}
