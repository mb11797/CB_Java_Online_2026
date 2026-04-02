public class Solution {
    
    public boolean isThresholdAcceptable(int[] boards, int nPainters, long threshold){
        int currentPainterPaintedLen = 0;
        int painterCount = 1;
        
        int nBoards = boards.length;
        
        int i = 0;
        while(i < nBoards){
            if(currentPainterPaintedLen + boards[i] <= threshold){
                currentPainterPaintedLen += boards[i];
            }
            else{
                painterCount++;
                currentPainterPaintedLen = boards[i];
            }
            
            if(painterCount > nPainters){
                return false;
            }
            
            i++;  
        }
        
        return true;
    }
    
    public int paint(int nPainters, int B, int[] boards) {
        int nBoards = boards.length;
        long totalBoardLen = 0;
        int maxBoardLen = Integer.MIN_VALUE;
        for(int i=0; i<nBoards; i++){
            totalBoardLen += boards[i];
            maxBoardLen = Math.max(maxBoardLen, boards[i]);
        }
        
        long low = maxBoardLen;
        long high = totalBoardLen;
        long ans = 0;
        // Apply binary search on monotonic range from low to high
        while(low <= high){
            long mid = (low + high) / 2;     // mid -> current assumed threshold
            
            if(isThresholdAcceptable(boards, nPainters, mid)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        
        return (int)((ans * B) % 10000003);
    }
}
