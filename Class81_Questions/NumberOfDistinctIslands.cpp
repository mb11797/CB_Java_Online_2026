class Solution {
public:
    
    void dfs(vector<vector<int>>& grid, int row, int col, string &pattern){
        grid[row][col] = 2;
        if(col+1 < grid[0].size() && grid[row][col+1] == 1){
            pattern += "r";
            dfs(grid, row, col+1, pattern);
        }
        
        if(row+1 < grid.size() && grid[row+1][col] == 1){
            pattern += "d";
            dfs(grid, row+1, col, pattern);
        }
        
        if(col-1 >= 0 && grid[row][col-1] == 1){
            pattern += "l";
            dfs(grid, row, col-1, pattern);
        }
        
        if(row-1 >= 0 && grid[row-1][col] == 1){
            pattern += "u";
            dfs(grid, row-1, col, pattern);
        }
        
        pattern += "b"; // for backtracking
    }
    
    int numDistinctIslands(vector<vector<int>>& grid) {
        int nRows = grid.size();
        int nCols = grid[0].size();
        
        unordered_set<string> distinctIslands;
        
        for(int i=0; i<nRows; i++){
            for(int j=0; j<nCols; j++){
                if(grid[i][j] == 1){
                    string pattern = "x";
                    dfs(grid, i, j, pattern);
                    distinctIslands.insert(pattern);
                }
            }
        }
        
        return distinctIslands.size();
    }
};