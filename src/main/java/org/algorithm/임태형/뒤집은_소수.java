package org.algorithm.임태형;

import java.io.*;

public class 뒤집은_소수 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        char s = br.readLine().charAt(0);
        String str = br.readLine();

        bw.write(solution(str, s));
        bw.flush();
        bw.close();
    }

    private static String solution(String str, char s) {

        String[] array = str.split(" ");
        StringBuilder result = new StringBuilder();

        for(int i=0;i<array.length;i++){
            StringBuilder sb = new StringBuilder(array[i]);
            sb.reverse();
            int number = Integer.parseInt(sb.toString());
            int cnt = 0;
            for(int j=2;j<number;j++){
                if(number%j == 0){
                    cnt++;
                    break;
                }
            }
            if(cnt == 0 && number != 1){
                result.append(number+" ");
            }
        }
        System.out.println(result.toString());
        return "";
    }
}
