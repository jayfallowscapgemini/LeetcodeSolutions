/*
You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.
*/

class Solution {
    public boolean canJump(int[] nums) {
        int lastGoodIndexPosition = nums.length - 1; 
        for (int i = nums.length - 1; i >= 0; i--) { // backwards traversal
            if (i + nums[i] >= lastGoodIndexPosition) { // if the index position is good
                lastGoodIndexPosition = i; // change it one across
            }
        }

        return lastGoodIndexPosition == 0;
    }
}
