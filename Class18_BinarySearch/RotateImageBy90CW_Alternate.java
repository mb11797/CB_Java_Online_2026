class Solution {

    public void swap(int[][] matrix, int row, int col){
        int temp = matrix[row][col];
        matrix[row][col] = matrix[col][row];
        matrix[col][row] = temp;
    }

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void reverse(int[] arr){
        int beg = 0, en = arr.length-1;
        while(beg < en){
            swap(arr, beg, en);
            beg++;
            en--;
        }
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // ToDo: Transpose of Matrix
        for(int row=0; row<n; row++){
            for(int col=0; col<=row; col++){
                swap(matrix, row, col);
            }
        }

        // ToDo: Mirror of Matrix
        for(int[] row: matrix){
            reverse(row);
        }
        return;
    }
}