package org.algorithm.임태형;

import java.util.Scanner;

public class 대소문자_변환 {

    enum Alphabet{
        A("A","a"),B("B","b"),C("C","c"),D("D","d"),
        E("E","e"),F("F","f"),G("G","g"),H("H","h"),
        I("I","i"),J("J","j"),K("K","k"),L("L","l"),
        M("M","m"),N("N","n"),O("O","o"),P("P","p"),
        Q("Q","q"),R("R","r"),S("S","s"),T("T","t"),
        U("U","u"),V("V","v"),W("W","w"),X("X","x"),
        Y("Y","y"),Z("Z","z");

        private final String upperCase;
        private final String lowerCase;

        Alphabet(String upperCase,String lowerCase) {
            this.upperCase = upperCase;
            this.lowerCase = lowerCase;
        }

        public static String changeCase(char c){

            Alphabet[] Alphabets= Alphabet.values();
            String result = "";

            for(int i=0;i<Alphabets.length;i++){
                if(Alphabets[i].lowerCase.equals(String.valueOf(c))) result = Alphabets[i].upperCase;
                else if(Alphabets[i].upperCase.equals(String.valueOf(c))) result = Alphabets[i].lowerCase;
            }
            return result;
        }
    }

    private static String solution(String str) {

        StringBuffer sb = new StringBuffer();
        for(int i=0;i<str.length();i++){
            sb.append(Alphabet.changeCase(str.charAt(i)));
        }
        return sb.toString();
    }

    private static String solution2(String str) {

        StringBuffer sb = new StringBuffer();
        for(int i=0;i<str.length();i++){

        }
        return sb.toString();
    }


    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        String str = text.next();

        System.out.println(solution(str));
    }
}
