package com.gqt.corejava.CVStrings;

public class CommonChar {
    public static void main(String[] args) {
        String s1 = "sarath", s2 = "dasaratha";
        StringBuilder sb = new StringBuilder();
        for (char c : s1.toCharArray()) {
            if (s2.indexOf(c) != -1 && sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
