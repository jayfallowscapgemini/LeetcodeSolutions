/*
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/

class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1; // if there is one way to climb a single step
        int dp[] = new int[n + 1]; // new array dp of size n + 1. Each element represents the number of ways to climb i steps. 
        dp[1] = 1; // one step
        dp[2] = 2; // two steps

        for (int i = 3; i <= n; i++) { // start at 3 steps until reaching the top
            dp[i] = dp[i - 1] + dp[i - 2]; // index at dp is dependant on positive result of 
        }
        return dp[n];
    }
}
