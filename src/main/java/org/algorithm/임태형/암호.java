package org.algorithm.임태형;

import java.io.*;

public class 암호 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String str = br.readLine();

        bw.write(solution(str));
        bw.flush();
    }

    private static String solution(String str){

        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '#'){
                sb.append("1");
            }
            else if(str.charAt(i) == '*'){
                sb.append("0");
            }
            if((i+1)%7 == 0){
                answer.append((char)Integer.parseInt(sb.toString(),2));
                sb.delete(0,sb.length());
            }
        }
        return answer.toString();
    }
}
