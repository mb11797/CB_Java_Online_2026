class Solution {
    public int multiply(int a, int b){
        int ans = 1;
        for(int i=0; i<b; i++){
            ans = ans * a;
        }
        
        return ans;
    }
    
    public int nthRoot(int n, int m) {
        // code here
        int low = 0, high = m;
        
        while(low <= high){
            int mid = (low + high) / 2;
            
            int mid_power_n = multiply(mid, n);
            if(mid_power_n < m){
                low = mid + 1;
            }
            else if (mid_power_n > m){
                high = mid - 1;
            }
            else{
                // multiply(mid, n) == m
                return mid;
            }
        }
        
        return -1;
    }
}