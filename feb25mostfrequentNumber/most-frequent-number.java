class Solution {
    public int majorityElement(int[] nums) {
 
         Arrays.sort(nums);
  
        // find the max frequency using linear traversal
        int max_count = 1, res = nums[0];
        int curr_count = 1;
  
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                curr_count++;
            else
                curr_count = 1;
  
            if (curr_count > max_count) {
                max_count = curr_count;
                res = nums[i - 1];
            }
        }
        return res;
        
        
        
    }
  
}

//https://www.geeksforgeeks.org/frequent-element-array/
