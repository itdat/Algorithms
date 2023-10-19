package com.datveloper.leetcode;

public class RotateArray {
    public static class Solution1 {
        public void rotate(int[] nums, int k) {
            int[] tmp = new int[nums.length * 2];
            for (int i = 0; i < tmp.length; i++) {
                tmp[i] = nums[i % nums.length];
            }
            for (int i = nums.length - k; i <  2 * nums.length - k; i++) {
                nums[i - nums.length + k] = tmp[i];
            }
        }
    }

    public static class Solution2 {
        public void rotate(int[] nums, int k) {
            int h = k % nums.length;
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, h - 1);
            reverse(nums, h, nums.length - 1);
        }

        private void reverse(int[] nums, int start, int end) {
            int length = end - start + 1;
            for (int i = start; i < start + length / 2 ; i++) {
                int tmp = nums[i];
                nums[i] = nums[end - i + start];
                nums[end - i + start] = tmp;
            }
        }
    }
}
