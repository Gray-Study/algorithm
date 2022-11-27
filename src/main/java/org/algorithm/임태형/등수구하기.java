package org.algorithm.임태형;

import java.io.*;

public class 등수구하기 {

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

        String[] array = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<array.length;i++){
            int cnt = 1;
            for(int j=0;j<array.length;j++){
                if(Integer.parseInt(array[i])<Integer.parseInt(array[j])){
                    cnt++;
                }
            }
            sb.append(cnt+" ");
        }

        return sb.toString();
    }
}
