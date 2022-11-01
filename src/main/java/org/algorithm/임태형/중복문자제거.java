package org.algorithm.임태형;

import java.io.*;
import java.util.LinkedHashSet;


public class 중복문자제거 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String str = br.readLine();

        bw.write(solution(str));
        bw.flush();

    }

    private static String solution(String str){
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();

        for(int i=0;i<str.length();i++){
            lhs.add(str.charAt(i));
        }
        String result = lhs.toString()
                .substring(1, 3*lhs.size()-1)
                .replaceAll(", ", "");
        return result;
    }
}
