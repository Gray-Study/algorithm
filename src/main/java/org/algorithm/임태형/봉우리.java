package org.algorithm.임태형;

import java.io.*;

public class 봉우리 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n+2][n+2];
        for(int i=1;i<n+1;i++){
            String s = br.readLine();
            String[] stingArr = s.split(" ");
            for(int j=1;j<n+1;j++){
                arr[i][j] = Integer.parseInt(stingArr[j-1]);
            }
        }
        bw.write(String.valueOf(solution(n,arr)));
        bw.flush();
    }

    private static int solution(int n,int[][] arr) {

        int count = 0;
        for(int i=1;i<n+1;i++){
            int max = 0;
            for(int j=1;j<n+1;j++){
                if(arr[i][j]>arr[i-1][j] && arr[i][j]>arr[i][j-1] && arr[i][j]>arr[i+1][j] && arr[i][j]>arr[i][j+1]){
                    count ++;
                }
            }
        }

        return count;
    }
}
