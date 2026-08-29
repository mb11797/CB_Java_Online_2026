public class Solution {
    /**
     * @param grid: a list of lists of integers
     * @return: return an integer, denote the number of distinct islands
     */

    public void dfs(int[][] grid, int row, int col, StringBuilder pattern){
        int nRows = grid.length; 
        int nCols = grid[0].length;

        grid[row][col] = 0;

        if(col+1 < nCols && grid[row][col+1] == 1){
            pattern.append("R");
            dfs(grid, row, col+1, pattern);
        }

        if(row+1 < nRows && grid[row+1][col] == 1){
            pattern.append("D");
            dfs(grid, row+1, col, pattern);
        }

        if(col-1 >= 0 && grid[row][col-1] == 1){
            pattern.append("L");
            dfs(grid, row, col-1, pattern);
        }

        if(row-1 >= 0 && grid[row-1][col] == 1){
            pattern.append("U");
            dfs(grid, row-1, col, pattern);
        }

        pattern.append("B");
    }

    public int numberofDistinctIslands(int[][] grid) {
        // write your code here

        Set<String> patternSet = new HashSet<>();      

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    StringBuilder pattern = new StringBuilder("x");
                    dfs(grid, i, j, pattern);
                    patternSet.add(pattern.toString());
                }
            }
        }

        return patternSet.size();
    }
}