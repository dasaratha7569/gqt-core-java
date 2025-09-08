package com.gqt.corejava.CVStrings;

public class DuplicateRemoval {
    public static void main(String[] args) {
        String s = "dasaratha";
        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256];
        for (char c : s.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
