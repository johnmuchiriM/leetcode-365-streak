class Solution {
    public int climbStairs(int n) {
        int prev1=1, prev2=1;

        for(int i =2; i<=n; i++){
            int total = prev1 + prev2;
            prev1 = total;
            
        }

        return prev1;
        
    }
}

// https://leetcode.com/problems/climbing-stairs/solutions/2902550/daily-leetcoding-challenge-december-day-12/
