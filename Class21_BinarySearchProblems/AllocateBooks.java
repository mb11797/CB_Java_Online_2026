public class Solution {
    
    public boolean isThisThresholdConfigAcceptable(int[] books, int nStudents, int threshold){
        int nBooks = books.length;
        int studentCount = 1;
        int sum = threshold;
        
        int i=0;
        while(i < nBooks){
            if(sum - books[i] >= 0){
                sum -= books[i];
                i++;
            }
            else{
                studentCount++;
                sum = threshold;
            }
            
            if(studentCount > nStudents){
                return false;
            }
        }
        
        return true;
    }
    
    public int books(int[] books, int nStudents) {
        int nBooks = books.length;
        
        if(nBooks < nStudents){
            return -1;
        }
        
        int totalPages = 0;
        int maxPages = Integer.MIN_VALUE;
        for(int i=0; i<nBooks; i++){
            totalPages += books[i];
            maxPages = Math.max(maxPages, books[i]);
        }
        
        int low = maxPages;
        int high = totalPages;
        
        int ans = -1;
        // Apply Binary Search in Monotonic Range from low to high
        while(low <= high){
            int mid = (low + high) / 2;     // mid -> current assumed threshold
            
            if(isThisThresholdConfigAcceptable(books, nStudents, mid)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        
        return ans;
    }
}
