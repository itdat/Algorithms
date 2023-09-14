package com.datveloper.crackingthecodinginterview;

public class OneAway {
    public static boolean oneEditAway(String first, String second) {
        if (Math.abs(first.length() - second.length()) > 1) {
            return false;
        }
        String s1 = first.length() < second.length() ? first : second;
        String s2 = first.length() < second.length() ? second : first;
        int index1 = 0;
        int index2 = 0;
        boolean foundEdit = false;
        while (index1 < s1.length() && index2 < s2.length()) {
            if (first.charAt(index1) != second.charAt(index2)) {
                if (foundEdit) {
                    return false;
                }
                foundEdit = true;
                if (s1.length() == s2.length()) {
                    index1++;
                }
            } else {
                index1++;
            }
            index2++;
        }
        return true;
    }
}
