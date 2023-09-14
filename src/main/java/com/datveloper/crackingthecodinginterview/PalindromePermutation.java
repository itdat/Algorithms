package com.datveloper.crackingthecodinginterview;

public class PalindromePermutation {

    public static class Solution1 {
        public static boolean isPermutationOfPalindrome(String phrase) {
            int[] frequencyTable = createFrequencyTable(phrase);
            return checkAllEvenOrSingleOdd(frequencyTable);
        }
    }

    public static class Solution2 {
        public static boolean isPermutationOfPalindrome(String phrase) {
            int[] table = new int[26];
            int countOdd = 0;
            for (char c : phrase.toCharArray()) {
                int i = getCharCode(c);
                if (i != -1) {
                    table[i]++;
                    if (table[i] % 2 != 0) {
                        countOdd++;
                    } else {
                        countOdd--;
                    }
                }
            }
            return countOdd <= 1;
        }
    }

    public static class Solution3 {
        public static boolean isPermutationOfPalindrome(String phrase) {
            int bitVector = 0;
            for (char c : phrase.toCharArray()) {
                int i = getCharCode(c);
                if (i != -1) {
                    bitVector = toggleBit(bitVector, i);
                }
            }
            return bitVector == 0 || (bitVector & (bitVector - 1)) == 0;
        }

        private static int toggleBit(int bitVector, int i) {
            if (i < 0) {
                return bitVector;
            }
            int mask = 1 << i;
            return (bitVector & mask) == 0 ? bitVector | mask : bitVector & ~mask;
        }
    }

    private static boolean checkAllEvenOrSingleOdd(int[] frequencyTable) {
        boolean foundOdd = false;
        for (int count : frequencyTable) {
            if (count % 2 != 0) {
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }

    private static int[] createFrequencyTable(String phrase) {
        int[] table = new int[26];
        for (char c : phrase.toCharArray()) {
            int i = getCharCode(c);
            if (i != -1) {
                table[i]++;
            }
        }
        return table;
    }

    private static int getCharCode(char c) {
        int start = Character.getNumericValue('a');
        int end = Character.getNumericValue('z');
        int value = Character.getNumericValue(c);
        return start <= value && value <= end ? value - start : -1;
    }
}
