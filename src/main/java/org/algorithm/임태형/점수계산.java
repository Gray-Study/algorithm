package org.algorithm.임태형;

import java.io.*;

public class 점수계산 {
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

        int point = 1;
        int score = 0;
        String[] array = str.split(" ");
        for(int i=0;i<array.length;i++){
            if(array[i].equals("1")){
                score += point;
                point++;
            }
            else{
                point = 1;
            }
        }
        return String.valueOf(score);
    }
}
