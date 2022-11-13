package org.algorithm.임태형;

import java.io.*;

public class 유요한_팰리드롬 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String str = br.readLine();

        bw.write(solution(str));
        bw.flush();
    }

    private static String solution(String str){

        str = str.toUpperCase().replaceAll("[^A-Z]","");
        StringBuilder sb= new StringBuilder(str);
        String result = "NO";

        if(sb.reverse().toString().equals(str)){
            result = "YES";
        }

        return result;
    }
}
