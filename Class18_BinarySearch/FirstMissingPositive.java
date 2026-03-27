class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        // Step-1: Change all elements which are 0 or -ve to n+1
        for(int i=0; i<n; i++){
            if(nums[i] <= 0){
                nums[i] = n+1;
            }
        }

        // Step-2: Iterate on each element, and Mark / Put identifiers 
        // (i.e, make element as -ve) corresponding to these elements if possible
        for(int i=0; i<n; i++){
            if(Math.abs(nums[i]) <= n){
                nums[Math.abs(nums[i]) - 1] = -1 * Math.abs(nums[Math.abs(nums[i]) - 1]);
            }
        }


        // Step-3: Iterate from starting index to end index and 
        // check whichever element with index i is still +ve, if found, then, 
        // first missing positive = i+1 
        for(int i=0; i<n; i++){
            if(nums[i] > 0){
                return i+1;
            }
        }

        return n+1;
    }
}