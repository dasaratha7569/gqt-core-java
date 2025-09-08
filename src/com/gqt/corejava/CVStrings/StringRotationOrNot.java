package com.gqt.corejava.CVStrings;

public class StringRotationOrNot {
    public static void main(String[] args) {
        String s1 = "abcde", s2 = "cdeab";
        boolean result = s1.length() == s2.length() && (s1 + s1).contains(s2);
        System.out.println(result);
    }
}
