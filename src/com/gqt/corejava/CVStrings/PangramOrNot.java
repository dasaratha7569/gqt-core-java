package com.gqt.corejava.CVStrings;

public class PangramOrNot {
    public static void main(String[] args) {
        String s = "My name is dasaratha Reddy".toLowerCase();
        boolean isPangram = true;
        for (char c = 'a'; c <= 'z'; c++) {
            if (s.indexOf(c) == -1) {
                isPangram = false;
                break;
            }
        }
        System.out.println(isPangram);
    }
}

