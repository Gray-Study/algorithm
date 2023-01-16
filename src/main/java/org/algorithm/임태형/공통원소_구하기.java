package org.algorithm.임태형;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class 공통원소_구하기 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String str = br.readLine();
        int n = Integer.parseInt(str);
        str = br.readLine();
        String[] arrS= str.split(" ");
        Integer[] arr1 = Stream.of(arrS).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        str = br.readLine();
        int m = Integer.parseInt(str);
        str = br.readLine();
        String[] arrS2= str.split(" ");
        Integer[] arr2 = Stream.of(arrS2).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

        bw.write(String.valueOf(solution(arr1,arr2)));
        bw.flush();
    }

    private static String solution(Integer[] arr1,Integer[] arr2) {
        List<Integer> list1 = new ArrayList(Arrays.asList(arr1));
        List<Integer> list2 = new ArrayList(Arrays.asList(arr2));
        List<Integer> answerlist = new ArrayList();
        list1.addAll(list2);
        Collections.sort(list1);

        int before = -1;
        for(Integer data: list1){
            if(before == data){
                answerlist.add(data);
            }
            before = data;
        }

        for(Integer data: answerlist){
            System.out.print(data+" ");
        }
        return "";
    }
}
