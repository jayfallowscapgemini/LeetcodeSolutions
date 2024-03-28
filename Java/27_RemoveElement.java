Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.

class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int valid_size = 0; // initialise index value to represent the current position for the next non-target element 
        for (int i = 0; i < nums.length; i++) { // iterate through each element of the input array
            if (nums[i] != val) { // if nums[i] is not equal to val, it means it is a non-target element
                nums[valid_size] = nums[i]; // set nums[valid_size} to nums[i] to store the non-target element at the current index position
                valid_size++; // increment valid_size by 1 to move to the next position for the next non-target element
            } // continue until all elements in the array have been processed. 
        }
        return valid_size; // return the value of valid_size, which represents the length of the modified array. 
    }
}
