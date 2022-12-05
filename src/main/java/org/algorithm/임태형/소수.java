package org.algorithm.임태형;

import java.io.*;

public class 소수 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String str = br.readLine();

        bw.write(solution(str));
        bw.flush();
        bw.close();
    }

    private static String solution(String str){

        int n = Integer.parseInt(str);
        int[] arr = new int[n];
        int result = 0;
        for(int i=2;i<n;i++){
            if(arr[i] == 0){
                result++;
                for(int j=i;j<n;j=j+i){
                    arr[j] = 1;
                }
            }
        }
        return String.valueOf(result);
    }
}
