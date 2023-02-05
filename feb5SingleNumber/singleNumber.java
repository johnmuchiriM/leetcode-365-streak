class Solution {
    public int singleNumber(int[] nums) {
        int ans =0; // number XOR(Exclusive OR) 0 = number
        //2 XOR 2 = 0
        for(int i =0; i<nums.length; i++){
            ans ^= nums[i]; // This is the same as ans = ans ^ nums[i];
        }
        return ans;
        
    }
}

//https://leetcode.com/problems/single-number/solutions/3021354/java-easy-solution-beats-100-runtime-1ms-bit-manipulation/
