package com.datveloper;

import com.datveloper.leetcode.RemoveElement;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        new RemoveElement.Solution().removeElement(nums, val);
        System.out.println(nums);
    }
}