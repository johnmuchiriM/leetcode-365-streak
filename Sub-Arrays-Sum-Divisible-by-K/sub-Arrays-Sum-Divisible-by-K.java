class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // Loop through the array while finding the sum. If the sum is divisible by the k to 0, jump to the next element add subsequent elements until the % is zero, continue with this until you can't find a reminder of zero'

        int n = nums.length;
        int prefixMod = 0, result = 0;

        //There are k mod groups 0,...k-1
        int[] modGroups = new int[k];
        modGroups[0] = 1;

        for(int num:nums){
            //Take modulo twice to avoid negative remainders.
            prefixMod = (prefixMod + num % k + k) % k;
            // Add the count of subarrays that have the same remainder as the current
            // one to cancel out the remainders.
            result += modGroups[prefixMod];
            modGroups[prefixMod]++;
        }
        

        return result;
        
    }
}

//https://leetcode.com/problems/subarray-sums-divisible-by-k/solutions/2913063/subarray-sums-divisible-by-k/
