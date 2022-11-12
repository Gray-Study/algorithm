package org.algorithm.임태형;

import java.io.*;

public class 큰_수_출력하기 {

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

        StringBuilder sb = new StringBuilder();
        str = "0 " + str;
        String[] sArray = str.split(" ");

        for(int i=1;i<sArray.length;i++){
            if(Integer.parseInt(sArray[i-1]) < Integer.parseInt(sArray[i])){
                sb.append(sArray[i]+" ");
            }
        }

        return  sb.toString().substring(0, sb.length() - 1);
    }
}
