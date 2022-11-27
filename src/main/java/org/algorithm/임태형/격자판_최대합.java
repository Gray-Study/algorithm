package org.algorithm.임태형;

import java.io.*;

public class 격자판_최대합 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int s = (int)br.readLine().charAt(0)-48;
        int[][] array = new int[s][s];
        for(int i=0;i<s;i++){
            String str = br.readLine();
            String[] arrayS = str.split(" ");
            for(int j=0;j<arrayS.length;j++) {
                array[i][j] = Integer.parseInt(arrayS[j]);
            }
        }

        bw.write(solution(array));
        bw.flush();
        bw.close();
    }

    private static String solution(int[][] array) {
        int max = 0;
        int s = array.length;
        int positive = 0;
        int negative = 0;
        //가로 세로
        for(int i=0;i<s;i++){
            int w = 0;
            int h = 0;
            for(int j=0;j<s;j++){
                w += array[i][j];
                h += array[j][i];
            }
            if(max<w){
                max = w;
            }
            if(max<h){
                max = h;
            }
            //대각선
            positive += array[i][i];
            negative += array[i][s-i-1];
        }
        if(max<positive){
            max = positive;
        }
        if(max<negative){
            max = negative;
        }

        return max+"";
    }
}
