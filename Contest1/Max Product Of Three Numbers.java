//Max Product Of Three Numbers.java
//https://leetcode.com/problems/maximum-product-of-three-numbers/description/


class Solution {
    public int maximumProduct(int[] nums) {
        //practice - 16/04/24

        int h = nums.length;
        //sort the nos - -ve nos and +nos
        Arrays.sort(nums);

        //case1. -ve x -ve = +ve and +ve x +ve(max) = max
        int m1 = (nums[0]*nums[1])*nums[h-1];

        //case2. +ve(max)*+ve(max-1)*+ve(max-2) = maxxxxx
        int m2 = (nums[h-1])*(nums[h-2])*(nums[h-3]);

        return m1>m2 ? m1:m2;
    }
}
