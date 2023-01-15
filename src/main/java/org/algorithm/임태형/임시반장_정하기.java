package org.algorithm.임태형;

import java.io.*;

public class 임시반장_정하기 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n+1][6];
        for(int i=1;i<n+1;i++){
            String s = br.readLine();
            String[] stingArr = s.split(" ");
            for(int j=1;j<6;j++){
                arr[i][j] = Integer.parseInt(stingArr[j-1]);
            }
        }
        bw.write(String.valueOf(solution(n,arr)));
        bw.flush();
    }
    private static int solution(int n, int[][] arr) {

        int result = 0;
        int max = 0;

        for(int i=1;i<n+1;i++) {
            int count = 0;
            for(int j=1;j<n+1;j++){
                for(int k=1;k<6;k++) {
                    if (arr[i][k] == arr[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            if(count>max){
                max = count;
                result = i;
            }
        }

        return result;
    }
}
