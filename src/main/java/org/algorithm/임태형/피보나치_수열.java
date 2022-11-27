package org.algorithm.임태형;

import java.io.*;
import java.util.ArrayList;

public class 피보나치_수열 {
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        public static void main(String[] args) throws IOException {

            String str = br.readLine();

            bw.write(solution(str));
            bw.flush();
            bw.close();
        }

        private static String solution(String str) {

            int n = Integer.parseInt(str);
            ArrayList<String> array = new ArrayList<>();

            array.add("1");
            array.add("1");

            for(int i=2;i<n;i++){
                array.add(String.valueOf(Integer.parseInt(array.get(i-2))+Integer.parseInt(array.get(i-1))));
            }
            String result_ = array.toString();
            result_ = result_.substring(1,result_.length()-1).replaceAll(",","");
            return  result_;
        }
}
