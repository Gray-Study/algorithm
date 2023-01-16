package org.algorithm.임태형;

import java.io.*;

public class 멘토링 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String str = br.readLine();

        String[] students = str.split(" ");

        int n = Integer.parseInt(students[0]);
        int m = Integer.parseInt(students[1]);
        int[][] arr = new int[m][n];

        for(int i=0;i<m;i++){
            str = br.readLine();
            String[] arr_ = str.split(" ");
            for(int j=0;j<n;j++){
                arr[i][j] = Integer.parseInt(arr_[j]);
            }
        }
        bw.write(solution(n,m,arr));
        bw.flush();
    }

    private static String solution(int n,int m,int[][] arr){
        int answer = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int cnt = 0;
                for(int k=0;k<m;k++){
                    int x = 0;
                    int y = 0;
                    for(int s=0;s<n;s++){
                        if(arr[k][s]==i){
                            x = s;
                        }
                        if(arr[k][s]==j){
                            y = s;
                        }
                    }
                    if(x<y){
                        cnt++;
                    }
                }
                if(cnt==m){
                    answer++;
                }
            }
        }
        return Integer.toString(answer);
    }
}
