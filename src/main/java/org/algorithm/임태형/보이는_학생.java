package org.algorithm.임태형;

import java.io.*;

public class 보이는_학생 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        char s = br.readLine().charAt(0);
        String str = br.readLine();

        bw.write(solution(str,s));
        bw.flush();
        bw.close();
    }

    private static String solution(String str,char s){

        String[] sArray = str.split(" ");
        int point = Integer.parseInt(sArray[0]);
        int cnt = 1;
        for(int i=1;i<sArray.length;i++) {
            if (point < Integer.parseInt(sArray[i])) {
                cnt++;
                point = Integer.parseInt(sArray[i]);
            }
        }
        return Integer.toString(cnt);
    }
}
