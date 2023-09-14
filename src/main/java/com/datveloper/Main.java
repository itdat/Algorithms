package com.datveloper;

import com.datveloper.crackingthecodinginterview.PalindromePermutation;

public class Main {
    public static void main(String[] args) {
        boolean check1 = PalindromePermutation.Solution1.isPermutationOfPalindrome("Tact Coa");
        boolean check2 = PalindromePermutation.Solution2.isPermutationOfPalindrome("Tact Coa");
        boolean check3 = PalindromePermutation.Solution3.isPermutationOfPalindrome("Tact Coa");
        System.out.println(check1);
        System.out.println(check2);
        System.out.println(check3);
    }
}