package org.algorithm.임태형;

import java.io.*;

public class 격자판_최대합 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            String s = br.readLine();
            String[] stingArr = s.split(" ");
            for(int j=0;j<n;j++){
                arr[i][j] = Integer.parseInt(stingArr[j]);
            }
        }
        bw.write(String.valueOf(solution(n,arr)));
        bw.flush();
    }

    private static int solution(int n,int[][] arr) {
        int max = 0;
        int positiveDiagonal = 0;
        int negativeDiagonal = 0;

        for(int i=0;i<n;i++){
            int width = 0;
            int height = 0;

            for(int j=0;j<n;j++){
                width += arr[i][j];
                height += arr[j][i];
            }
            if(max<width){
                max = width;
            }
            if(max<height){
                max = height;
            }
            positiveDiagonal += arr[i][i];
            negativeDiagonal += arr[n-i-1][i];
        }
        if(max<positiveDiagonal){
            max = positiveDiagonal;
        }
        if(max<negativeDiagonal){
            max = negativeDiagonal;
        }
        return max;
    }
}