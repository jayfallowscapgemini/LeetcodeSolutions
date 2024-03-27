class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // create a hashmap to keep track of elements and indexes

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) { // if the pair has been found
                return new int[] {i, map.get(target - nums[i])}; // create a new integer array returning i, and the index value of the second value
            }

            map.put(nums[i], i); // put in current elements
        }

        return new int[0]; // return an empty array if the pair has not been found
    }
}
