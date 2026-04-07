class Solution {
    int floorSqrt(int n) {
        // code here
        int low = 1, high = n;
        int ans = 0;      
        while(low <= high){
            int mid = (low + high) / 2;
            
            if(mid * mid < n){
                low = mid + 1;
                ans = mid;
            }
            else if(mid * mid > n){
                high = mid - 1;
            }
            else{
                // mid * mid == n
                return mid;
            }
        }
        
        return ans;
    }
}