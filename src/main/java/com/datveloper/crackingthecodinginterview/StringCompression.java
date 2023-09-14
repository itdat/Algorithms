package com.datveloper.crackingthecodinginterview;

public class StringCompression {

    public static String compress(String str) {
        int countConsecutive = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;
            if (i + 1 == str.length() || str.charAt(i) != str.charAt(i + 1)) {
                stringBuilder.append(str.charAt(i)).append(countConsecutive);
                countConsecutive = 0;
            }
        }
        String compressed = stringBuilder.toString();
        return compressed.length() < str.length() ? compressed : str;
    }
}
