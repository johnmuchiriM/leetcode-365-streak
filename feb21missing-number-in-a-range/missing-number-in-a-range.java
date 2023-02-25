class Solution {
    public int missingNumber(int[] nums) {
        int ans = 0;
        for(int i =0;i<nums.length;i++){
            ans^=nums[i];
            ans^=i+1;
        }
        return ans;
        
    }
}

//The I guess the solution uses XOR Bit Manipulation where ans^=nums[i]; lines return all the values of present in the nums.
//ans^=i+1; cancels all the present XOR values and returns only the missing XOR value. i+1 ensures we loop through all the elements cause the missing one can be anywhere.

//Solution: https://leetcode.com/problems/missing-number/solutions/3047789/accepted-easy-solution-short-simple-best-method/
