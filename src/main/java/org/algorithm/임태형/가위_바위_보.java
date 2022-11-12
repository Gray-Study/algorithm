package org.algorithm.임태형;

import java.io.*;

public class 가위_바위_보 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        char s = br.readLine().charAt(0);
        String str1 = br.readLine();
        String str2 = br.readLine();

        solution(str1,str2,s);
    }

    private static void solution(String str1,String str2,char s){

        String[] aArray = str1.split(" ");
        String[] bArray = str2.split(" ");

        for(int i=0;i<aArray.length;i++){
            int winValue = Integer.parseInt(aArray[i])-Integer.parseInt(bArray[i]);
            if(winValue == 1 || winValue == -2){
                System.out.println("A");
            }
            else if(winValue == 0){
                System.out.println("D");
            }
            else{
                System.out.println("B");
            }
        }
    }
}
