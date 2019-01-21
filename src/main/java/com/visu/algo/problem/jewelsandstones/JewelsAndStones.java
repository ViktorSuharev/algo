package com.visu.algo.problem.jewelsandstones;

public class JewelsAndStones {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aaAfgdfgdfg", "aaA"));
        System.out.println(numJewelsInStones("ZZ", "z"));
    }

    public static int numJewelsInStones(String J, String S) {
        int stonesNumber = S.length();
        int jewelsNumber = 0;

        for (int i = 0; i < stonesNumber; ++i) {
            if (J.indexOf(S.charAt(i)) >= 0) {
                jewelsNumber++;
            }
        }

        return jewelsNumber;
    }
}
