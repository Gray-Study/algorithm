package org.algorithm.임태형;

import java.io.*;

public class 숫자만_추출 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String str = br.readLine();

        bw.write(solution(str));
        bw.flush();
    }
    private static String solution(String str){
        str = str.replaceAll("[^0-9]","");
        return String.valueOf(Integer.parseInt(str));
    }
}
