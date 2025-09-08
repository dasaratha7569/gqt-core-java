package com.gqt.corejava.CVStrings;

import java.util.*;

public class SmallestWindow {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        if (s.length() < t.length()) {
            System.out.println("");
            return;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        int left = 0, count = 0, minLen = Integer.MAX_VALUE, start = 0;
        Map<Character, Integer> window = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (map.containsKey(c) && window.get(c) <= map.get(c)) count++;
            while (count == t.length()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                char lc = s.charAt(left);
                window.put(lc, window.get(lc) - 1);
                if (map.containsKey(lc) && window.get(lc) < map.get(lc)) count--;
                left++;
            }
        }
        System.out.println(minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen));
    }
}

