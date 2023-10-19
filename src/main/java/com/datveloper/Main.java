package com.datveloper;

import com.datveloper.leetcode.RemoveElement;
import com.datveloper.leetcode.RotateArray;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        new RotateArray.Solution2().rotate(nums, k);
        System.out.println(nums);
    }
}